package hello;

import clojure.lang.Obj;
import com.sun.org.apache.regexp.internal.RE;
import database.Geography;
import database.In;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.*;

public class IndexAlgorithm {
//    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
//    static EntityManager entityManager = entityManagerFactory.createEntityManager();
    static Map<String,Set<Index>> mapIndex = new HashMap<>();


    public static void geography(EntityManager entityManager) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select g from Geography g");
        List<Geography> list = query.getResultList();
        entityManager.getTransaction().commit();


        String s;
        StringTokenizer st;
        for(Geography g : list){
            s= g.getClimate().replaceAll("[^a-zA-Z]"," ");
            st = new StringTokenizer(s);
            addIndex(st,"Geography", g.getId(), "climate", "select g.climate, d.name from Geography g, Data d where g.id = "+g.getId() +" and d.geography ="+g.getId());

            s = g.getLocation().replaceAll("[^a-zA-Z]"," ");
            st = new StringTokenizer(s);
            addIndex(st,"Geography", g.getId(), "location","select g.location, d.name from Geography g, Data d where g.id = "+g.getId() +" and d.geography ="+g.getId());






        }
        System.out.println(mapIndex);

    }

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

    public static ArrayList<Result> getEntries(EntityManager entityManager,String key){

        StringTokenizer st = new StringTokenizer(key);
        ArrayList<Index> first = new ArrayList<>();
        first.addAll(mapIndex.get(st.nextToken()));

//        System.out.println("first length "+first.size());
//        System.out.println(first);
        ArrayList<Index> second = new ArrayList<>();
        while(st.hasMoreTokens()){
            second.addAll(mapIndex.get(st.nextToken()));
            first.retainAll(second);
           // System.out.println("second length "+second.size());
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
            if(r.getResult().contains(key)){
                endResult.add(r);
            }
        }

        for(Result r : endResult){
            System.out.println(r);
        }

        System.out.println("this is the end");

return endResult;
    }



    private static List<Object[]> transaction(EntityManager entityManager, String str){
        entityManager.getTransaction().begin();
            Query query = entityManager.createQuery(str);
            List<Object[]> list = query.getResultList();
        entityManager.getTransaction().commit();
        return list;
    }



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

//        Index(String query){
//            this.query=query;
//        }

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
            return table+" "+id+" "+column+ " "+query;
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
