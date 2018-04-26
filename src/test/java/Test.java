import database.Geography;
import database.People;
import hello.GreetingController;
import org.junit.Assert;

import javax.validation.constraints.AssertTrue;
import java.util.List;
import java.util.Set;

public class Test {

    GreetingController gc = new GreetingController();

    @org.junit.Test
    public void countryCount(){
        List<String> countries = gc.countries();
        Assert.assertTrue(countries.size()==69);
    }

    @org.junit.Test
    public void geographyDenamrk(){
        Geography g = gc.geography("denmark");
        Assert.assertTrue(g.getCoastline().getValue() == 7314);
        Assert.assertTrue(g.getElevation().getLowest_point().getName().equals("Lammefjord"));
    }

    @org.junit.Test
    public void continentsCount(){
        Set<String> countries =  gc.continents();
        Assert.assertTrue(countries.size()==12);
    }

    @org.junit.Test
    public void people(){
        People p = gc.people("denmark");
        Assert.assertFalse(p.getPopulation().getGlobal_rank()==12);
        Assert.assertTrue(p.getPopulation().getTotal()==5605948);
        Assert.assertTrue(p.getEthnic_groups().getEthnicity().get(0).getPercent()==86.7f);
    }


}
