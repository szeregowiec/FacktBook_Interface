package hello;

import database.Geography;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.*;


/**
 * Algorytm indeksowania, polega na pobraniu wskazanych rekordów z bazy danych, następnie pobraniu tokenów i zapisaniu jako obiekt klasy index.
 */
public class IndexAlgorithm {

    static Map<String,Set<Index>> mapIndex = new HashMap<>();

    /**
     * metoda tokenizuje indexy z rekordów znajdujących się w tabeli Geography
     * @param entityManager
     */
    public static void geography(EntityManager entityManager) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select g from Geography g");
        List<Geography> list = query.getResultList();
        entityManager.getTransaction().commit();


        String s;
        StringTokenizer st;
        for(Geography g : list){

            s= g.getClimate().replaceAll("[^a-zA-Z]"," ");
            s = s.toLowerCase();
            st = new StringTokenizer(s);
            addIndex(st,"Geography", g.getId(), "climate", "select g.climate, d.name from Geography g, Data d where g.id = "+g.getId() +" and d.geography ="+g.getId());

            s = g.getLocation().replaceAll("[^a-zA-Z]"," ");
            s = s.toLowerCase();
            st = new StringTokenizer(s);
            addIndex(st,"Geography", g.getId(), "location","select g.location, d.name from Geography g, Data d where g.id = "+g.getId() +" and d.geography ="+g.getId());

            if(g.getTerrain()!=null) {
                s = g.getTerrain().replaceAll("[^a-zA-Z]", " ");
                s = s.toLowerCase();
                st = new StringTokenizer(s);
                addIndex(st, "Geography", g.getId(), "terrain", "select g.terrain, d.name from Geography g, Data d where g.id = " + g.getId() + " and d.geography =" + g.getId());
            }

            if(g.getPopulation_distribution()!=null) {
                s = g.getPopulation_distribution().replaceAll("[^a-zA-Z]", " ");
                s = s.toLowerCase();
                st = new StringTokenizer(s);
                addIndex(st, "Geography", g.getId(), "population_distribution", "select g.population_distribution, d.name from Geography g, Data d where g.id = " + g.getId() + " and d.geography =" + g.getId());
            }

            if(g.getNote()!=null) {
                s = g.getNote().replaceAll("[^a-zA-Z]", " ");
                s = s.toLowerCase();
                st = new StringTokenizer(s);
                addIndex(st, "Geography", g.getId(), "note", "select g.note, d.name from Geography g, Data d where g.id = " + g.getId() + " and d.geography =" + g.getId());
            }




        }


        System.out.println(mapIndex);

    }

    /**
     * metoda dodje indeksy do mapy(K,V), gdzie K to token, V to lista obiektów klasy Index, w których zawiera się dany token
     * @param st StringTokenizer, dostarcza tokeny
     * @param table nazwa tabeli, z które pobierane są tokeny
     * @param id numer id rekordu z tabeli
     * @param column nazwa kolumny z tableli
     * @param query zapytanie, dzięki, którmu możemy dostać konkretny wpis z kolumny w konkretnej tabli i określonego id
     */
    public static void addIndex(StringTokenizer st, String table, int id, String column, String query){
        String token;
        while(st.hasMoreTokens()){
            token = st.nextToken();
            if(mapIndex.keySet().contains(token)){
                mapIndex.get(token).add(new Index(table,id,column,query));
            }else{

                Set<Index> tmp = new HashSet<>();
                tmp.add(new Index(table,id ,column,query));
                mapIndex.put(token,tmp);
            }

        }
    }

    /**
     * metoda zwraca liste obiektów klasy Result, gdzie obiekty klasy Result składaja się z nazwy tabeli, nazwy państwa, nazwy kolumny i wpisu, w którym
     * znajduje się szukana fraza
     * @param entityManager obiekt, do łącznie się z bazą danych
     * @param key szykana fraza
     * @return lista obiekót klasy Result
     */
    public static ArrayList<Result> getEntries(EntityManager entityManager,String key){
        key = key.toLowerCase();
        System.out.println("Token : => "+key);
        StringTokenizer st = new StringTokenizer(key);
        ArrayList<Index> first = new ArrayList<>();


        String index = st.nextToken();
        if(mapIndex.containsKey(index)){
            first.addAll(mapIndex.get(index));
        }



        ArrayList<Index> second = new ArrayList<>();
        while(st.hasMoreTokens()){
            index = st.nextToken();
            if(mapIndex.containsKey(index)){
                second.addAll(mapIndex.get(index));
                first.retainAll(second);
            }
        }



        ArrayList<Result> result = new ArrayList<>();
        List<Object[]>list;

        for(Index i : first){
            list = transaction(entityManager,i.getQuery());
            System.out.println(list.get(0)[0]);
            result.add(new Result(i.getTable(),list.get(0)[1].toString(),i.getColumn(),list.get(0)[0].toString() ));
        }

        ArrayList<Result> endResult = new ArrayList<>();
        for(Result r : result){
            if(r.getResult().toLowerCase().contains(key)){
                endResult.add(r);
            }
        }

        for(Result r : endResult){
            System.out.println(r);
        }


return endResult;
    }



    private static List<Object[]> transaction(EntityManager entityManager, String str){
        entityManager.getTransaction().begin();
            Query query = entityManager.createQuery(str);
            List<Object[]> list = query.getResultList();
        entityManager.getTransaction().commit();
        return list;
    }


    /**
     * Klasa, której obiekty reprezentują indexy znalezione w bazie danych
     * String table - nazwa tebeli
     * int id - id wpisu w tabeli
     * String column - nazwa kolumny w tabeli
     * String query - zapytanie zwracające dany wpis
     */
    static class Index implements Comparator<Index>{

        String table;
        int id;
        String column;
        String query;

        Index(String table, int id, String column, String query){
            this.table=table;
            this.id=id;
            this.column=column;
            this.query=query;
        }


        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public String getTable() {
            return table;
        }

        public void setTable(String table) {
            this.table = table;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getColumn() {
            return column;
        }

        public void setColumn(String column) {
            this.column = column;
        }

        public String toString(){
            return table+" "+id+" "+column+ " ";
        }

        @Override
        public int compare(Index index1, Index index2) {
            if(index1.query.equals(index2.query)){
                return 1;
            }else{
                return 0;
            }
        }
        @Override
        public boolean equals(Object obj){
            if(this == obj) return true;
            if(obj == null) return false;
            if(this.getClass() != obj.getClass()) return false;
            Index index = (Index) obj;


            if(this.query.equals(index.query)){
                return true;
            }else {
                return false;
            }
        }

    }

}
