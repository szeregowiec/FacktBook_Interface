package hello;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;
import database.Data;
import database.Geographic_coordinates;
import database.Geography;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

@RestController
public class GreetingController {




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

        Gson gson = new Gson();
        gson.toJsonTree(data.getGeography().getGeographic_coordinates(), Geographic_coordinates.class);

        //System.out.println("to jest to co zostaje zwrocone " +data.getGeography().getNatural_hazards().size());


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



    public static Object queryOne(String s){
//
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

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Query query =  entityManager.createQuery(s);

        Object obj = query.getSingleResult();


        entityManager.getTransaction().commit();
        entityManagerFactory.close();
        return obj;
    }

    public static List<String> queryList(String s){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Query query =  entityManager.createQuery(s);
        List<String> list = query.getResultList();


        entityManager.getTransaction().commit();
        entityManagerFactory.close();
        return list;
    }
}