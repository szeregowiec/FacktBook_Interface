package hello;

import java.util.*;

import com.google.gson.Gson;
import database.Data;
import database.Geographic_coordinates;
import database.Geography;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

@RestController
public class GreetingController {

   static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
    static EntityManager entityManager = entityManagerFactory.createEntityManager();



    @GetMapping("/countries")
    public List<String> greeting(@RequestParam(value="name", defaultValue="World")String id) {
        List<String> lista = queryList("select d.name from Data d");
        JSONObject json = new JSONObject();
        try {
            json.put("list",lista);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return lista;
    }

    @GetMapping(value = "/countries/{country}/geography", produces = "application/json")
    public Geography geography(@PathVariable("country") String country) {
        Object obj = queryOne("select d from Data d where d.name='"+country+"'");
        Data data = (Data) obj;
        return data.getGeography();
    }

    @GetMapping(value = "/continents", produces = "application/json")
    public Set<String> continents() {

        List<String> lista = queryList("select g.map_references from Geography g");
        Set<String> set = new HashSet<>();
        set.addAll(lista);

        return set;
    }

    @GetMapping(value = "/continents/{continent}", produces = "application/json")
    public List<String> continent(@PathVariable("continent") String continent) {

        List<String> lista = queryList("select d.name from Data d, Geography g where g.map_references='"+continent+"' and d.geography=g.id");


        return lista;
    }

    @GetMapping(value = "/countries/sort/geography/coastline", produces = "application/json")
    public List<CountrySort>  sortGeographyCoastline() {

        entityManager.getTransaction().begin();
        Query query =  entityManager.createQuery("select d from Data d ");
        List<Data> list = query.getResultList();
        entityManager.getTransaction().commit();


        Map<String,Float> map = new HashMap<>();
        for(Data d : list){
            map.put(d.getName(),d.getGeography().getCoastline().getValue());
        }
        ValueComparator bvc = new ValueComparator(map);
        TreeMap<String, Float> sorted_map = new TreeMap<String, Float>(bvc);

        sorted_map.putAll(map);


        List<CountrySort> sorted_country = new LinkedList<>();
        for(Map.Entry<String,Float> e : sorted_map.entrySet()){

            CountrySort cs = new CountrySort(e.getKey(),e.getValue().floatValue());
//            //Float f =  sorted_map.get(s);
//            if(sorted_map.get(s) == null){
//                cs.setValue(0);
//            }else{
//                cs.setValue(sorted_map.get(s).floatValue());
//            }
//
//
            sorted_country.add(cs);

        }

        return sorted_country;
    }

    public static Object queryOne(String s){

//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//
//        Query query =  session.createQuery(s);
//
//        Object obj = query.getSingleResult();
//
//        session.getTransaction().commit();
//        session.close();

//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Query query =  entityManager.createQuery(s);

        Object obj = query.getSingleResult();


        entityManager.getTransaction().commit();
//        entityManagerFactory.close();
        return obj;
    }

    public static List<String> queryList(String s){
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
//
//        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Query query =  entityManager.createQuery(s);
        List<String> list = query.getResultList();


        entityManager.getTransaction().commit();
       // entityManagerFactory.close();
        return list;
    }




}

class CountrySort{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    String name;
    float value;
    CountrySort(String name, float f){
        this.name=name;
        value=f;

    }
        }

class ValueComparator implements Comparator<String> {
    Map<String, Float> base;

    public ValueComparator(Map<String, Float> base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with
    // equals.
    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
    }
}