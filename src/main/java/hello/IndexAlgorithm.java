package hello;

import database.Geography;
import database.In;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.*;

public class IndexAlgorithm {
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
    static EntityManager entityManager = entityManagerFactory.createEntityManager();
    static Map<String,List<Index>> mapIndex = new HashMap<>();


    public static void geography() {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select g from Geography g");
        List<Geography> list = query.getResultList();
        entityManager.getTransaction().commit();


        String s;
        for(Geography g : list){
            s= g.getClimate().replaceAll(";","");
            StringTokenizer st = new StringTokenizer(s);



            System.out.println("=========== " +s);
            String token;
            while(st.hasMoreTokens()){
                token = st.nextToken();
                //System.out.println(token);
                if(mapIndex.keySet().contains(token)){
                    //System.out.println("1111111111111111111111");
                    mapIndex.get(token).add(new Index("Geography",g.getId(),"climate"));
                }else{

                    List<Index> tmp = new LinkedList<>();
                    tmp.add(new Index("Geography",g.getId(),"climate"));
                    mapIndex.put(token,tmp);
                }

            }

        }
        System.out.println(mapIndex);

    }


    public static void getEntry(String key){

        List<Index> entries = mapIndex.get(key);
        System.out.println("result for winters " +entries.toString());
        for(Index i : entries){
            String result = transaction("select g.climate from "+i.table+" g where g.id = "+i.id);
            System.out.println("entry -> " +result);
        }



    }

    private static String transaction(String str){
        entityManager.getTransaction().begin();
            Query query = entityManager.createQuery(str);
            String obj = (String) query.getSingleResult();
        entityManager.getTransaction().commit();
        return obj;
    }

    static class Index{
        String table;
        int id;
        String column;

        Index(String table, int id, String column){
            this.table=table;
            this.id=id;
            this.column=column;
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
            return table+" "+id+" "+column+ " \n";
        }
    }

}
