package hello;

import java.util.*;

import database.Geography;
import database.People;
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
    public List<String> countries() {
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
        Object obj = queryOne("select g from Geography g, Data d where d.name='"+country+"' and d.geography=g.id");
        Geography data = (Geography) obj;
        return data;
    }

    @GetMapping(value = "/countries/{country}/people", produces = "application/json")
    public People people(@PathVariable("country") String country) {
        Object obj = queryOne("select p from People p, Data d where d.name='"+country+"' and d.people=p.id");
        People data = (People) obj;
        return data;
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


    //////////////////////////////////////////////////////////////////////////////////////--------------------------SORT--------------------------------------
    //rozwązac poroblem z wysyłaniem HashMapy ! problem z konwersją na json ?

    @GetMapping(value = "/countries/sort/geography/coastline", produces = "application/json")
    public List<CountrySort>  sortGeographyCoastline() {

        return sortCountries("select d.name, c.value from Data d, Geography g, " +
                "ValueAndUnits c where d.geography=g.id and g.coastline=c.id ");
    }

    @GetMapping(value = "/countries/sort/geography/total", produces = "application/json")
    public List<CountrySort>  sortGeographyTotal() {

        return sortCountries("select d.name, t.value from Data d, Geography g, Area a, ValueAndUnits t " +
                "where d.geography=g.id and g.area=a.id and a.total=t.id ");
    }

    @GetMapping(value = "/countries/sort/geography/land", produces = "application/json")
    public List<CountrySort>  sortGeographyLand() {

          return sortCountries("select d.name, l.value from Data d, Geography g, Area a, ValueAndUnits l " +
                "where d.geography=g.id and g.area=a.id and a.land=l.id ");
    }

    @GetMapping(value = "/countries/sort/geography/water", produces = "application/json")
    public List<CountrySort>  sortGeographyWater() {
        return sortCountries("select d.name, w.value from Data d, Geography g, Area a, ValueAndUnits w " +
                "where d.geography=g.id and g.area=a.id and a.water=w.id ");
    }

    @GetMapping(value = "/countries/sort/geography/land_boundaries", produces = "application/json")
    public List<CountrySort>  sortGeographyLand_Boundaries() {
        return sortCountries("select d.name, t.value from Data d, Geography g, Land_boundaries lb, ValueAndUnits t " +
                "where d.geography=g.id and g.land_boundaries=lb.id and lb.total=t.id ");
    }

    @GetMapping(value = "/countries/sort/geography/mean_elevation", produces = "application/json")
    public List<CountrySort>  sortGeographyMean_Elevation() {
        return sortCountries("select d.name, m.value from Data d, Geography g, Elevation e, ValueAndUnits m " +
                "where d.geography=g.id and g.elevation=e.id and e.mean_elevation=m.id ");
    }

    @GetMapping(value = "/countries/sort/geography/lowest_point", produces = "application/json")
    public List<CountrySort>  sortGeographyLowest_Point() {
        return sortCountries("select d.name, p.value from Data d, Geography g, Elevation e, Point lp, ValueAndUnits p " +
                "where d.geography=g.id and g.elevation=e.id and e.lowest_point=lp.id and lp.elevation=p.id");
    }

    @GetMapping(value = "/countries/sort/geography/highest_point", produces = "application/json")
    public List<CountrySort>  sortGeographyHighest_Point() {
        return sortCountries("select d.name, p.value from Data d, Geography g, Elevation e, Point hp, ValueAndUnits p " +
                "where d.geography=g.id and g.elevation=e.id and e.highest_point=hp.id and hp.elevation=p.id");
    }

    @GetMapping(value = "/countries/sort/geography/agricultural_land_total", produces = "application/json")
    public List<CountrySort>  sortGeographyAgricultural_land_total() {
        return sortCountries("select d.name, alt.value from Data d, Geography g, Land_use lu, By_sector bs, ValueAndUnits alt " +
                "where d.geography=g.id and g.land_use=lu.id and lu.by_sector=bs.id and bs.agricultural_land_total=alt.id");
    }

    @GetMapping(value = "/countries/sort/geography/agricultural_land_arable_land", produces = "application/json")
    public List<CountrySort>  sortGeographyAgricultural_land_arable_land() {
        return sortCountries("select d.name, alt.value from Data d, Geography g, Land_use lu, By_sector bs, ValueAndUnits alt " +
                "where d.geography=g.id and g.land_use=lu.id and lu.by_sector=bs.id and bs.agricultural_land_arable_land=alt.id");
    }

    @GetMapping(value = "/countries/sort/geography/agricultural_land_permanent_crops", produces = "application/json")
    public List<CountrySort>  sortGeographyAgricultural_land_permanent_crops() {
        return sortCountries("select d.name, alt.value from Data d, Geography g, Land_use lu, By_sector bs, ValueAndUnits alt " +
                "where d.geography=g.id and g.land_use=lu.id and lu.by_sector=bs.id and bs.agricultural_land_permanent_crops=alt.id");
    }

    @GetMapping(value = "/countries/sort/geography/agricultural_land_permanent_pasture", produces = "application/json")
    public List<CountrySort>  sortGeographyAgricultural_land_permanent_pasture() {
        return sortCountries("select d.name, alt.value from Data d, Geography g, Land_use lu, By_sector bs, ValueAndUnits alt " +
                "where d.geography=g.id and g.land_use=lu.id and lu.by_sector=bs.id and bs.agricultural_land_permanent_pasture=alt.id");
    }

    @GetMapping(value = "/countries/sort/geography/forest", produces = "application/json")
    public List<CountrySort>  sortGeographyForest() {
        return sortCountries("select d.name, alt.value from Data d, Geography g, Land_use lu, By_sector bs, ValueAndUnits alt " +
                "where d.geography=g.id and g.land_use=lu.id and lu.by_sector=bs.id and bs.forest=alt.id");
    }
///////////////////////PEOPLE sort
    @GetMapping(value = "/countries/sort/people/population", produces = "application/json")
    public List<CountrySort>  sortGeographyPopulation() {
        return sortCountries("select d.name, po.total from Data d, People p,  Population po " +
                "where d.people=p.id and p.population=po.id ");
    }
    @GetMapping(value = "/countries/sort/people/age_structure/age_0_to_14/percent", produces = "application/json")
    public List<CountrySort>  sortGeographyAge_0_to_14_percent() {
        return sortCountries("select d.name, maf.percent from Data d, People p,  Age_structure a, MalesAndFemales maf " +
                "where d.people=p.id and p.age_structure=a.id and a.age_0_to_14=maf.id");
    }
    @GetMapping(value = "/countries/sort/people/age_structure/age_0_to_14/males", produces = "application/json")
    public List<CountrySort>  sortGeographyAge_0_to_14_males() {
        return sortCountries("select d.name, maf.males from Data d, People p,  Age_structure a, MalesAndFemales maf " +
                "where d.people=p.id and p.age_structure=a.id and a.age_0_to_14=maf.id");
    }
    @GetMapping(value = "/countries/sort/people/age_structure/age_0_to_14/females", produces = "application/json")
    public List<CountrySort>  sortGeographyAge_0_to_14_females() {
        return sortCountries("select d.name, maf.females from Data d, People p,  Age_structure a, MalesAndFemales maf " +
                "where d.people=p.id and p.age_structure=a.id and a.age_0_to_14=maf.id");
    }

    @GetMapping(value = "/countries/sort/people/age_structure/age_15_to_24/percent", produces = "application/json")
    public List<CountrySort>  sortGeographyage_15_to_24_percent() {
        return sortCountries("select d.name, maf.percent from Data d, People p,  Age_structure a, MalesAndFemales maf " +
                "where d.people=p.id and p.age_structure=a.id and a.age_15_to_24=maf.id");
    }
    @GetMapping(value = "/countries/sort/people/age_structure/age_15_to_24/males", produces = "application/json")
    public List<CountrySort>  sortGeographyage_15_to_24_males() {
        return sortCountries("select d.name, maf.males from Data d, People p,  Age_structure a, MalesAndFemales maf " +
                "where d.people=p.id and p.age_structure=a.id and a.age_15_to_24=maf.id");
    }
    @GetMapping(value = "/countries/sort/people/age_structure/age_15_to_24/females", produces = "application/json")
    public List<CountrySort>  sortGeographyage_15_to_24_females() {
        return sortCountries("select d.name, maf.females from Data d, People p,  Age_structure a, MalesAndFemales maf " +
                "where d.people=p.id and p.age_structure=a.id and a.age_15_to_24=maf.id");
    }

    @GetMapping(value = "/countries/sort/people/age_structure/age_25_to_54/percent", produces = "application/json")
    public List<CountrySort>  sortGeographyage_25_to_54_percent() {
        return sortCountries("select d.name, maf.percent from Data d, People p,  Age_structure a, MalesAndFemales maf " +
                "where d.people=p.id and p.age_structure=a.id and a.age_25_to_54=maf.id");
    }
    @GetMapping(value = "/countries/sort/people/age_structure/age_25_to_54/males", produces = "application/json")
    public List<CountrySort>  sortGeographyage_25_to_54_males() {
        return sortCountries("select d.name, maf.males from Data d, People p,  Age_structure a, MalesAndFemales maf " +
                "where d.people=p.id and p.age_structure=a.id and a.age_25_to_54=maf.id");
    }
    @GetMapping(value = "/countries/sort/people/age_structure/age_25_to_54/females", produces = "application/json")
    public List<CountrySort>  sortGeographyage_25_to_54_females() {
        return sortCountries("select d.name, maf.females from Data d, People p,  Age_structure a, MalesAndFemales maf " +
                "where d.people=p.id and p.age_structure=a.id and a.age_25_to_54=maf.id");
    }

    @GetMapping(value = "/countries/sort/people/age_structure/age_55_to_64/percent", produces = "application/json")
    public List<CountrySort>  sortGeographyage_55_to_64_percent() {
        return sortCountries("select d.name, maf.percent from Data d, People p,  Age_structure a, MalesAndFemales maf " +
                "where d.people=p.id and p.age_structure=a.id and a.age_55_to_64=maf.id");
    }
    @GetMapping(value = "/countries/sort/people/age_structure/age_55_to_64/males", produces = "application/json")
    public List<CountrySort>  sortGeographyage_55_to_64_males() {
        return sortCountries("select d.name, maf.males from Data d, People p,  Age_structure a, MalesAndFemales maf " +
                "where d.people=p.id and p.age_structure=a.id and a.age_55_to_64=maf.id");
    }
    @GetMapping(value = "/countries/sort/people/age_structure/age_55_to_64/females", produces = "application/json")
    public List<CountrySort>  sortGeographyage_55_to_64_females() {
        return sortCountries("select d.name, maf.females from Data d, People p,  Age_structure a, MalesAndFemales maf " +
                "where d.people=p.id and p.age_structure=a.id and a.age_55_to_64=maf.id");
    }

    @GetMapping(value = "/countries/sort/people/age_structure/age_65_and_over/percent", produces = "application/json")
    public List<CountrySort>  sortGeographyage_65_and_over_percent() {
        return sortCountries("select d.name, maf.percent from Data d, People p,  Age_structure a, MalesAndFemales maf " +
                "where d.people=p.id and p.age_structure=a.id and a.age_65_and_over=maf.id");
    }
    @GetMapping(value = "/countries/sort/people/age_structure/age_65_and_over/males", produces = "application/json")
    public List<CountrySort>  sortGeographyage_65_and_over_males() {
        return sortCountries("select d.name, maf.males from Data d, People p,  Age_structure a, MalesAndFemales maf " +
                "where d.people=p.id and p.age_structure=a.id and a.age_65_and_over=maf.id");
    }
    @GetMapping(value = "/countries/sort/people/age_structure/age_65_and_over/females", produces = "application/json")
    public List<CountrySort>  sortGeographyage_65_and_over_females() {
        return sortCountries("select d.name, maf.females from Data d, People p,  Age_structure a, MalesAndFemales maf " +
                "where d.people=p.id and p.age_structure=a.id and a.age_65_and_over=maf.id");
    }

    @GetMapping(value = "/countries/sort/people/total_dependency_ratio", produces = "application/json")
    public List<CountrySort>  sortGeographytotal_dependency_ratio() {
        return sortCountries("select d.name, vau.value from Data d, People p,  Ratios r, ValueAndUnits vau " +
                "where d.people=p.id and p.dependency_ratios=r.id and r.total_dependency_ratio=vau.id");
    }



public static List<CountrySort> sortCountries(String queryText){

    entityManager.getTransaction().begin();
    Query query =  entityManager.createQuery(queryText);
    List<Object[]> list = query.getResultList();
    entityManager.getTransaction().commit();

    Map<String,Float> map = new HashMap<>();
    for(Object[] o :list){
        map.put((String)o[0],(Float)o[1]);
    }
    ValueComparator bvc = new ValueComparator(map);
    TreeMap<String, Float> sorted_map = new TreeMap<String, Float>(bvc);
    sorted_map.putAll(map);

    List<CountrySort> sorted_country = new LinkedList<>();
    for(Map.Entry<String,Float> e : sorted_map.entrySet()){
        CountrySort cs = new CountrySort(e.getKey(),e.getValue().floatValue());
        sorted_country.add(cs);
    }
    return sorted_country;
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




























    public static Object queryOne(String s){
        entityManager.getTransaction().begin();
        Query query =  entityManager.createQuery(s);
        Object obj = query.getSingleResult();
        entityManager.getTransaction().commit();
        return obj;
    }

    public static List<String> queryList(String s){
        entityManager.getTransaction().begin();
        Query query =  entityManager.createQuery(s);
        List<String> list = query.getResultList();
        entityManager.getTransaction().commit();
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