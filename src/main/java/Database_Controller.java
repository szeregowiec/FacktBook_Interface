
import database.*;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import hello.IndexAlgorithm;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Klasa dopowiedzilana za dodwanie danych do bazy danych
 */
public class Database_Controller {
    public static void main(String[] args) {
        Json result = null;
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("/home/szergowiec/IdeaProjects/parser/src/main/java/pl/edu/agh/dane.json"));
             result = new Gson().fromJson(br, Json.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        JsonElement gson = new Gson().toJsonTree(result.getCountries().getDenmark().getData(),Data.class);
        System.out.println("yhmy");



        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();


//        addA(entityManager,result);
//        addB(entityManager,result);
//        addC(entityManager,result);
//        addD(entityManager,result);
//        addE(entityManager,result);
//        addF(entityManager,result);
//        addG(entityManager,result);
//        addH(entityManager,result);
//        addI(entityManager,result);
//        addJ(entityManager,result);
//        addK(entityManager,result);
//        addL(entityManager,result);
//        addM(entityManager,result);
//        addN(entityManager,result);
//        addO(entityManager,result);
//        addP(entityManager,result);
//        addQ(entityManager,result);
//        addR(entityManager,result);
//        addS(entityManager,result);
//        addT(entityManager,result);
//        addU(entityManager,result);
//        addV(entityManager,result);
//        addW(entityManager,result);
//        addY(entityManager,result);
//        addZ(entityManager,result);


        entityManager.getTransaction().commit();
        entityManagerFactory.close();


    }



    static void addAfghanistan(EntityManager entityManager, Json result){
        for(Border_countries bc : result.getCountries().getAfghanistan().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }
        result.getCountries().getAfghanistan().getData().getGeography().setName("afghanistan");
        result.getCountries().getAfghanistan().setName("afghanistan");

        entityManager.persist(result.getCountries().getAfghanistan());
       // entityManager.persist(result.getCountries().getAfghanistan());

//        for(Border_countries bc : result.getCountries().getAfghanistan().getData().getGeography().getLand_boundaries().getBorder_countries()){
//            bc.setBorder(bc.getBorder_length().getValue());
//            bc.setUnits(bc.getBorder_length().getUnits());
//        }
//        result.getCountries().getAfghanistan().setName("afghanistan");
//        entityManager.persist(result.getCountries().getAfghanistan());
//        result.getCountries().getAfghanistan().getData().setName("afghanistan");
//        entityManager.persist(result.getCountries().getAfghanistan().getData());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getMilitary_and_security());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getMilitary_and_security().getBranches());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getMilitary_and_security().getService_age_and_obligation());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getIntroduction());
//
//
//
///* GEOGRAPHY*/
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getGeographic_coordinates());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getGeographic_coordinates().getLongitude());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getGeographic_coordinates().getLatitude());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getArea());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getArea().getTotal());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getArea().getLand());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getArea().getWater());
//
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getLand_boundaries());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getLand_boundaries().getTotal());
//      /*  entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getLand_boundaries().getBorder_countries().get(0).getBorder_length());*/
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getElevation());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getElevation().getHighest_point());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getElevation().getLowest_point());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getElevation().getMean_elevation());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getElevation().getHighest_point().getElevation());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getElevation().getLowest_point().getElevation());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getLand_use());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getLand_use().getBy_sector());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getLand_use().getBy_sector().getAgricultural_land_arable_land());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getLand_use().getBy_sector().getAgricultural_land_permanent_crops());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getLand_use().getBy_sector().getAgricultural_land_permanent_pasture());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getLand_use().getBy_sector().getAgricultural_land_total());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getLand_use().getBy_sector().getForest());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getLand_use().getBy_sector().getOther());
//
//     /*  // entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getNatural_hazards());*/
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getEnvironment());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getEnvironment().getInternational_agreements());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getCoastline());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGeography().getIrrigated_land());
////
///*PEOPLE*/
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getPopulation());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getNationality());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getEthnic_groups());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getLanguages());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getReligions());
//
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getAge_structure());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getAge_structure().getAge_0_to_14());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getAge_structure().getAge_15_to_24());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getAge_structure().getAge_25_to_54());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getAge_structure().getAge_55_to_64());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getAge_structure().getAge_65_and_over());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getDependency_ratios());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getDependency_ratios().getRatios());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getDependency_ratios().getRatios().getElderly_dependency_ratio());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getDependency_ratios().getRatios().getPotential_support_ratio());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getDependency_ratios().getRatios().getTotal_dependency_ratio());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getDependency_ratios().getRatios().getYouth_dependency_ratio());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getMedian_age());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getMedian_age().getFemale());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getMedian_age().getMale());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getMedian_age().getTotal());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getPopulation_growth_rate());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getBirth_rate());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getDeath_rate());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getNet_migration_rate());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getMedian_age());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getUrbanization());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getUrbanization().getRate_of_urbanization());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getUrbanization().getUrban_population());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getMajor_urban_areas());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSex_ratio());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSex_ratio().getTotal_population());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSex_ratio().getBy_age());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSex_ratio().getBy_age().getAge_0_to_14_years());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSex_ratio().getBy_age().getAge_15_to_24_years());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSex_ratio().getBy_age().getAge_25_to_54_years());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSex_ratio().getBy_age().getAge_55_to_64_years());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSex_ratio().getBy_age().getAge_65_years_and_over());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSex_ratio().getBy_age().getAt_birth());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getMothers_mean_age_at_first_birth());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getMaternal_mortality_rate());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getInfant_mortality_rate());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getInfant_mortality_rate().getFemale());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getInfant_mortality_rate().getMale());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getInfant_mortality_rate().getTotal());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getLife_expectancy_at_birth());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getLife_expectancy_at_birth().getFemale());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getLife_expectancy_at_birth().getMale());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getLife_expectancy_at_birth().getTotal_population());
//
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getTotal_fertility_rate());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getHealth_expenditures());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getPhysicians_density());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getHospital_bed_density());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getDrinking_water_source());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getDrinking_water_source().getImproved());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getDrinking_water_source().getImproved().getRural());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getDrinking_water_source().getImproved().getTotal());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getDrinking_water_source().getImproved().getUrban());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getDrinking_water_source().getUnimproved());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getDrinking_water_source().getUnimproved().getRural());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getDrinking_water_source().getUnimproved().getTotal());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getDrinking_water_source().getUnimproved().getUrban());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSanitation_facility_access());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSanitation_facility_access().getImproved());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSanitation_facility_access().getImproved().getRural());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSanitation_facility_access().getImproved().getTotal());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSanitation_facility_access().getImproved().getUrban());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSanitation_facility_access().getUnimproved());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSanitation_facility_access().getUnimproved().getRural());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSanitation_facility_access().getUnimproved().getTotal());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSanitation_facility_access().getUnimproved().getUrban());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getMajor_infectious_diseases());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getAdult_obesity());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getEducation_expenditures());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getLiteracy());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getLiteracy().getFemale());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getLiteracy().getMale());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getLiteracy().getTotal_population());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSchool_life_expectancy());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSchool_life_expectancy().getFemale());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSchool_life_expectancy().getMale());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getSchool_life_expectancy().getTotal());
//
//  /*      entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getYouth_unemployment());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getYouth_unemployment().getFemale());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getYouth_unemployment().getMale());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getPeople().getYouth_unemployment().getTotal());*/
///*GOVERMENT*/
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment().getCountry_name());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment().getCapital());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment().getCapital().getGeographic_coordinates());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment().getCapital().getGeographic_coordinates().getLatitude());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment().getCapital().getGeographic_coordinates().getLongitude());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment().getCapital().getTime_difference());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment().getIndependence());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment().getConstitution());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment().getCitizenship());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment().getSuffrage());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment().getExecutive_branch());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment().getLegislative_branch());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment().getJudicial_branch());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment().getPolitical_parties_and_leaders());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment().getPolitical_pressure_groups_and_leaders());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment().getDiplomatic_representation());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment().getDiplomatic_representation().getFrom_united_states());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment().getDiplomatic_representation().getIn_united_states());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment().getFlag_description());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment().getNational_symbol());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getGovernment().getNational_anthem());
//
///*ECONOMY*/
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getGdp());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getGdp().getPurchasing_power_parity());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getGdp().getReal_growth_rate());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getGdp().getPer_capita_purchasing_power_parity());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getGdp().getOfficial_exchange_rate());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getGdp().getComposition());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getGdp().getComposition().getBy_end_use());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getGdp().getComposition().getBy_end_use().getEnd_uses());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getGdp().getComposition().getBy_end_use().getEnd_uses().getExports_of_goods_and_services());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getGdp().getComposition().getBy_end_use().getEnd_uses().getGovernment_consumption());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getGdp().getComposition().getBy_end_use().getEnd_uses().getHousehold_consumption());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getGdp().getComposition().getBy_end_use().getEnd_uses().getImports_of_goods_and_services());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getGdp().getComposition().getBy_end_use().getEnd_uses().getInvestment_in_fixed_capital());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getGdp().getComposition().getBy_end_use().getEnd_uses().getInvestment_in_inventories());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getGdp().getComposition().getBy_sector_of_origin());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getGdp().getComposition().getBy_sector_of_origin().getSectors());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getGdp().getComposition().getBy_sector_of_origin().getSectors().getAgriculture());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getGdp().getComposition().getBy_sector_of_origin().getSectors().getIndustry());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getGdp().getComposition().getBy_sector_of_origin().getSectors().getServices());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getAgriculture_products());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getIndustries());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getIndustrial_production_growth_rate());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getLabor_force());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getLabor_force().getTotal_size());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getLabor_force().getBy_occupation());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getLabor_force().getBy_occupation().getOccupation());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getLabor_force().getBy_occupation().getOccupation().getAgriculture());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getLabor_force().getBy_occupation().getOccupation().getIndustry());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getLabor_force().getBy_occupation().getOccupation().getServices());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getHousehold_income_by_percentage_share());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getHousehold_income_by_percentage_share().getHighest_ten_percent());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getHousehold_income_by_percentage_share().getLowest_ten_percent());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getBudget());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getBudget().getExpenditures());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getBudget().getRevenues());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getTaxes_and_other_revenues());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getBudget_surplus_or_deficit());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getFiscal_year());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getExports());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getExports().getCommodities());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getExports().getPartners());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getExports().getTotal_value());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getImports());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getImports().getCommodities());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getImports().getPartners());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getImports().getTotal_value());
//
//     /*   entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getStock_of_direct_foreign_investment());*/
//    /*   entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getStock_of_direct_foreign_investment().getAbroad());*/
//     /*  entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getStock_of_direct_foreign_investment().getAt_home());*/
//
//       /* entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getDistribution_of_family_income());*/
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getPublic_debt());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getInflation_rate());
//     /*  entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getCentral_bank_discount_rate());*/
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getCommercial_bank_prime_lending_rate());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getStock_of_narrow_money());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getStock_of_broad_money());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getStock_of_domestic_credit());
//      /*  entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getMarket_value_of_publicly_traded_shares());*/
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getCurrent_account_balance());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getReserves_of_foreign_exchange_and_gold());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getExternal_debt());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getExchange_rates());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getGross_national_saving());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getPopulation_below_poverty_line());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEconomy().getUnemployment_rate());
///*ENERGY*/
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getElectricity());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getElectricity().getAccess());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getElectricity().getAccess().getTotal_electrification());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getElectricity().getProduction());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getElectricity().getConsumption());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getElectricity().getExports());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getElectricity().getImports());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getElectricity().getInstalled_generating_capacity());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getElectricity().getBy_source());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getElectricity().getBy_source().getFossil_fuels());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getElectricity().getBy_source().getNuclear_fuels());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getElectricity().getBy_source().getHydroelectric_plants());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getElectricity().getBy_source().getOther_renewable_sources());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getCrude_oil());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getCrude_oil().getProduction());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getCrude_oil().getExports());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getCrude_oil().getImports());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getCrude_oil().getProved_reserves());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getRefined_petroleum_products());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getRefined_petroleum_products().getProduction());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getRefined_petroleum_products().getConsumption());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getRefined_petroleum_products().getExports());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getRefined_petroleum_products().getImports());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getNatural_gas());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getNatural_gas().getProduction());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getNatural_gas().getConsumption());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getNatural_gas().getExports());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getNatural_gas().getImports());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getNatural_gas().getProved_reserves());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getEnergy().getCarbon_dioxide_emissions_from_consumption_of_energy());
//
//
//
//        /*COMMUNICATIONS*/
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getCommunications());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getCommunications().getTelephones());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getCommunications().getTelephones().getFixed_lines());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getCommunications().getTelephones().getMobile_cellular());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getCommunications().getTelephones().getSystem());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getCommunications().getInternet());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getCommunications().getInternet().getUsers());
//
//
//        /*Transportation*/
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getTransportation());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getTransportation().getAir_transport());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getTransportation().getAir_transport().getNational_system());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getTransportation().getAir_transport().getCivil_aircraft_registration_country_code_prefix());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getTransportation().getAir_transport().getAirports());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getTransportation().getAir_transport().getAirports().getPaved());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getTransportation().getAir_transport().getAirports().getTotal());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getTransportation().getAir_transport().getAirports().getUnpaved());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getTransportation().getAir_transport().getHeliports());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getTransportation().getPipelines());
//
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getTransportation().getRoadways());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getTransportation().getRoadways().getPaved());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getTransportation().getRoadways().getTotal());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getTransportation().getRoadways().getUnpaved());
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getTransportation().getWaterways());
///*        entityManager.persist(result.getCountries().getAfghanistan().getData().getTransportation().getMerchant_marine());*/
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getTransportation().getPorts_and_terminals());
//
//        /*moze byc problem z klasa Total wewnetrzna*/
//   /*     entityManager.persist(result.getCountries().getAfghanistan().getData().getTransportation().getRailways());*/
//     /*   entityManager.persist(result.getCountries().getAfghanistan().getData().getTransportation().getRailways().getBroad_gauge());*/
//     /*   entityManager.persist(result.getCountries().getAfghanistan().getData().getTransportation().getRailways().getStandard_gauge());*/
//
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getTransnational_issues());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getTransnational_issues().getIllicit_drugs());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getTransnational_issues().getRefugees_and_iternally_displaced_persons());
//        entityManager.persist(result.getCountries().getAfghanistan().getData().getTransnational_issues().getRefugees_and_iternally_displaced_persons().getRefugees());
//       /* entityManager.persist(result.getCountries().getAfghanistan().getData().getTransnational_issues().getRefugees_and_iternally_displaced_persons().getStateless_persons());*/



    }
    static void addAkrotiri(EntityManager entityManager, Json result){



        for(Border_countries bc : result.getCountries().getAkrotiri().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }
        result.getCountries().getAkrotiri().setName("akrotiri");

        result.getCountries().getAkrotiri().getData().setName("akrotiri");
        entityManager.persist(result.getCountries().getAkrotiri());



//        entityManager.persist(result.getCountries().getAkrotiri().getData());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getMilitary_and_security());
///*        entityManager.persist(result.getCountries().getAkrotiri().getData().getMilitary_and_security().getBranches());*/
///*        entityManager.persist(result.getCountries().getAkrotiri().getData().getMilitary_and_security().getService_age_and_obligation());*/
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getIntroduction());
//
//
//
///* GEOGRAPHY*/
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getGeographic_coordinates());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getGeographic_coordinates().getLongitude());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getGeographic_coordinates().getLatitude());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getArea());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getArea().getTotal());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getArea().getLand());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getArea().getWater());
//
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getLand_boundaries());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getLand_boundaries().getTotal());
//
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getElevation());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getElevation().getHighest_point());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getElevation().getLowest_point());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getElevation().getMean_elevation());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getElevation().getHighest_point().getElevation());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getElevation().getLowest_point().getElevation());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getLand_use());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getLand_use().getBy_sector());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getLand_use().getBy_sector().getAgricultural_land_arable_land());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getLand_use().getBy_sector().getAgricultural_land_permanent_crops());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getLand_use().getBy_sector().getAgricultural_land_permanent_pasture());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getLand_use().getBy_sector().getAgricultural_land_total());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getLand_use().getBy_sector().getForest());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getLand_use().getBy_sector().getOther());
//
//
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getEnvironment());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getEnvironment().getInternational_agreements());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getCoastline());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGeography().getIrrigated_land());
//
///*PEOPLE*/
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getPopulation());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getNationality());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getEthnic_groups());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getLanguages());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getReligions());
//
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getAge_structure());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getAge_structure().getAge_0_to_14());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getAge_structure().getAge_15_to_24());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getAge_structure().getAge_25_to_54());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getAge_structure().getAge_55_to_64());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getAge_structure().getAge_65_and_over());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getDependency_ratios());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getDependency_ratios().getRatios());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getDependency_ratios().getRatios().getElderly_dependency_ratio());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getDependency_ratios().getRatios().getPotential_support_ratio());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getDependency_ratios().getRatios().getTotal_dependency_ratio());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getDependency_ratios().getRatios().getYouth_dependency_ratio());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getMedian_age());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getMedian_age().getFemale());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getMedian_age().getMale());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getMedian_age().getTotal());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getPopulation_growth_rate());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getBirth_rate());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getDeath_rate());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getNet_migration_rate());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getMedian_age());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getUrbanization());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getUrbanization().getRate_of_urbanization());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getUrbanization().getUrban_population());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getMajor_urban_areas());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSex_ratio());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSex_ratio().getTotal_population());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSex_ratio().getBy_age());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSex_ratio().getBy_age().getAge_0_to_14_years());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSex_ratio().getBy_age().getAge_15_to_24_years());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSex_ratio().getBy_age().getAge_25_to_54_years());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSex_ratio().getBy_age().getAge_55_to_64_years());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSex_ratio().getBy_age().getAge_65_years_and_over());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSex_ratio().getBy_age().getAt_birth());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getMothers_mean_age_at_first_birth());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getMaternal_mortality_rate());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getInfant_mortality_rate());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getInfant_mortality_rate().getFemale());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getInfant_mortality_rate().getMale());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getInfant_mortality_rate().getTotal());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getLife_expectancy_at_birth());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getLife_expectancy_at_birth().getFemale());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getLife_expectancy_at_birth().getMale());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getLife_expectancy_at_birth().getTotal_population());
//
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getTotal_fertility_rate());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getHealth_expenditures());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getPhysicians_density());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getHospital_bed_density());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getDrinking_water_source());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getDrinking_water_source().getImproved());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getDrinking_water_source().getImproved().getRural());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getDrinking_water_source().getImproved().getTotal());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getDrinking_water_source().getImproved().getUrban());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getDrinking_water_source().getUnimproved());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getDrinking_water_source().getUnimproved().getRural());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getDrinking_water_source().getUnimproved().getTotal());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getDrinking_water_source().getUnimproved().getUrban());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSanitation_facility_access());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSanitation_facility_access().getImproved());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSanitation_facility_access().getImproved().getRural());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSanitation_facility_access().getImproved().getTotal());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSanitation_facility_access().getImproved().getUrban());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSanitation_facility_access().getUnimproved());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSanitation_facility_access().getUnimproved().getRural());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSanitation_facility_access().getUnimproved().getTotal());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSanitation_facility_access().getUnimproved().getUrban());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getMajor_infectious_diseases());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getAdult_obesity());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getEducation_expenditures());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getLiteracy());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getLiteracy().getFemale());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getLiteracy().getMale());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getLiteracy().getTotal_population());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSchool_life_expectancy());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSchool_life_expectancy().getFemale());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSchool_life_expectancy().getMale());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getSchool_life_expectancy().getTotal());
//
//  /*      entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getYouth_unemployment());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getYouth_unemployment().getFemale());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getYouth_unemployment().getMale());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getPeople().getYouth_unemployment().getTotal());*/
///*GOVERMENT*/
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment().getCountry_name());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment().getCapital());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment().getCapital().getGeographic_coordinates());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment().getCapital().getGeographic_coordinates().getLatitude());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment().getCapital().getGeographic_coordinates().getLongitude());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment().getCapital().getTime_difference());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment().getIndependence());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment().getConstitution());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment().getCitizenship());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment().getSuffrage());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment().getExecutive_branch());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment().getLegislative_branch());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment().getJudicial_branch());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment().getPolitical_parties_and_leaders());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment().getPolitical_pressure_groups_and_leaders());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment().getDiplomatic_representation());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment().getDiplomatic_representation().getFrom_united_states());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment().getDiplomatic_representation().getIn_united_states());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment().getFlag_description());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment().getNational_symbol());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getGovernment().getNational_anthem());
//
///*ECONOMY*/
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getGdp());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getGdp().getPurchasing_power_parity());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getGdp().getReal_growth_rate());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getGdp().getPer_capita_purchasing_power_parity());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getGdp().getOfficial_exchange_rate());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getGdp().getComposition());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getGdp().getComposition().getBy_end_use());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getGdp().getComposition().getBy_end_use().getEnd_uses());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getGdp().getComposition().getBy_end_use().getEnd_uses().getExports_of_goods_and_services());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getGdp().getComposition().getBy_end_use().getEnd_uses().getGovernment_consumption());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getGdp().getComposition().getBy_end_use().getEnd_uses().getHousehold_consumption());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getGdp().getComposition().getBy_end_use().getEnd_uses().getImports_of_goods_and_services());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getGdp().getComposition().getBy_end_use().getEnd_uses().getInvestment_in_fixed_capital());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getGdp().getComposition().getBy_end_use().getEnd_uses().getInvestment_in_inventories());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getGdp().getComposition().getBy_sector_of_origin());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getGdp().getComposition().getBy_sector_of_origin().getSectors());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getGdp().getComposition().getBy_sector_of_origin().getSectors().getAgriculture());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getGdp().getComposition().getBy_sector_of_origin().getSectors().getIndustry());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getGdp().getComposition().getBy_sector_of_origin().getSectors().getServices());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getAgriculture_products());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getIndustries());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getIndustrial_production_growth_rate());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getLabor_force());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getLabor_force().getTotal_size());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getLabor_force().getBy_occupation());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getLabor_force().getBy_occupation().getOccupation());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getLabor_force().getBy_occupation().getOccupation().getAgriculture());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getLabor_force().getBy_occupation().getOccupation().getIndustry());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getLabor_force().getBy_occupation().getOccupation().getServices());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getHousehold_income_by_percentage_share());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getHousehold_income_by_percentage_share().getHighest_ten_percent());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getHousehold_income_by_percentage_share().getLowest_ten_percent());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getBudget());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getBudget().getExpenditures());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getBudget().getRevenues());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getTaxes_and_other_revenues());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getBudget_surplus_or_deficit());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getFiscal_year());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getExports());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getExports().getCommodities());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getExports().getPartners());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getExports().getTotal_value());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getImports());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getImports().getCommodities());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getImports().getPartners());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getImports().getTotal_value());
//
//     /*   entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getStock_of_direct_foreign_investment());*/
//    /*   entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getStock_of_direct_foreign_investment().getAbroad());*/
//     /*  entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getStock_of_direct_foreign_investment().getAt_home());*/
//
//       /* entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getDistribution_of_family_income());*/
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getPublic_debt());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getInflation_rate());
//     /*  entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getCentral_bank_discount_rate());*/
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getCommercial_bank_prime_lending_rate());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getStock_of_narrow_money());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getStock_of_broad_money());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getStock_of_domestic_credit());
//      /*  entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getMarket_value_of_publicly_traded_shares());*/
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getCurrent_account_balance());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getReserves_of_foreign_exchange_and_gold());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getExternal_debt());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getExchange_rates());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getGross_national_saving());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getPopulation_below_poverty_line());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEconomy().getUnemployment_rate());
///*ENERGY*/
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getElectricity());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getElectricity().getAccess());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getElectricity().getAccess().getTotal_electrification());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getElectricity().getProduction());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getElectricity().getConsumption());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getElectricity().getExports());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getElectricity().getImports());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getElectricity().getInstalled_generating_capacity());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getElectricity().getBy_source());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getElectricity().getBy_source().getFossil_fuels());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getElectricity().getBy_source().getNuclear_fuels());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getElectricity().getBy_source().getHydroelectric_plants());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getElectricity().getBy_source().getOther_renewable_sources());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getCrude_oil());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getCrude_oil().getProduction());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getCrude_oil().getExports());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getCrude_oil().getImports());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getCrude_oil().getProved_reserves());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getRefined_petroleum_products());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getRefined_petroleum_products().getProduction());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getRefined_petroleum_products().getConsumption());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getRefined_petroleum_products().getExports());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getRefined_petroleum_products().getImports());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getNatural_gas());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getNatural_gas().getProduction());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getNatural_gas().getConsumption());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getNatural_gas().getExports());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getNatural_gas().getImports());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getNatural_gas().getProved_reserves());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getEnergy().getCarbon_dioxide_emissions_from_consumption_of_energy());
//
//
//
//        /*COMMUNICATIONS*/
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getCommunications());
//       // entityManager.persist(result.getCountries().getAkrotiri().getData().getCommunications().getTelephones());
//      //  entityManager.persist(result.getCountries().getAkrotiri().getData().getCommunications().getTelephones().getFixed_lines());
//       // entityManager.persist(result.getCountries().getAkrotiri().getData().getCommunications().getTelephones().getMobile_cellular());
//       // entityManager.persist(result.getCountries().getAkrotiri().getData().getCommunications().getTelephones().getSystem());
//       // entityManager.persist(result.getCountries().getAkrotiri().getData().getCommunications().getInternet());
//       // entityManager.persist(result.getCountries().getAkrotiri().getData().getCommunications().getInternet().getUsers());
//
//
//        /*Transportation*/
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getTransportation());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getTransportation().getAir_transport());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getTransportation().getAir_transport().getNational_system());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getTransportation().getAir_transport().getCivil_aircraft_registration_country_code_prefix());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getTransportation().getAir_transport().getAirports());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getTransportation().getAir_transport().getAirports().getPaved());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getTransportation().getAir_transport().getAirports().getTotal());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getTransportation().getAir_transport().getAirports().getUnpaved());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getTransportation().getAir_transport().getHeliports());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getTransportation().getPipelines());
//
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getTransportation().getRoadways());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getTransportation().getRoadways().getPaved());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getTransportation().getRoadways().getTotal());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getTransportation().getRoadways().getUnpaved());
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getTransportation().getWaterways());
///*        entityManager.persist(result.getCountries().getAkrotiri().getData().getTransportation().getMerchant_marine());*/
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getTransportation().getPorts_and_terminals());
//
//        /*moze byc problem z klasa Total wewnetrzna*/
//   /*     entityManager.persist(result.getCountries().getAkrotiri().getData().getTransportation().getRailways());*/
//     /*   entityManager.persist(result.getCountries().getAkrotiri().getData().getTransportation().getRailways().getBroad_gauge());*/
//     /*   entityManager.persist(result.getCountries().getAkrotiri().getData().getTransportation().getRailways().getStandard_gauge());*/
//
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getTransnational_issues());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getTransnational_issues().getIllicit_drugs());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getTransnational_issues().getRefugees_and_iternally_displaced_persons());
//        entityManager.persist(result.getCountries().getAkrotiri().getData().getTransnational_issues().getRefugees_and_iternally_displaced_persons().getRefugees());
//       /* entityManager.persist(result.getCountries().getAkrotiri().getData().getTransnational_issues().getRefugees_and_iternally_displaced_persons().getStateless_persons());*/

    }
    static void addAlbania(EntityManager entityManager, Json result){
        for(Border_countries bc : result.getCountries().getAlbania().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }
        result.getCountries().getAlbania().setName("albania");

        result.getCountries().getAlbania().getData().setName("albania");
        entityManager.persist(result.getCountries().getAlbania());
    }
    static void addAlgeria(EntityManager entityManager, Json result){
        for(Border_countries bc : result.getCountries().getAlgeria().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }
        result.getCountries().getAlgeria().setName("algeria");

        result.getCountries().getAlgeria().getData().setName("algeria");
        entityManager.persist(result.getCountries().getAlgeria());
    }
    static void addAmerican_samoa(EntityManager entityManager, Json result){
/*        for(Border_countries bc : result.getCountries().getAmerican_samoa().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }*/
        result.getCountries().getAmerican_samoa().setName("american_samoa");

        result.getCountries().getAmerican_samoa().getData().setName("american_samoa");
        entityManager.persist(result.getCountries().getAmerican_samoa());
    }
    static void addAndorra(EntityManager entityManager, Json result){
        for(Border_countries bc : result.getCountries().getAndorra().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }
        result.getCountries().getAndorra().setName("andorra");

        result.getCountries().getAndorra().getData().setName("andorra");
        entityManager.persist(result.getCountries().getAndorra());
    }
    static void addAngola(EntityManager entityManager, Json result){
        for(Border_countries bc : result.getCountries().getAngola().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }
        result.getCountries().getAngola().setName("angola");

        result.getCountries().getAngola().getData().setName("angola");
        entityManager.persist(result.getCountries().getAngola());
    }
    static void addAnguilla(EntityManager entityManager, Json result){
/*        for(Border_countries bc : result.getCountries().getAnguilla().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }*/
        result.getCountries().getAnguilla().setName("anguilla");

        result.getCountries().getAnguilla().getData().setName("anguilla");
        entityManager.persist(result.getCountries().getAnguilla());
    }
    static void addAntarctica(EntityManager entityManager, Json result){
/*        for(Border_countries bc : result.getCountries().getAntarctica().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }*/
        result.getCountries().getAntarctica().setName("antarctica");

        result.getCountries().getAntarctica().getData().setName("antarctica");
        entityManager.persist(result.getCountries().getAntarctica());
    }
    static void addAntigua_and_barbuda(EntityManager entityManager, Json result){
/*        for(Border_countries bc : result.getCountries().getAntigua_and_barbuda().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }*/
        result.getCountries().getAntigua_and_barbuda().setName("antigua_and_barbuda");

        result.getCountries().getAntigua_and_barbuda().getData().setName("antigua_and_barbuda");
        entityManager.persist(result.getCountries().getAntigua_and_barbuda());
    }
    static void addArctic_ocean(EntityManager entityManager, Json result){
        /*for(Border_countries bc : result.getCountries().getArctic_ocean().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }*/
        result.getCountries().getArctic_ocean().setName("arctic_ocean");

        result.getCountries().getArctic_ocean().getData().setName("arctic_ocean");
        entityManager.persist(result.getCountries().getArctic_ocean());
    }
    static void addArgentina(EntityManager entityManager, Json result){
        for(Border_countries bc : result.getCountries().getArgentina().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }
        result.getCountries().getArgentina().setName("argentina");

        result.getCountries().getArgentina().getData().setName("argentina");
        entityManager.persist(result.getCountries().getArgentina());
    }
    static void addArmenia(EntityManager entityManager, Json result){
        for(Border_countries bc : result.getCountries().getArmenia().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }
        result.getCountries().getArmenia().setName("armenia");

        result.getCountries().getArmenia().getData().setName("armenia");
        entityManager.persist(result.getCountries().getArmenia());
    }
    static void addAruba(EntityManager entityManager, Json result){
/*        for(Border_countries bc : result.getCountries().getAruba().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }*/
        result.getCountries().getAruba().setName("aruba");

        result.getCountries().getAruba().getData().setName("aruba");
        entityManager.persist(result.getCountries().getAruba());
    }
    static void addAshmore_and_cartier_islands(EntityManager entityManager, Json result){
/*        for(Border_countries bc : result.getCountries().getAshmore_and_cartier_islands().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }*/
        result.getCountries().getAshmore_and_cartier_islands().setName("ashmore_and_cartier_islands");

        result.getCountries().getAshmore_and_cartier_islands().getData().setName("ashmore_and_cartier_islands");
        entityManager.persist(result.getCountries().getAshmore_and_cartier_islands());
    }
    static void addAtlantic_ocean(EntityManager entityManager, Json result){
/*        for(Border_countries bc : result.getCountries().getAtlantic_ocean().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }*/
        result.getCountries().getAtlantic_ocean().setName("atlantic_ocean");

        result.getCountries().getAtlantic_ocean().getData().setName("atlantic_ocean");
        entityManager.persist(result.getCountries().getAtlantic_ocean());
    }
    static void addAustralia(EntityManager entityManager, Json result){
/*        for(Border_countries bc : result.getCountries().getAustralia().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }*/
        result.getCountries().getAustralia().setName("australia");

        result.getCountries().getAustralia().getData().setName("australia");
        entityManager.persist(result.getCountries().getAustralia());
    }
    static void addAustria(EntityManager entityManager, Json result){
        for(Border_countries bc : result.getCountries().getAustria().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }
        result.getCountries().getAustria().setName("austria");

        result.getCountries().getAustria().getData().setName("austria");
        entityManager.persist(result.getCountries().getAustria());
    }
    static void addAzerbaijan(EntityManager entityManager, Json result){
        for(Border_countries bc : result.getCountries().getAzerbaijan().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }
        result.getCountries().getAzerbaijan().setName("azerbaijan");

        result.getCountries().getAzerbaijan().getData().setName("azerbaijan");
        entityManager.persist(result.getCountries().getAzerbaijan());
    }

    /**
     * Metoda doająca dane państw na literę A
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    public static void addA(EntityManager entityManager, Json result){
                addAfghanistan(entityManager,result);
        addAkrotiri(entityManager,result);
        addAlbania(entityManager,result);
        addAlgeria(entityManager,result);
        addAmerican_samoa(entityManager,result);
        addAndorra(entityManager,result);
        addAngola( entityManager, result);
        addAnguilla(entityManager,result);
        addAntarctica(entityManager,result);
        addAntigua_and_barbuda(entityManager,result);
        addArctic_ocean(entityManager,result);
        addArgentina(entityManager,result);
        addArmenia(entityManager,result);
        addAruba(entityManager,result);
        addAshmore_and_cartier_islands(entityManager,result);
        addAtlantic_ocean(entityManager,result);
        addAustralia(entityManager,result);
        addAustria(entityManager,result);
        addAzerbaijan(entityManager,result);
    }


    static void addBahamas_the(EntityManager entityManager, Json result){
/*        for(Border_countries bc : result.getCountries().getBahamas_the().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }*/
        result.getCountries().getBahamas_the().setName("bahamas_the");

        result.getCountries().getBahamas_the().getData().setName("bahamas_the");
        entityManager.persist(result.getCountries().getBahamas_the());
    }
    static void addBahrain(EntityManager entityManager, Json result){
/*        for(Border_countries bc : result.getCountries().getBahrain().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }*/
        result.getCountries().getBahrain().setName("bahrain");

        result.getCountries().getBahrain().getData().setName("bahrain");
        entityManager.persist(result.getCountries().getBahrain());
    }
    static void addBangladesh(EntityManager entityManager, Json result){
        for(Border_countries bc : result.getCountries().getBangladesh().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }
        result.getCountries().getBangladesh().setName("bangladesh");

        result.getCountries().getBangladesh().getData().setName("bangladesh");
        entityManager.persist(result.getCountries().getBangladesh());
    }
    static void addBarbados(EntityManager entityManager, Json result){
/*        for(Border_countries bc : result.getCountries().getBarbados().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }*/
        result.getCountries().getBarbados().setName("barbados");

        result.getCountries().getBarbados().getData().setName("barbados");
        entityManager.persist(result.getCountries().getBarbados());
    }
    static void addBelarus(EntityManager entityManager, Json result){
        for(Border_countries bc : result.getCountries().getBelarus().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }
        result.getCountries().getBelarus().setName("belarus");

        result.getCountries().getBelarus().getData().setName("Belarus");
        entityManager.persist(result.getCountries().getBelarus());
    }
    static void addBelgium(EntityManager entityManager, Json result){
        for(Border_countries bc : result.getCountries().getBelgium().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }
        result.getCountries().getBelgium().setName("belgium");

        result.getCountries().getBelgium().getData().setName("belgium");
        entityManager.persist(result.getCountries().getBelgium());
    }
    static void addBelize(EntityManager entityManager, Json result){
        for(Border_countries bc : result.getCountries().getBelize().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }
        result.getCountries().getBelize().setName("belize");

        result.getCountries().getBelize().getData().setName("belize");
        entityManager.persist(result.getCountries().getBelize());
    }
    static void addBenin(EntityManager entityManager, Json result){
        for(Border_countries bc : result.getCountries().getBenin().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }
        result.getCountries().getBenin().setName("benin");

        result.getCountries().getBenin().getData().setName("benin");
        entityManager.persist(result.getCountries().getBenin());
    }
    static void addBermuda(EntityManager entityManager, Json result){
/*        for(Border_countries bc : result.getCountries().getBermuda().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }*/
        result.getCountries().getBermuda().setName("bermuda");

        result.getCountries().getBermuda().getData().setName("bermuda");
        entityManager.persist(result.getCountries().getBermuda());
    }
    static void addBhutan(EntityManager entityManager, Json result){
        for(Border_countries bc : result.getCountries().getBhutan().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }
        result.getCountries().getBhutan().setName("bhutan");

        result.getCountries().getBhutan().getData().setName("bhutan");
        entityManager.persist(result.getCountries().getBhutan());
    }
    static void addBolivia(EntityManager entityManager, Json result){
        for(Border_countries bc : result.getCountries().getBolivia().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }
        result.getCountries().getBolivia().setName("bolivia");

        result.getCountries().getBolivia().getData().setName("bolivia");
        entityManager.persist(result.getCountries().getBolivia());
    }
    static void addBosnia_and_herzegovina(EntityManager entityManager, Json result){
        for(Border_countries bc : result.getCountries().getBosnia_and_herzegovina().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }
        result.getCountries().getBosnia_and_herzegovina().setName("bosnia_and_herzegovina");

        result.getCountries().getBosnia_and_herzegovina().getData().setName("bosnia_and_herzegovina");
        entityManager.persist(result.getCountries().getBosnia_and_herzegovina());
    }
    static void addBotswana(EntityManager entityManager, Json result){
        for(Border_countries bc : result.getCountries().getBotswana().getData().getGeography().getLand_boundaries().getBorder_countries()){
        bc.setBorder(bc.getBorder_length().getValue());
        bc.setUnits(bc.getBorder_length().getUnits());
    }
        result.getCountries().getBotswana().setName("botswana");

        result.getCountries().getBotswana().getData().setName("botswana");
        entityManager.persist(result.getCountries().getBotswana());}
    static void addBouvet_island(EntityManager entityManager, Json result){
/*        for(Border_countries bc : result.getCountries().getBouvet_island().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }*/
        result.getCountries().getBouvet_island().setName("bouvet_island");

        result.getCountries().getBouvet_island().getData().setName("bouvet_island");
        entityManager.persist(result.getCountries().getBouvet_island());
    }
    static void addBrazil(EntityManager entityManager, Json result){        for(Border_countries bc : result.getCountries().getBrazil().getData().getGeography().getLand_boundaries().getBorder_countries()){
        bc.setBorder(bc.getBorder_length().getValue());
        bc.setUnits(bc.getBorder_length().getUnits());
    }
        result.getCountries().getBrazil().setName("brazil");

        result.getCountries().getBrazil().getData().setName("brazil");
        entityManager.persist(result.getCountries().getBrazil());}
    static void addBritish_indian_ocean_territory(EntityManager entityManager, Json result){
        /*for(Border_countries bc : result.getCountries().getBritish_indian_ocean_territory().getData().getGeography().getLand_boundaries().getBorder_countries()){
        bc.setBorder(bc.getBorder_length().getValue());
        bc.setUnits(bc.getBorder_length().getUnits());
    }*/
        result.getCountries().getBritish_indian_ocean_territory().setName("british_indian_ocean_territory");

        result.getCountries().getBritish_indian_ocean_territory().getData().setName("british_indian_ocean_territory");
        entityManager.persist(result.getCountries().getBritish_indian_ocean_territory());}
    static void addBritish_virgin_islands(EntityManager entityManager, Json result){
        /*for(Border_countries bc : result.getCountries().getBritish_virgin_islands().getData().getGeography().getLand_boundaries().getBorder_countries()){
        bc.setBorder(bc.getBorder_length().getValue());
        bc.setUnits(bc.getBorder_length().getUnits());
    }*/
        result.getCountries().getBritish_virgin_islands().setName("british_virgin_islands");

        result.getCountries().getBritish_virgin_islands().getData().setName("british_virgin_islands");
        entityManager.persist(result.getCountries().getBritish_virgin_islands());}
    static void addBrunei(EntityManager entityManager, Json result){        for(Border_countries bc : result.getCountries().getBrunei().getData().getGeography().getLand_boundaries().getBorder_countries()){
        bc.setBorder(bc.getBorder_length().getValue());
        bc.setUnits(bc.getBorder_length().getUnits());
    }
        result.getCountries().getBrunei().setName("brunei");

        result.getCountries().getBrunei().getData().setName("brunei");
        entityManager.persist(result.getCountries().getBrunei());}
    static void addBulgaria(EntityManager entityManager, Json result){        for(Border_countries bc : result.getCountries().getBulgaria().getData().getGeography().getLand_boundaries().getBorder_countries()){
        bc.setBorder(bc.getBorder_length().getValue());
        bc.setUnits(bc.getBorder_length().getUnits());
    }
        result.getCountries().getBulgaria().setName("bulgaria");

        result.getCountries().getBulgaria().getData().setName("bulgaria");
        entityManager.persist(result.getCountries().getBulgaria());}
    static void addBurkina_faso(EntityManager entityManager, Json result){        for(Border_countries bc : result.getCountries().getBurkina_faso().getData().getGeography().getLand_boundaries().getBorder_countries()){
        bc.setBorder(bc.getBorder_length().getValue());
        bc.setUnits(bc.getBorder_length().getUnits());
    }
        result.getCountries().getBurkina_faso().setName("burkina_faso");

        result.getCountries().getBurkina_faso().getData().setName("burkina_faso");
        entityManager.persist(result.getCountries().getBurkina_faso());}
    static void addBurma(EntityManager entityManager, Json result){        for(Border_countries bc : result.getCountries().getBurma().getData().getGeography().getLand_boundaries().getBorder_countries()){
        bc.setBorder(bc.getBorder_length().getValue());
        bc.setUnits(bc.getBorder_length().getUnits());
    }
        result.getCountries().getBurma().setName("burma");

        result.getCountries().getBurma().getData().setName("burma");
        entityManager.persist(result.getCountries().getBurma());}
    static void addBurundi(EntityManager entityManager, Json result){
        if(!result.getCountries().getBurundi().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getBurundi().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getBurundi().setName("burundi");

        result.getCountries().getBurundi().getData().setName("burundi");
        entityManager.persist(result.getCountries().getBurundi());
    }

    static void addCabo_verde(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getCabo_verde().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getCabo_verde().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getCabo_verde().setName("cabo_verde");

        result.getCountries().getCabo_verde().getData().setName("cabo_verde");
        entityManager.persist(result.getCountries().getCabo_verde());
    }
    static void addCambodia(EntityManager entityManager, Json result){
        if(!result.getCountries().getCambodia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getCambodia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getCambodia().setName("cambodia");

        result.getCountries().getCambodia().getData().setName("cambodia");
        entityManager.persist(result.getCountries().getCambodia());
    }
    static void addCameroon(EntityManager entityManager, Json result){
        if(!result.getCountries().getCameroon().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getCameroon().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getCameroon().setName("cameroon");

        result.getCountries().getCameroon().getData().setName("cameroon");
        entityManager.persist(result.getCountries().getCameroon());
    }
    static void addCanada(EntityManager entityManager, Json result){
        if(!result.getCountries().getCanada().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getCanada().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getCanada().setName("canada");

        result.getCountries().getCanada().getData().setName("canada");
        entityManager.persist(result.getCountries().getCanada());
    }
    static void addCayman_islands(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getCayman_islands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getCayman_islands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getCayman_islands().setName("cayman_islands");

        result.getCountries().getCayman_islands().getData().setName("cayman_islands");
        entityManager.persist(result.getCountries().getCayman_islands());
    }
    static void addCentral_african_republic(EntityManager entityManager, Json result){
        if(!result.getCountries().getCentral_african_republic().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getCentral_african_republic().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getCentral_african_republic().setName("central_african_republic");

        result.getCountries().getCentral_african_republic().getData().setName("central_african_republic");
        entityManager.persist(result.getCountries().getCentral_african_republic());
    }
    static void addChad(EntityManager entityManager, Json result){
        if(!result.getCountries().getChad().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getChad().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getChad().setName("chad");

        result.getCountries().getChad().getData().setName("chad");
        entityManager.persist(result.getCountries().getChad());
    }
    static void addChile(EntityManager entityManager, Json result){
        if(!result.getCountries().getChile().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getChile().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getChile().setName("chile");

        result.getCountries().getChile().getData().setName("chile");
        entityManager.persist(result.getCountries().getChile());
    }
    static void addChina(EntityManager entityManager, Json result){
        if(!result.getCountries().getChina().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getChina().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getChina().setName("china");

        result.getCountries().getChina().getData().setName("china");
        entityManager.persist(result.getCountries().getChina());
    }
    static void addChristmas_island(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getChristmas_island().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getChristmas_island().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getChristmas_island().setName("christmas_island");

        result.getCountries().getChristmas_island().getData().setName("christmas_island");
        entityManager.persist(result.getCountries().getChristmas_island());
    }
    static void addClipperton_island(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getClipperton_island().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getClipperton_island().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getClipperton_island().setName("clipperton_island");

        result.getCountries().getClipperton_island().getData().setName("clipperton_island");
        entityManager.persist(result.getCountries().getClipperton_island());
    }
    static void addCocos_keeling_islands(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getCocos_keeling_islands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getCocos_keeling_islands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getCocos_keeling_islands().setName("cocos_keeling_islands");

        result.getCountries().getCocos_keeling_islands().getData().setName("cocos_keeling_islands");
        entityManager.persist(result.getCountries().getCocos_keeling_islands());
    }
    static void addColombia(EntityManager entityManager, Json result){
        if(!result.getCountries().getColombia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getColombia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getColombia().setName("colombia");

        result.getCountries().getColombia().getData().setName("colombia");
        entityManager.persist(result.getCountries().getColombia());
    }
    static void addComoros(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getComoros().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getComoros().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getComoros().setName("comoros");

        result.getCountries().getComoros().getData().setName("comoros");
        entityManager.persist(result.getCountries().getComoros());
    }
    static void addCongo_democratic_republic_of_the(EntityManager entityManager, Json result){
        if(!result.getCountries().getCongo_democratic_republic_of_the().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getCongo_democratic_republic_of_the().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getCongo_democratic_republic_of_the().setName("congo_democratic_republic_of_the");

        result.getCountries().getCongo_democratic_republic_of_the().getData().setName("congo_democratic_republic_of_the");
        entityManager.persist(result.getCountries().getCongo_democratic_republic_of_the());
    }
    static void addCongo_republic_of_the(EntityManager entityManager, Json result){
        if(!result.getCountries().getCongo_republic_of_the().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getCongo_republic_of_the().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getCongo_republic_of_the().setName("congo_republic_of_the");

        result.getCountries().getCongo_republic_of_the().getData().setName("congo_republic_of_the");
        entityManager.persist(result.getCountries().getCongo_republic_of_the());
    }
    static void addCook_islands(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getCook_islands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getCook_islands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getCook_islands().setName("cook_islands");

        result.getCountries().getCook_islands().getData().setName("cook_islands");
        entityManager.persist(result.getCountries().getCook_islands());
    }
    static void addCoral_sea_islands(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getCoral_sea_islands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getCoral_sea_islands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getCoral_sea_islands().setName("coral_sea_islands");

        result.getCountries().getCoral_sea_islands().getData().setName("coral_sea_islands");
        entityManager.persist(result.getCountries().getCoral_sea_islands());
    }
    static void addCosta_rica(EntityManager entityManager, Json result){
        if(!result.getCountries().getCosta_rica().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getCosta_rica().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getCosta_rica().setName("costa_rica");

        result.getCountries().getCosta_rica().getData().setName("costa_rica");
        entityManager.persist(result.getCountries().getCosta_rica());
    }
    static void addCroatia(EntityManager entityManager, Json result){
        if(!result.getCountries().getCroatia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getCroatia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getCroatia().setName("croatia");

        result.getCountries().getCroatia().getData().setName("croatia");
        entityManager.persist(result.getCountries().getCroatia());
    }
    static void addCuba(EntityManager entityManager, Json result){
        if(!result.getCountries().getCuba().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getCuba().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getCuba().setName("cuba");

        result.getCountries().getCuba().getData().setName("cuba");
        entityManager.persist(result.getCountries().getCuba());
    }
    static void addCuracao(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getCuracao().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getCuracao().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getCuracao().setName("curacao");

        result.getCountries().getCuracao().getData().setName("curacao");
        entityManager.persist(result.getCountries().getCuracao());
    }
    static void addCyprus(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getCyprus().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getCyprus().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getCyprus().setName("cyprus");

        result.getCountries().getCyprus().getData().setName("cyprus");
        entityManager.persist(result.getCountries().getCyprus());
    }
    static void addCzechia(EntityManager entityManager, Json result){
        if(!result.getCountries().getCzechia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getCzechia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getCzechia().setName("czechia");

        result.getCountries().getCzechia().getData().setName("czechia");
        entityManager.persist(result.getCountries().getCzechia());
    }
    /**
     * Metoda doająca dane państw na literę C
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */

    static void addC(EntityManager entityManager, Json result){
       addCabo_verde(entityManager,result);
       addCambodia(entityManager,result);
       addCameroon(entityManager,result);
       addCanada(entityManager,result);
       addCayman_islands(entityManager,result);
       addCentral_african_republic(entityManager,result);
       addChad(entityManager,result);
       addChile(entityManager,result);
       addChina(entityManager,result);
       addChristmas_island(entityManager,result);
       addClipperton_island(entityManager,result);
       addCocos_keeling_islands(entityManager,result);
       addColombia(entityManager,result);
       addComoros(entityManager,result);
       addCongo_democratic_republic_of_the(entityManager,result);
       addCongo_republic_of_the(entityManager,result);
       addCook_islands(entityManager,result);
       addCoral_sea_islands(entityManager,result);
       addCosta_rica(entityManager,result);
       addCroatia(entityManager,result);
       addCuba(entityManager,result);
       addCuracao(entityManager,result);
       addCyprus(entityManager,result);
       addCzechia(entityManager,result);


    }

    /**
     * Metoda doająca dane państw na literę B
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addB(EntityManager entityManager, Json result){
        addBahamas_the(entityManager,result);
        addBahrain(entityManager,result);
        addBangladesh(entityManager,result);
        addBarbados(entityManager,result);
        addBelarus(entityManager,result);
        addBelgium(entityManager,result);
       addBelize(entityManager,result);
        addBenin(entityManager,result);
        addBermuda(entityManager,result);
        addBhutan(entityManager,result);
        addBolivia(entityManager,result);
        addBosnia_and_herzegovina(entityManager,result);
        addBotswana(entityManager,result);
        addBouvet_island(entityManager,result);
        addBrazil(entityManager,result);
        addBritish_indian_ocean_territory(entityManager,result);
        addBritish_virgin_islands(entityManager,result);
        addBrunei(entityManager,result);
        addBulgaria(entityManager,result);
        addBurkina_faso(entityManager,result);
        /*addBurma(entityManager,result); ma jakiegos dziwnego stringa, więc na razie go nie dodajemy*/
        addBurundi(entityManager,result);
    }

    static void addDenmark(EntityManager entityManager, Json result){
        if(!result.getCountries().getDenmark().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getDenmark().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getDenmark().setName("denmark");

        result.getCountries().getDenmark().getData().setName("denmark");
        entityManager.persist(result.getCountries().getDenmark());
    }
    static void addDhekelia(EntityManager entityManager, Json result){
        if(!result.getCountries().getDhekelia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getDhekelia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getDhekelia().setName("dhekelia");

        result.getCountries().getDhekelia().getData().setName("dhekelia");
        entityManager.persist(result.getCountries().getDhekelia());
    }
    static void addDjibouti(EntityManager entityManager, Json result){
        if(!result.getCountries().getDjibouti().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getDjibouti().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getDjibouti().setName("djibouti");

        result.getCountries().getDjibouti().getData().setName("djibouti");
        entityManager.persist(result.getCountries().getDjibouti());
    }
    static void addDominica(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getDominica().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getDominica().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getDominica().setName("dominica");

        result.getCountries().getDominica().getData().setName("dominica");
        entityManager.persist(result.getCountries().getDominica());
    }
    static void addDominican_republic(EntityManager entityManager, Json result){
        if(!result.getCountries().getDominican_republic().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getDominican_republic().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getDominican_republic().setName("dominican_republic");

        result.getCountries().getDominican_republic().getData().setName("dominican_republic");
        entityManager.persist(result.getCountries().getDominican_republic());
    }

    /**
     * Metoda doająca dane państw na literę D
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addD(EntityManager entityManager, Json result){
        addDenmark(entityManager,result);
        addDhekelia(entityManager,result);
        addDjibouti(entityManager,result);
        addDominica(entityManager,result);
        addDominican_republic(entityManager,result);


    }

    static void addEcuador(EntityManager entityManager, Json result){
        if(!result.getCountries().getEcuador().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getEcuador().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getEcuador().setName("ecuador");

        result.getCountries().getEcuador().getData().setName("ecuador");
        entityManager.persist(result.getCountries().getEcuador());
    }
    static void addEgypt(EntityManager entityManager, Json result){
        if(!result.getCountries().getEgypt().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getEgypt().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getEgypt().setName("egypt");

        result.getCountries().getEgypt().getData().setName("egypt");
        entityManager.persist(result.getCountries().getEgypt());
    }
    static void addEl_salvador(EntityManager entityManager, Json result){
        if(!result.getCountries().getEl_salvador().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getEl_salvador().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getEl_salvador().setName("el_salvador");

        result.getCountries().getEl_salvador().getData().setName("el_salvador");
        entityManager.persist(result.getCountries().getEl_salvador());
    }
    static void addEquatorial_guinea(EntityManager entityManager, Json result){
        if(!result.getCountries().getEquatorial_guinea().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getEquatorial_guinea().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getEquatorial_guinea().setName("equatorial_guinea");

        result.getCountries().getEquatorial_guinea().getData().setName("equatorial_guinea");
        entityManager.persist(result.getCountries().getEquatorial_guinea());
    }
    static void addEritrea(EntityManager entityManager, Json result){
        if(!result.getCountries().getEritrea().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getEritrea().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getEritrea().setName("eritrea");

        result.getCountries().getEritrea().getData().setName("eritrea");
        entityManager.persist(result.getCountries().getEritrea());
    }
    static void addEstonia(EntityManager entityManager, Json result){
        if(!result.getCountries().getEstonia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getEstonia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getEstonia().setName("estonia");

        result.getCountries().getEstonia().getData().setName("estonia");
        entityManager.persist(result.getCountries().getEstonia());
    }
    static void addEthiopia(EntityManager entityManager, Json result){
        if(!result.getCountries().getEthiopia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getEthiopia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getEthiopia().setName("ethiopia");

        result.getCountries().getEthiopia().getData().setName("ethiopia");
        entityManager.persist(result.getCountries().getEthiopia());
    }

    /**
     * Metoda doająca dane państw na literę E
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addE(EntityManager entityManager, Json result){
        addEcuador(entityManager,result);
        addEgypt(entityManager,result);
        addEl_salvador(entityManager,result);
        addEquatorial_guinea(entityManager,result);
        addEritrea(entityManager,result);
        addEstonia(entityManager,result);
        addEthiopia(entityManager,result);
    }

    static void addFalkland_islands_islas_malvinas(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getFalkland_islands_islas_malvinas().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getFalkland_islands_islas_malvinas().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getFalkland_islands_islas_malvinas().setName("falkland_islands_islas_malvinas");

        result.getCountries().getFalkland_islands_islas_malvinas().getData().setName("falkland_islands_islas_malvinas");
        entityManager.persist(result.getCountries().getFalkland_islands_islas_malvinas());
    }
    static void addFaroe_islands(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getFaroe_islands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getFaroe_islands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getFaroe_islands().setName("faroe_islands");

        result.getCountries().getFaroe_islands().getData().setName("faroe_islands");
        entityManager.persist(result.getCountries().getFaroe_islands());
    }
    static void addFiji(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getFiji().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getFiji().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getFiji().setName("fiji");

        result.getCountries().getFiji().getData().setName("fiji");
        entityManager.persist(result.getCountries().getFiji());
    }
    static void addFinland(EntityManager entityManager, Json result){
        if(!result.getCountries().getFinland().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getFinland().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getFinland().setName("finland");

        result.getCountries().getFinland().getData().setName("finland");
        entityManager.persist(result.getCountries().getFinland());
    }
    static void addFrance(EntityManager entityManager, Json result){
        if(!result.getCountries().getFrance().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getFrance().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getFrance().setName("france");

        result.getCountries().getFrance().getData().setName("france");
        entityManager.persist(result.getCountries().getFrance());
    }
    static void addFrench_polynesia(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getFrench_polynesia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getFrench_polynesia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getFrench_polynesia().setName("french_polynesia");

        result.getCountries().getFrench_polynesia().getData().setName("french_polynesia");
        entityManager.persist(result.getCountries().getFrench_polynesia());
    }

    /**
     * Metoda doająca dane państw na literę F
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addF(EntityManager entityManager, Json result){
        addFalkland_islands_islas_malvinas(entityManager,result);
        addFaroe_islands(entityManager,result);
        addFiji(entityManager,result);
        addFinland(entityManager,result);
        addFrance(entityManager,result);
        addFrench_polynesia(entityManager,result);
    }

    static void addGabon(EntityManager entityManager, Json result){
        if(!result.getCountries().getGabon().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getGabon().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getGabon().setName("gabon");

        result.getCountries().getGabon().getData().setName("gabon");
        entityManager.persist(result.getCountries().getGabon());
    }
    static void addGambia_the(EntityManager entityManager, Json result){
        if(!result.getCountries().getGambia_the().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getGambia_the().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getGambia_the().setName("gambia_the");

        result.getCountries().getGambia_the().getData().setName("gambia_the");
        entityManager.persist(result.getCountries().getGambia_the());
    }
    static void addGaza_strip(EntityManager entityManager, Json result){
        if(!result.getCountries().getGaza_strip().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getGaza_strip().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getGaza_strip().setName("gaza_strip");

        result.getCountries().getGaza_strip().getData().setName("gaza_strip");
        entityManager.persist(result.getCountries().getGaza_strip());
    }
    static void addGeorgia(EntityManager entityManager, Json result){
        if(!result.getCountries().getGeorgia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getGeorgia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getGeorgia().setName("georgia");

        result.getCountries().getGeorgia().getData().setName("georgia");
        entityManager.persist(result.getCountries().getGeorgia());
    }
    static void addGermany(EntityManager entityManager, Json result){
        if(!result.getCountries().getGermany().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getGermany().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getGermany().setName("germany");

        result.getCountries().getGermany().getData().setName("germany");
        entityManager.persist(result.getCountries().getGermany());
    }
    static void addGhana(EntityManager entityManager, Json result){
        if(!result.getCountries().getGhana().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getGhana().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getGhana().setName("ghana");

        result.getCountries().getGhana().getData().setName("ghana");
        entityManager.persist(result.getCountries().getGhana());
    }
    static void addGibraltar(EntityManager entityManager, Json result){
        if(!result.getCountries().getGibraltar().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getGibraltar().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getGibraltar().setName("gibraltar");

        result.getCountries().getGibraltar().getData().setName("gibraltar");
        entityManager.persist(result.getCountries().getGibraltar());
    }
    static void addGreece(EntityManager entityManager, Json result){
        if(!result.getCountries().getGreece().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getGreece().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getGreece().setName("greece");

        result.getCountries().getGreece().getData().setName("greece");
        entityManager.persist(result.getCountries().getGreece());
    }
    static void addGreenland(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getGreenland().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getGreenland().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getGreenland().setName("greenland");

        result.getCountries().getGreenland().getData().setName("greenland");
        entityManager.persist(result.getCountries().getGreenland());
    }
    static void addGrenada(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getGrenada().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getGrenada().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getGrenada().setName("grenada");

        result.getCountries().getGrenada().getData().setName("grenada");
        entityManager.persist(result.getCountries().getGrenada());
    }
    static void addGuam(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getGuam().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getGuam().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getGuam().setName("guam");

        result.getCountries().getGuam().getData().setName("guam");
        entityManager.persist(result.getCountries().getGuam());
    }
    static void addGuatemala(EntityManager entityManager, Json result){
        if(!result.getCountries().getGuatemala().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getGuatemala().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getGuatemala().setName("guatemala");

        result.getCountries().getGuatemala().getData().setName("guatemala");
        entityManager.persist(result.getCountries().getGuatemala());
    }
    static void addGuernsey(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getGuernsey().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getGuernsey().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getGuernsey().setName("guernsey");

        result.getCountries().getGuernsey().getData().setName("guernsey");
        entityManager.persist(result.getCountries().getGuernsey());
    }
    static void addGuinea(EntityManager entityManager, Json result){
        if(!result.getCountries().getGuinea().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getGuinea().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getGuinea().setName("guinea");

        result.getCountries().getGuinea().getData().setName("guinea");
        entityManager.persist(result.getCountries().getGuinea());
    }
    static void addGuinea_bissau(EntityManager entityManager, Json result){
        if(!result.getCountries().getGuinea_bissau().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getGuinea_bissau().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getGuinea_bissau().setName("guinea_bissau");

        result.getCountries().getGuinea_bissau().getData().setName("guinea_bissau");
        entityManager.persist(result.getCountries().getGuinea_bissau());
    }
    static void addGuyana(EntityManager entityManager, Json result){
        if(!result.getCountries().getGuyana().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getGuyana().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getGuyana().setName("guyana");

        result.getCountries().getGuyana().getData().setName("guyana");
        entityManager.persist(result.getCountries().getGuyana());
    }

    /**
     * Metoda doająca dane państw na literę G
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addG(EntityManager entityManager, Json result){
        addGabon(entityManager,result);
        addGambia_the(entityManager,result);
        addGaza_strip(entityManager,result);
        addGeorgia(entityManager,result);
        addGermany(entityManager,result);
        addGhana(entityManager,result);
        addGibraltar(entityManager,result);
        addGreece(entityManager,result);
        addGreenland(entityManager,result);
        addGrenada(entityManager,result);
        addGuam(entityManager,result);
        addGuatemala(entityManager,result);
        addGuernsey(entityManager,result);
        addGuinea(entityManager,result);
        addGuinea_bissau(entityManager,result);
        addGuyana(entityManager,result);
      }

    static void addHaiti(EntityManager entityManager, Json result){
        if(!result.getCountries().getHaiti().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getHaiti().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getHaiti().setName("haiti");

        result.getCountries().getHaiti().getData().setName("haiti");
        entityManager.persist(result.getCountries().getHaiti());
    }
    static void addHeard_island_and_mcdonald_islands(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getHeard_island_and_mcdonald_islands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getHeard_island_and_mcdonald_islands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getHeard_island_and_mcdonald_islands().setName("heard_island_and_mcdonald_islands");

        result.getCountries().getHeard_island_and_mcdonald_islands().getData().setName("heard_island_and_mcdonald_islands");
        entityManager.persist(result.getCountries().getHeard_island_and_mcdonald_islands());
    }
    static void addHoly_see_vatican_city(EntityManager entityManager, Json result){
        if(!result.getCountries().getHoly_see_vatican_city().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getHoly_see_vatican_city().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getHoly_see_vatican_city().setName("holy_see_vatican_city");

        result.getCountries().getHoly_see_vatican_city().getData().setName("holy_see_vatican_city");
        entityManager.persist(result.getCountries().getHoly_see_vatican_city());
    }
    static void addHonduras(EntityManager entityManager, Json result){
        if(!result.getCountries().getHonduras().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getHonduras().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getHonduras().setName("honduras");

        result.getCountries().getHonduras().getData().setName("honduras");
        entityManager.persist(result.getCountries().getHonduras());
    }
    static void addHong_kong(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getHong_kong().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getHong_kong().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getHong_kong().setName("hong_kong");

        result.getCountries().getHong_kong().getData().setName("hong_kong");
        entityManager.persist(result.getCountries().getHong_kong());
    }
    static void addHungary(EntityManager entityManager, Json result){
        if(!result.getCountries().getHungary().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getHungary().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getHungary().setName("hungary");

        result.getCountries().getHungary().getData().setName("hungary");
        entityManager.persist(result.getCountries().getHungary());
    }

    /**
     * Metoda doająca dane państw na literę H
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addH(EntityManager entityManager, Json result){
        addHaiti(entityManager,result);
        addHeard_island_and_mcdonald_islands(entityManager,result);
        addHoly_see_vatican_city(entityManager,result);
        addHonduras(entityManager,result);
        addHong_kong(entityManager,result);
        addHungary(entityManager,result);
    }

    static void addIceland(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getIceland().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getIceland().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getIceland().setName("iceland");

        result.getCountries().getIceland().getData().setName("iceland");
        entityManager.persist(result.getCountries().getIceland());
    }
    static void addIndia(EntityManager entityManager, Json result){
        if(!result.getCountries().getIndia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getIndia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getIndia().setName("india");

        result.getCountries().getIndia().getData().setName("india");
        entityManager.persist(result.getCountries().getIndia());
    }
    static void addIndian_ocean(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getIndian_ocean().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getIndian_ocean().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getIndian_ocean().setName("indian_ocean");

        result.getCountries().getIndian_ocean().getData().setName("indian_ocean");
        entityManager.persist(result.getCountries().getIndian_ocean());
    }
    static void addIndonesia(EntityManager entityManager, Json result){
        if(!result.getCountries().getIndonesia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getIndonesia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getIndonesia().setName("indonesia");

        result.getCountries().getIndonesia().getData().setName("indonesia");
        entityManager.persist(result.getCountries().getIndonesia());
    }
    static void addIran(EntityManager entityManager, Json result){
        if(!result.getCountries().getIran().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getIran().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getIran().setName("iran");

        result.getCountries().getIran().getData().setName("iran");
        entityManager.persist(result.getCountries().getIran());
    }
    static void addIraq(EntityManager entityManager, Json result){
        if(!result.getCountries().getIraq().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getIraq().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getIraq().setName("iraq");

        result.getCountries().getIraq().getData().setName("iraq");
        entityManager.persist(result.getCountries().getIraq());
    }
    static void addIreland(EntityManager entityManager, Json result){
        if(!result.getCountries().getIreland().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getIreland().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getIreland().setName("ireland");

        result.getCountries().getIreland().getData().setName("ireland");
        entityManager.persist(result.getCountries().getIreland());
    }
    static void addIsle_of_man(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getIsle_of_man().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getIsle_of_man().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getIsle_of_man().setName("isle_of_man");

        result.getCountries().getIsle_of_man().getData().setName("isle_of_man");
        entityManager.persist(result.getCountries().getIsle_of_man());
    }
    static void addIsrael(EntityManager entityManager, Json result){
        if(!result.getCountries().getIsrael().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getIsrael().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getIsrael().setName("israel");

        result.getCountries().getIsrael().getData().setName("israel");
        entityManager.persist(result.getCountries().getIsrael());
    }
    static void addItaly(EntityManager entityManager, Json result){
        if(!result.getCountries().getItaly().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getItaly().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getItaly().setName("italy");

        result.getCountries().getItaly().getData().setName("italy");
        entityManager.persist(result.getCountries().getItaly());
    }

    /**
     * Metoda doająca dane państw na literę I
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addI(EntityManager entityManager, Json result){
        addIceland(entityManager,result);
        addIndia(entityManager,result);
        addIndian_ocean(entityManager,result);
        addIndonesia(entityManager,result);
        addIran(entityManager,result);
        addIraq(entityManager,result);
        addIreland(entityManager,result);
        addIsle_of_man(entityManager,result);
        addIsrael(entityManager,result);
        addItaly(entityManager,result);

    }

    static void addJamaica(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getJamaica().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getJamaica().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getJamaica().setName("jamaica");

        result.getCountries().getJamaica().getData().setName("jamaica");
        entityManager.persist(result.getCountries().getJamaica());
    }
    static void addJan_mayen(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getJan_mayen().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getJan_mayen().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getJan_mayen().setName("jan_mayen");

        result.getCountries().getJan_mayen().getData().setName("jan_mayen");
        entityManager.persist(result.getCountries().getJan_mayen());
    }
    static void addJapan(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getJapan().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getJapan().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getJapan().setName("japan");

        result.getCountries().getJapan().getData().setName("japan");
        entityManager.persist(result.getCountries().getJapan());
    }
    static void addJersey(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getJersey().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getJersey().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getJersey().setName("jersey");

        result.getCountries().getJersey().getData().setName("jersey");
        entityManager.persist(result.getCountries().getJersey());
    }
    static void addJordan(EntityManager entityManager, Json result){
        if(!result.getCountries().getJordan().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getJordan().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getJordan().setName("jordan");

        result.getCountries().getJordan().getData().setName("jordan");
        entityManager.persist(result.getCountries().getJordan());
    }

    /**
     * Metoda doająca dane państw na literę J
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addJ(EntityManager entityManager, Json result){
        addJamaica(entityManager,result);
        addJan_mayen(entityManager,result);
        addJapan(entityManager,result);
        addJersey(entityManager,result);
        addJordan(entityManager,result);
    }

    static void addKazakhstan(EntityManager entityManager, Json result){
        if(!result.getCountries().getKazakhstan().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getKazakhstan().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getKazakhstan().setName("kazakhstan");

        result.getCountries().getKazakhstan().getData().setName("kazakhstan");
        entityManager.persist(result.getCountries().getKazakhstan());
    }
    static void addKenya(EntityManager entityManager, Json result){
        if(!result.getCountries().getKenya().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getKenya().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getKenya().setName("kenya");

        result.getCountries().getKenya().getData().setName("kenya");
        entityManager.persist(result.getCountries().getKenya());
    }
    static void addKiribati(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getKiribati().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getKiribati().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getKiribati().setName("kiribati");

        result.getCountries().getKiribati().getData().setName("kiribati");
        entityManager.persist(result.getCountries().getKiribati());
    }
    static void addKorea_north(EntityManager entityManager, Json result){
        if(!result.getCountries().getKorea_north().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getKorea_north().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getKorea_north().setName("korea_north");

        result.getCountries().getKorea_north().getData().setName("korea_north");
        entityManager.persist(result.getCountries().getKorea_north());
    }
    static void addKorea_south(EntityManager entityManager, Json result){
        if(!result.getCountries().getKorea_south().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getKorea_south().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getKorea_south().setName("korea_south");

        result.getCountries().getKorea_south().getData().setName("korea_south");
        entityManager.persist(result.getCountries().getKorea_south());
    }
    static void addKosovo(EntityManager entityManager, Json result){
        if(!result.getCountries().getKosovo().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getKosovo().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getKosovo().setName("kosovo");

        result.getCountries().getKosovo().getData().setName("kosovo");
        entityManager.persist(result.getCountries().getKosovo());
    }
    static void addKyrgyzstan(EntityManager entityManager, Json result){
        if(!result.getCountries().getKyrgyzstan().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getKyrgyzstan().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getKyrgyzstan().setName("kyrgyzstan");

        result.getCountries().getKyrgyzstan().getData().setName("kyrgyzstan");
        entityManager.persist(result.getCountries().getKyrgyzstan());
    }

    /**
     * Metoda doająca dane państw na literę K
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addK(EntityManager entityManager, Json result){
        addKazakhstan(entityManager,result);
        addKenya(entityManager,result);
        addKiribati(entityManager,result);
        addKorea_north(entityManager,result);
        addKorea_south(entityManager,result);
        addKosovo(entityManager,result);
        addKyrgyzstan(entityManager,result);
    }

    static void addLaos(EntityManager entityManager, Json result){
        if(!result.getCountries().getLaos().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getLaos().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getLaos().setName("laos");

        result.getCountries().getLaos().getData().setName("laos");
        entityManager.persist(result.getCountries().getLaos());
    }

    static void addLatvia(EntityManager entityManager, Json result){
        if(!result.getCountries().getLatvia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getLatvia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getLatvia().setName("latvia");

        result.getCountries().getLatvia().getData().setName("latvia");
        entityManager.persist(result.getCountries().getLatvia());
    }
    static void addLebanon(EntityManager entityManager, Json result){
        if(!result.getCountries().getLebanon().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getLebanon().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getLebanon().setName("lebanon");

        result.getCountries().getLebanon().getData().setName("lebanon");
        entityManager.persist(result.getCountries().getLebanon());
    }
    static void addLesotho(EntityManager entityManager, Json result){
        if(!result.getCountries().getLesotho().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getLesotho().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getLesotho().setName("lesotho");

        result.getCountries().getLesotho().getData().setName("lesotho");
        entityManager.persist(result.getCountries().getLesotho());
    }
    static void addLiberia(EntityManager entityManager, Json result){
        if(!result.getCountries().getLiberia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getLiberia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getLiberia().setName("liberia");

        result.getCountries().getLiberia().getData().setName("liberia");
        entityManager.persist(result.getCountries().getLiberia());
    }
    static void addLibya(EntityManager entityManager, Json result){
        if(!result.getCountries().getLibya().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getLibya().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getLibya().setName("libya");

        result.getCountries().getLibya().getData().setName("libya");
        entityManager.persist(result.getCountries().getLibya());
    }
    static void addLiechtenstein(EntityManager entityManager, Json result){
        if(!result.getCountries().getLiechtenstein().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getLiechtenstein().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getLiechtenstein().setName("liechtenstein");

        result.getCountries().getLiechtenstein().getData().setName("liechtenstein");
        entityManager.persist(result.getCountries().getLiechtenstein());
    }
    static void addLithuania(EntityManager entityManager, Json result){
        if(!result.getCountries().getLithuania().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getLithuania().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getLithuania().setName("lithuania");

        result.getCountries().getLithuania().getData().setName("lithuania");
        entityManager.persist(result.getCountries().getLithuania());
    }
    static void addLuxembourg(EntityManager entityManager, Json result){
        if(!result.getCountries().getLuxembourg().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getLuxembourg().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getLuxembourg().setName("luxembourg");

        result.getCountries().getLuxembourg().getData().setName("luxembourg");
        entityManager.persist(result.getCountries().getLuxembourg());
    }

    /**
     * Metoda doająca dane państw na literę L
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addL(EntityManager entityManager, Json result){
      addLatvia( entityManager, result );
        addLebanon(entityManager,result);
        addLesotho(entityManager,result);
        addLiberia(entityManager,result);
        addLibya(entityManager,result);
        addLiechtenstein(entityManager,result);
        addLithuania(entityManager,result);
        addLuxembourg(entityManager,result);
    }

    static void addMacau(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getMacau().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getMacau().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getMacau().setName("macau");

        result.getCountries().getMacau().getData().setName("macau");
        entityManager.persist(result.getCountries().getMacau());
    }
    static void addMacedonia(EntityManager entityManager, Json result){
        if(!result.getCountries().getMacedonia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getMacedonia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getMacedonia().setName("macedonia");

        result.getCountries().getMacedonia().getData().setName("macedonia");
        entityManager.persist(result.getCountries().getMacedonia());
    }
    static void addMadagascar(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getMadagascar().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getMadagascar().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getMadagascar().setName("madagascar");

        result.getCountries().getMadagascar().getData().setName("madagascar");
        entityManager.persist(result.getCountries().getMadagascar());
    }
    static void addMalawi(EntityManager entityManager, Json result){
        if(!result.getCountries().getMalawi().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getMalawi().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getMalawi().setName("malawi");

        result.getCountries().getMalawi().getData().setName("malawi");
        entityManager.persist(result.getCountries().getMalawi());
    }
    static void addMalaysia(EntityManager entityManager, Json result){
        if(!result.getCountries().getMalaysia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getMalaysia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getMalaysia().setName("malaysia");

        result.getCountries().getMalaysia().getData().setName("malaysia");
        entityManager.persist(result.getCountries().getMalaysia());
    }
    static void addMaldives(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getMaldives().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getMaldives().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getMaldives().setName("maldives");

        result.getCountries().getMaldives().getData().setName("maldives");
        entityManager.persist(result.getCountries().getMaldives());
    }
    static void addMali(EntityManager entityManager, Json result){
        if(!result.getCountries().getMali().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getMali().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getMali().setName("mali");

        result.getCountries().getMali().getData().setName("mali");
        entityManager.persist(result.getCountries().getMali());
    }
    static void addMalta(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getMalta().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getMalta().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getMalta().setName("malta");

        result.getCountries().getMalta().getData().setName("malta");
        entityManager.persist(result.getCountries().getMalta());
    }
    static void addMarshall_islands(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getMarshall_islands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getMarshall_islands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getMarshall_islands().setName("marshall_islands");

        result.getCountries().getMarshall_islands().getData().setName("marshall_islands");
        entityManager.persist(result.getCountries().getMarshall_islands());
    }
    static void addMauritania(EntityManager entityManager, Json result){
        if(!result.getCountries().getMauritania().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getMauritania().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getMauritania().setName("mauritania");

        result.getCountries().getMauritania().getData().setName("mauritania");
        entityManager.persist(result.getCountries().getMauritania());
    }
    static void addMauritius(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getMauritius().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getMauritius().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getMauritius().setName("mauritius");

        result.getCountries().getMauritius().getData().setName("mauritius");
        entityManager.persist(result.getCountries().getMauritius());
    }
    static void addMexico(EntityManager entityManager, Json result){
        if(!result.getCountries().getMexico().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getMexico().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getMexico().setName("mexico");

        result.getCountries().getMexico().getData().setName("mexico");
        entityManager.persist(result.getCountries().getMexico());
    }
    static void addMicronesia_federated_states_of(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getMicronesia_federated_states_of().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getMicronesia_federated_states_of().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getMicronesia_federated_states_of().setName("micronesia_federated_states_of");

        result.getCountries().getMicronesia_federated_states_of().getData().setName("micronesia_federated_states_of");
        entityManager.persist(result.getCountries().getMicronesia_federated_states_of());
    }
    static void addMoldova(EntityManager entityManager, Json result){
        if(!result.getCountries().getMoldova().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getMoldova().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getMoldova().setName("moldova");

        result.getCountries().getMoldova().getData().setName("moldova");
        entityManager.persist(result.getCountries().getMoldova());
    }
    static void addMonaco(EntityManager entityManager, Json result){
        if(!result.getCountries().getMonaco().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getMonaco().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getMonaco().setName("monaco");

        result.getCountries().getMonaco().getData().setName("monaco");
        entityManager.persist(result.getCountries().getMonaco());
    }
    static void addMongolia(EntityManager entityManager, Json result){
        if(!result.getCountries().getMongolia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getMongolia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getMongolia().setName("mongolia");

        result.getCountries().getMongolia().getData().setName("mongolia");
        entityManager.persist(result.getCountries().getMongolia());
    }
    static void addMontenegro(EntityManager entityManager, Json result){
        if(!result.getCountries().getMontenegro().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getMontenegro().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getMontenegro().setName("montenegro");

        result.getCountries().getMontenegro().getData().setName("montenegro");
        entityManager.persist(result.getCountries().getMontenegro());
    }
    static void addMontserrat(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getMontserrat().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getMontserrat().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getMontserrat().setName("montserrat");

        result.getCountries().getMontserrat().getData().setName("montserrat");
        entityManager.persist(result.getCountries().getMontserrat());
    }
    static void addMorocco(EntityManager entityManager, Json result){
        if(!result.getCountries().getMorocco().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getMorocco().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getMorocco().setName("morocco");

        result.getCountries().getMorocco().getData().setName("morocco");
        entityManager.persist(result.getCountries().getMorocco());
    }
    static void addMozambique(EntityManager entityManager, Json result){
        if(!result.getCountries().getMozambique().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getMozambique().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getMozambique().setName("mozambique");

        result.getCountries().getMozambique().getData().setName("mozambique");
        entityManager.persist(result.getCountries().getMozambique());
    }

    /**
     * Metoda doająca dane państw na literę M
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addM(EntityManager entityManager, Json result){
        addMacau(entityManager,result);
        addMacedonia(entityManager,result);
        addMadagascar(entityManager,result);
        addMalawi(entityManager,result);
        addMalaysia(entityManager,result);
        addMaldives(entityManager,result);
        addMali(entityManager,result);
        addMalta(entityManager,result);
        addMarshall_islands(entityManager,result);
        addMauritania(entityManager,result);
        addMauritius(entityManager,result);
        addMexico(entityManager,result);
        addMicronesia_federated_states_of(entityManager,result);
        addMoldova(entityManager,result);
        addMonaco(entityManager,result);
        addMongolia(entityManager,result);
        addMontenegro(entityManager,result);
        addMontserrat(entityManager,result);
        addMorocco(entityManager,result);
        addMozambique(entityManager,result);
    }

    static void addNamibia(EntityManager entityManager, Json result){
        if(!result.getCountries().getNamibia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getNamibia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getNamibia().setName("namibia");

        result.getCountries().getNamibia().getData().setName("namibia");
        entityManager.persist(result.getCountries().getNamibia());
    }
    static void addNauru(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getNauru().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getNauru().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getNauru().setName("nauru");

        result.getCountries().getNauru().getData().setName("nauru");
        entityManager.persist(result.getCountries().getNauru());
    }
    static void addNavassa_island(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getNavassa_island().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getNavassa_island().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getNavassa_island().setName("navassa_island");

        result.getCountries().getNavassa_island().getData().setName("navassa_island");
        entityManager.persist(result.getCountries().getNavassa_island());
    }
    static void addNepal(EntityManager entityManager, Json result){
        if(!result.getCountries().getNepal().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getNepal().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getNepal().setName("nepal");

        result.getCountries().getNepal().getData().setName("nepal");
        entityManager.persist(result.getCountries().getNepal());
    }
    static void addNetherlands(EntityManager entityManager, Json result){
        if(!result.getCountries().getNetherlands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getNetherlands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getNetherlands().setName("netherlands");

        result.getCountries().getNetherlands().getData().setName("netherlands");
        entityManager.persist(result.getCountries().getNetherlands());
    }
    static void addNew_caledonia(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getNew_caledonia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getNew_caledonia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getNew_caledonia().setName("new_caledonia");

        result.getCountries().getNew_caledonia().getData().setName("new_caledonia");
        entityManager.persist(result.getCountries().getNew_caledonia());
    }
    static void addNew_zealand(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getNew_zealand().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getNew_zealand().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getNew_zealand().setName("new_zealand");

        result.getCountries().getNew_zealand().getData().setName("new_zealand");
        entityManager.persist(result.getCountries().getNew_zealand());
    }
    static void addNicaragua(EntityManager entityManager, Json result){
        if(!result.getCountries().getNicaragua().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getNicaragua().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getNicaragua().setName("nicaragua");

        result.getCountries().getNicaragua().getData().setName("nicaragua");
        entityManager.persist(result.getCountries().getNicaragua());
    }
    static void addNiger(EntityManager entityManager, Json result){
        if(!result.getCountries().getNiger().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getNiger().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getNiger().setName("niger");

        result.getCountries().getNiger().getData().setName("niger");
        entityManager.persist(result.getCountries().getNiger());
    }
    static void addNigeria(EntityManager entityManager, Json result){
        if(!result.getCountries().getNigeria().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getNigeria().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getNigeria().setName("nigeria");

        result.getCountries().getNigeria().getData().setName("nigeria");
        entityManager.persist(result.getCountries().getNigeria());
    }
    static void addNiue(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getNiue().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getNiue().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getNiue().setName("niue");

        result.getCountries().getNiue().getData().setName("niue");
        entityManager.persist(result.getCountries().getNiue());
    }
    static void addNorfolk_island(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getNorfolk_island().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getNorfolk_island().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getNorfolk_island().setName("norfolk_island");

        result.getCountries().getNorfolk_island().getData().setName("norfolk_island");
        entityManager.persist(result.getCountries().getNorfolk_island());
    }
    static void addNorthern_mariana_islands(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getNorthern_mariana_islands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getNorthern_mariana_islands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getNorthern_mariana_islands().setName("northern_mariana_islands");

        result.getCountries().getNorthern_mariana_islands().getData().setName("northern_mariana_islands");
        entityManager.persist(result.getCountries().getNorthern_mariana_islands());
    }
    static void addNorway(EntityManager entityManager, Json result){
        if(!result.getCountries().getNorway().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getNorway().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getNorway().setName("norway");

        result.getCountries().getNorway().getData().setName("norway");
        entityManager.persist(result.getCountries().getNorway());
    }

    /**
     * Metoda doająca dane państw na literę N
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addN(EntityManager entityManager, Json result){
        addNamibia(entityManager,result);
        addNauru(entityManager,result);
        addNavassa_island(entityManager,result);
        addNepal(entityManager,result);
        addNetherlands(entityManager,result);
        addNew_caledonia(entityManager,result);
        addNew_zealand(entityManager,result);
        addNicaragua(entityManager,result);
        addNiger(entityManager,result);
        addNigeria(entityManager,result);
        addNiue(entityManager,result);
        addNorfolk_island(entityManager,result);
        addNorthern_mariana_islands(entityManager,result);
        addNorway(entityManager,result);
    }

    static void addOman(EntityManager entityManager, Json result){
        if(!result.getCountries().getOman().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getOman().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getOman().setName("oman");

        result.getCountries().getOman().getData().setName("oman");
        entityManager.persist(result.getCountries().getOman());
    }

    /**
     * Metoda doająca dane państw na literę O
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addO(EntityManager entityManager, Json result){
        addOman(entityManager,result);
    }

    static void addParacel_islands(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getParacel_islands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getParacel_islands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getParacel_islands().setName("paracel_islands");

        result.getCountries().getParacel_islands().getData().setName("paracel_islands");
        entityManager.persist(result.getCountries().getParacel_islands());
    }
    static void addParaguay(EntityManager entityManager, Json result){
        if(!result.getCountries().getParaguay().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getParaguay().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getParaguay().setName("paraguay");

        result.getCountries().getParaguay().getData().setName("paraguay");
        entityManager.persist(result.getCountries().getParaguay());
    }
    static void addPeru(EntityManager entityManager, Json result){
        if(!result.getCountries().getPeru().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getPeru().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getPeru().setName("peru");

        result.getCountries().getPeru().getData().setName("peru");
        entityManager.persist(result.getCountries().getPeru());
    }
    static void addPhilippines(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getPhilippines().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getPhilippines().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getPhilippines().setName("philippines");

        result.getCountries().getPhilippines().getData().setName("philippines");
        entityManager.persist(result.getCountries().getPhilippines());
    }
    static void addPitcairn_islands(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getPitcairn_islands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getPitcairn_islands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getPitcairn_islands().setName("pitcairn_islands");

        result.getCountries().getPitcairn_islands().getData().setName("pitcairn_islands");
        entityManager.persist(result.getCountries().getPitcairn_islands());
    }
    static void addPoland(EntityManager entityManager, Json result){
        if(!result.getCountries().getPoland().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getPoland().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getPoland().setName("poland");

        result.getCountries().getPoland().getData().setName("poland");
        entityManager.persist(result.getCountries().getPoland());
    }
    static void addPacific_ocean(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getPacific_ocean().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getPacific_ocean().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getPacific_ocean().setName("pacific_ocean");

        result.getCountries().getPacific_ocean().getData().setName("pacific_ocean");
        entityManager.persist(result.getCountries().getPacific_ocean());
    }
    static void addPakistan(EntityManager entityManager, Json result){
        if(!result.getCountries().getPakistan().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getPakistan().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getPakistan().setName("pakistan");

        result.getCountries().getPakistan().getData().setName("pakistan");
        entityManager.persist(result.getCountries().getPakistan());
    }
    static void addPalau(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getPalau().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getPalau().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getPalau().setName("palau");

        result.getCountries().getPalau().getData().setName("palau");
        entityManager.persist(result.getCountries().getPalau());
    }
    static void addPanama(EntityManager entityManager, Json result){
        if(!result.getCountries().getPanama().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getPanama().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getPanama().setName("panama");

        result.getCountries().getPanama().getData().setName("panama");
        entityManager.persist(result.getCountries().getPanama());
    }
    static void addPapua_new_guinea(EntityManager entityManager, Json result){
        if(!result.getCountries().getPapua_new_guinea().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getPapua_new_guinea().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getPapua_new_guinea().setName("papua_new_guinea");

        result.getCountries().getPapua_new_guinea().getData().setName("papua_new_guinea");
        entityManager.persist(result.getCountries().getPapua_new_guinea());
    }
    static void addPortugal(EntityManager entityManager, Json result){
        if(!result.getCountries().getPortugal().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getPortugal().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getPortugal().setName("portugal");

        result.getCountries().getPortugal().getData().setName("portugal");
        entityManager.persist(result.getCountries().getPortugal());
    }
    static void addPuerto_rico(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getPuerto_rico().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getPuerto_rico().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getPuerto_rico().setName("puerto_rico");

        result.getCountries().getPuerto_rico().getData().setName("puerto_rico");
        entityManager.persist(result.getCountries().getPuerto_rico());
    }

    /**
     * Metoda doająca dane państw na literę P
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addP(EntityManager entityManager, Json result){
        addParacel_islands(entityManager,result);
        addParaguay(entityManager,result);
        addPeru(entityManager,result);
        addPhilippines(entityManager,result);
        addPitcairn_islands(entityManager,result);
        addPoland(entityManager,result);
        addPacific_ocean(entityManager,result);
        addPakistan(entityManager,result);
        addPalau(entityManager,result);
        addPanama(entityManager,result);
        addPapua_new_guinea(entityManager,result);
        addPortugal(entityManager,result);
        addPuerto_rico(entityManager,result);
    }
    static void addQatar(EntityManager entityManager, Json result){
        if(!result.getCountries().getQatar().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getQatar().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getQatar().setName("qatar");

        result.getCountries().getQatar().getData().setName("qatar");
        entityManager.persist(result.getCountries().getQatar());
    }

    /**
     * Metoda doająca dane państw na literę Q
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addQ(EntityManager entityManager, Json result){
        addQatar(entityManager,result);
    }

    static void addRomania(EntityManager entityManager, Json result){
        if(!result.getCountries().getRomania().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getRomania().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getRomania().setName("romania");

        result.getCountries().getRomania().getData().setName("romania");
        entityManager.persist(result.getCountries().getRomania());
    }
    static void addRussia(EntityManager entityManager, Json result){
        if(!result.getCountries().getRussia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getRussia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getRussia().setName("russia");

        result.getCountries().getRussia().getData().setName("russia");
        entityManager.persist(result.getCountries().getRussia());
    }
    static void addRwanda(EntityManager entityManager, Json result){
        if(!result.getCountries().getRwanda().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getRwanda().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getRwanda().setName("rwanda");

        result.getCountries().getRwanda().getData().setName("rwanda");
        entityManager.persist(result.getCountries().getRwanda());
    }
    /**
     * Metoda doająca dane państw na literę R
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addR(EntityManager entityManager, Json result){
        addRomania(entityManager,result);
        addRussia(entityManager,result);
        addRwanda(entityManager,result);
    }

    static void addSaint_helena_ascension_and_tristan_da_cunha(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getSaint_helena_ascension_and_tristan_da_cunha().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSaint_helena_ascension_and_tristan_da_cunha().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getSaint_helena_ascension_and_tristan_da_cunha().setName("saint_helena_ascension_and_tristan_da_cunha");

        result.getCountries().getSaint_helena_ascension_and_tristan_da_cunha().getData().setName("saint_helena_ascension_and_tristan_da_cunha");
        entityManager.persist(result.getCountries().getSaint_helena_ascension_and_tristan_da_cunha());
    }
    static void addSaint_kitts_and_nevis(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getSaint_kitts_and_nevis().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSaint_kitts_and_nevis().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getSaint_kitts_and_nevis().setName("saint_kitts_and_nevis");

        result.getCountries().getSaint_kitts_and_nevis().getData().setName("saint_kitts_and_nevis");
        entityManager.persist(result.getCountries().getSaint_kitts_and_nevis());
    }
    static void addSaint_lucia(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getSaint_lucia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSaint_lucia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getSaint_lucia().setName("saint_lucia");

        result.getCountries().getSaint_lucia().getData().setName("saint_lucia");
        entityManager.persist(result.getCountries().getSaint_lucia());
    }
    static void addSaint_pierre_and_miquelon(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getSaint_pierre_and_miquelon().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSaint_pierre_and_miquelon().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getSaint_pierre_and_miquelon().setName("saint_pierre_and_miquelon");

        result.getCountries().getSaint_pierre_and_miquelon().getData().setName("saint_pierre_and_miquelon");
        entityManager.persist(result.getCountries().getSaint_pierre_and_miquelon());
    }
    static void addSaint_vincent_and_the_grenadines(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getSaint_vincent_and_the_grenadines().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSaint_vincent_and_the_grenadines().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getSaint_vincent_and_the_grenadines().setName("saint_vincent_and_the_grenadines");

        result.getCountries().getSaint_vincent_and_the_grenadines().getData().setName("saint_vincent_and_the_grenadines");
        entityManager.persist(result.getCountries().getSaint_vincent_and_the_grenadines());
    }
    static void addSamoa(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getSamoa().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSamoa().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getSamoa().setName("samoa");

        result.getCountries().getSamoa().getData().setName("samoa");
        entityManager.persist(result.getCountries().getSamoa());
    }
    static void addSan_marino(EntityManager entityManager, Json result){
        if(!result.getCountries().getSan_marino().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSan_marino().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getSan_marino().setName("san_marino");

        result.getCountries().getSan_marino().getData().setName("san_marino");
        entityManager.persist(result.getCountries().getSan_marino());
    }
    static void addSao_tome_and_principe(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getSao_tome_and_principe().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSao_tome_and_principe().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getSao_tome_and_principe().setName("sao_tome_and_principe");

        result.getCountries().getSao_tome_and_principe().getData().setName("sao_tome_and_principe");
        entityManager.persist(result.getCountries().getSao_tome_and_principe());
    }
    static void addSaudi_arabia(EntityManager entityManager, Json result){
        if(!result.getCountries().getSaudi_arabia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSaudi_arabia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getSaudi_arabia().setName("saudi_arabia");

        result.getCountries().getSaudi_arabia().getData().setName("saudi_arabia");
        entityManager.persist(result.getCountries().getSaudi_arabia());
    }
    static void addSenegal(EntityManager entityManager, Json result){
        if(!result.getCountries().getSenegal().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSenegal().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getSenegal().setName("senegal");

        result.getCountries().getSenegal().getData().setName("senegal");
        entityManager.persist(result.getCountries().getSenegal());
    }
    static void addSerbia(EntityManager entityManager, Json result){
        if(!result.getCountries().getSerbia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSerbia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getSerbia().setName("serbia");

        result.getCountries().getSerbia().getData().setName("serbia");
        entityManager.persist(result.getCountries().getSerbia());
    }
    static void addSeychelles(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getSeychelles().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSeychelles().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getSeychelles().setName("seychelles");

        result.getCountries().getSeychelles().getData().setName("seychelles");
        entityManager.persist(result.getCountries().getSeychelles());
    }
    static void addSierra_leone(EntityManager entityManager, Json result){
        if(!result.getCountries().getSierra_leone().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSierra_leone().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getSierra_leone().setName("sierra_leone");

        result.getCountries().getSierra_leone().getData().setName("sierra_leone");
        entityManager.persist(result.getCountries().getSierra_leone());
    }
    static void addSingapore(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getSingapore().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSingapore().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getSingapore().setName("singapore");

        result.getCountries().getSingapore().getData().setName("singapore");
        entityManager.persist(result.getCountries().getSingapore());
    }
    static void addSint_maarten(EntityManager entityManager, Json result){
        if(!result.getCountries().getSint_maarten().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSint_maarten().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getSint_maarten().setName("sint_maarten");

        result.getCountries().getSint_maarten().getData().setName("sint_maarten");
        entityManager.persist(result.getCountries().getSint_maarten());
    }
    static void addSlovakia(EntityManager entityManager, Json result){
        if(!result.getCountries().getSlovakia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSlovakia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getSlovakia().setName("slovakia");

        result.getCountries().getSlovakia().getData().setName("slovakia");
        entityManager.persist(result.getCountries().getSlovakia());
    }
    static void addSlovenia(EntityManager entityManager, Json result){
        if(!result.getCountries().getSlovenia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSlovenia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getSlovenia().setName("slovenia");

        result.getCountries().getSlovenia().getData().setName("slovenia");
        entityManager.persist(result.getCountries().getSlovenia());
    }
    static void addSolomon_islands(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getSolomon_islands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSolomon_islands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getSolomon_islands().setName("solomon_islands");

        result.getCountries().getSolomon_islands().getData().setName("solomon_islands");
        entityManager.persist(result.getCountries().getSolomon_islands());
    }
    static void addSomalia(EntityManager entityManager, Json result){
        if(!result.getCountries().getSomalia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSomalia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getSomalia().setName("somalia");

        result.getCountries().getSomalia().getData().setName("somalia");
        entityManager.persist(result.getCountries().getSomalia());
    }
    static void addSouth_africa(EntityManager entityManager, Json result){
        if(!result.getCountries().getSouth_africa().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSouth_africa().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getSouth_africa().setName("south_africa");

        result.getCountries().getSouth_africa().getData().setName("south_africa");
        entityManager.persist(result.getCountries().getSouth_africa());
    }
    static void addSouthern_ocean(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getSouthern_ocean().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSouthern_ocean().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getSouthern_ocean().setName("southern_ocean");

        result.getCountries().getSouthern_ocean().getData().setName("southern_ocean");
        entityManager.persist(result.getCountries().getSouthern_ocean());
    }
    static void addSouth_georgia_and_south_sandwich_islands(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getSouth_georgia_and_south_sandwich_islands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSouth_georgia_and_south_sandwich_islands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getSouth_georgia_and_south_sandwich_islands().setName("south_georgia_and_south_sandwich_islands");

        result.getCountries().getSouth_georgia_and_south_sandwich_islands().getData().setName("south_georgia_and_south_sandwich_islands");
        entityManager.persist(result.getCountries().getSouth_georgia_and_south_sandwich_islands());
    }
    static void addSouth_sudan(EntityManager entityManager, Json result){
        if(!result.getCountries().getSouth_sudan().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSouth_sudan().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getSouth_sudan().setName("south_sudan");

        result.getCountries().getSouth_sudan().getData().setName("south_sudan");
        entityManager.persist(result.getCountries().getSouth_sudan());
    }
    static void addSpain(EntityManager entityManager, Json result){
        if(!result.getCountries().getSpain().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSpain().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getSpain().setName("spain");

        result.getCountries().getSpain().getData().setName("spain");
        entityManager.persist(result.getCountries().getSpain());
    }
    static void addSpratly_islands(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getSpratly_islands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSpratly_islands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getSpratly_islands().setName("spratly_islands");

        result.getCountries().getSpratly_islands().getData().setName("spratly_islands");
        entityManager.persist(result.getCountries().getSpratly_islands());
    }
    static void addSri_lanka(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getSri_lanka().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSri_lanka().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getSri_lanka().setName("sri_lanka");

        result.getCountries().getSri_lanka().getData().setName("sri_lanka");
        entityManager.persist(result.getCountries().getSri_lanka());
    }
    static void addSudan(EntityManager entityManager, Json result){
        if(!result.getCountries().getSudan().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSudan().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getSudan().setName("sudan");

        result.getCountries().getSudan().getData().setName("sudan");
        entityManager.persist(result.getCountries().getSudan());
    }
    static void addSuriname(EntityManager entityManager, Json result){
        if(!result.getCountries().getSuriname().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSuriname().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getSuriname().setName("suriname");

        result.getCountries().getSuriname().getData().setName("suriname");
        entityManager.persist(result.getCountries().getSuriname());
    }
    static void addSvalbard(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getSvalbard().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSvalbard().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getSvalbard().setName("svalbard");

        result.getCountries().getSvalbard().getData().setName("svalbard");
        entityManager.persist(result.getCountries().getSvalbard());
    }
    static void addSwaziland(EntityManager entityManager, Json result){
        if(!result.getCountries().getSwaziland().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSwaziland().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getSwaziland().setName("swaziland");

        result.getCountries().getSwaziland().getData().setName("swaziland");
        entityManager.persist(result.getCountries().getSwaziland());
    }
    static void addSweden(EntityManager entityManager, Json result){
        if(!result.getCountries().getSweden().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSweden().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getSweden().setName("sweden");

        result.getCountries().getSweden().getData().setName("sweden");
        entityManager.persist(result.getCountries().getSweden());
    }
    static void addSwitzerland(EntityManager entityManager, Json result){
        if(!result.getCountries().getSwitzerland().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSwitzerland().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getSwitzerland().setName("switzerland");

        result.getCountries().getSwitzerland().getData().setName("switzerland");
        entityManager.persist(result.getCountries().getSwitzerland());
    }
    static void addSyria(EntityManager entityManager, Json result){
        if(!result.getCountries().getSyria().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getSyria().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getSyria().setName("syria");

        result.getCountries().getSyria().getData().setName("syria");
        entityManager.persist(result.getCountries().getSyria());
    }
    /**
     * Metoda doająca dane państw na literę S
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addS(EntityManager entityManager, Json result){
        addSaint_helena_ascension_and_tristan_da_cunha(entityManager,result);
        addSaint_kitts_and_nevis(entityManager,result);
        addSaint_lucia(entityManager,result);
        addSaint_pierre_and_miquelon(entityManager,result);
        addSaint_vincent_and_the_grenadines(entityManager,result);
        addSamoa(entityManager,result);
        addSan_marino(entityManager,result);
        addSao_tome_and_principe(entityManager,result);
        addSaudi_arabia(entityManager,result);
        addSenegal(entityManager,result);
        addSerbia(entityManager,result);
        addSeychelles(entityManager,result);
        addSierra_leone(entityManager,result);
        addSingapore(entityManager,result);
        addSint_maarten(entityManager,result);
        addSlovakia(entityManager,result);
        addSlovenia(entityManager,result);
        addSolomon_islands(entityManager,result);
        addSomalia(entityManager,result);
        addSouth_africa(entityManager,result);
        addSouthern_ocean(entityManager,result);
        addSouth_georgia_and_south_sandwich_islands(entityManager,result);
        addSouth_sudan(entityManager,result);
        addSpain(entityManager,result);
        addSpratly_islands(entityManager,result);
        addSri_lanka(entityManager,result);
        addSudan(entityManager,result);
        addSuriname(entityManager,result);
        addSvalbard(entityManager,result);
        addSwaziland(entityManager,result);
        addSweden(entityManager,result);
        addSwitzerland(entityManager,result);
        addSyria(entityManager,result);
    }
    static void addTaiwan(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getTaiwan().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getTaiwan().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getTaiwan().setName("taiwan");

        result.getCountries().getTaiwan().getData().setName("taiwan");
        entityManager.persist(result.getCountries().getTaiwan());
    }
    static void addTajikistan(EntityManager entityManager, Json result){
        if(!result.getCountries().getTajikistan().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getTajikistan().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getTajikistan().setName("tajikistan");

        result.getCountries().getTajikistan().getData().setName("tajikistan");
        entityManager.persist(result.getCountries().getTajikistan());
    }
    static void addTanzania(EntityManager entityManager, Json result){
        if(!result.getCountries().getTanzania().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getTanzania().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getTanzania().setName("tanzania");

        result.getCountries().getTanzania().getData().setName("tanzania");
        entityManager.persist(result.getCountries().getTanzania());
    }
    static void addThailand(EntityManager entityManager, Json result){
        if(!result.getCountries().getThailand().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getThailand().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getThailand().setName("thailand");

        result.getCountries().getThailand().getData().setName("thailand");
        entityManager.persist(result.getCountries().getThailand());
    }
    static void addTimor_leste(EntityManager entityManager, Json result){
        if(!result.getCountries().getTimor_leste().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getTimor_leste().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getTimor_leste().setName("timor_leste");

        result.getCountries().getTimor_leste().getData().setName("timor_leste");
        entityManager.persist(result.getCountries().getTimor_leste());
    }
    static void addTogo(EntityManager entityManager, Json result){
        if(!result.getCountries().getTogo().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getTogo().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getTogo().setName("togo");

        result.getCountries().getTogo().getData().setName("togo");
        entityManager.persist(result.getCountries().getTogo());
    }
    static void addTokelau(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getTokelau().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getTokelau().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getTokelau().setName("tokelau");

        result.getCountries().getTokelau().getData().setName("tokelau");
        entityManager.persist(result.getCountries().getTokelau());
    }
    static void addTonga(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getTonga().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getTonga().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getTonga().setName("tonga");

        result.getCountries().getTonga().getData().setName("tonga");
        entityManager.persist(result.getCountries().getTonga());
    }
    static void addTrinidad_and_tobago(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getTrinidad_and_tobago().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getTrinidad_and_tobago().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getTrinidad_and_tobago().setName("trinidad_and_tobago");

        result.getCountries().getTrinidad_and_tobago().getData().setName("trinidad_and_tobago");
        entityManager.persist(result.getCountries().getTrinidad_and_tobago());
    }
    static void addTunisia(EntityManager entityManager, Json result){
        if(!result.getCountries().getTunisia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getTunisia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getTunisia().setName("tunisia");

        result.getCountries().getTunisia().getData().setName("tunisia");
        entityManager.persist(result.getCountries().getTunisia());
    }
    static void addTurkey(EntityManager entityManager, Json result){
        if(!result.getCountries().getTurkey().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getTurkey().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getTurkey().setName("turkey");

        result.getCountries().getTurkey().getData().setName("turkey");
        entityManager.persist(result.getCountries().getTurkey());
    }
    static void addTurkmenistan(EntityManager entityManager, Json result){
        if(!result.getCountries().getTurkmenistan().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getTurkmenistan().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getTurkmenistan().setName("turkmenistan");

        result.getCountries().getTurkmenistan().getData().setName("turkmenistan");
        entityManager.persist(result.getCountries().getTurkmenistan());
    }
    static void addTurks_and_caicos_islands(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getTurks_and_caicos_islands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getTurks_and_caicos_islands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getTurks_and_caicos_islands().setName("turks_and_caicos_islands");

        result.getCountries().getTurks_and_caicos_islands().getData().setName("turks_and_caicos_islands");
        entityManager.persist(result.getCountries().getTurks_and_caicos_islands());
    }
    static void addTuvalu(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getTuvalu().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getTuvalu().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getTuvalu().setName("tuvalu");

        result.getCountries().getTuvalu().getData().setName("tuvalu");
        entityManager.persist(result.getCountries().getTuvalu());
    }
    /**
     * Metoda doająca dane państw na literę T
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addT(EntityManager entityManager, Json result){
        addTaiwan(entityManager,result);
        addTajikistan(entityManager,result);
        addTanzania(entityManager,result);
        addThailand(entityManager,result);
        addTimor_leste(entityManager,result);
        addTogo(entityManager,result);
        addTokelau(entityManager,result);
        addTonga(entityManager,result);
        addTrinidad_and_tobago(entityManager,result);
        addTunisia(entityManager,result);
        addTurkey(entityManager,result);
        addTurkmenistan(entityManager,result);
        addTurks_and_caicos_islands(entityManager,result);
        addTuvalu(entityManager,result);
    }

    static void addUganda(EntityManager entityManager, Json result){
        if(!result.getCountries().getUganda().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getUganda().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getUganda().setName("uganda");

        result.getCountries().getUganda().getData().setName("uganda");
        entityManager.persist(result.getCountries().getUganda());
    }
    static void addUkraine(EntityManager entityManager, Json result){
        if(!result.getCountries().getUkraine().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getUkraine().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getUkraine().setName("ukraine");

        result.getCountries().getUkraine().getData().setName("ukraine");
        entityManager.persist(result.getCountries().getUkraine());
    }
    static void addUnited_arab_emirates(EntityManager entityManager, Json result){
        if(!result.getCountries().getUnited_arab_emirates().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getUnited_arab_emirates().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getUnited_arab_emirates().setName("united_arab_emirates");

        result.getCountries().getUnited_arab_emirates().getData().setName("united_arab_emirates");
        entityManager.persist(result.getCountries().getUnited_arab_emirates());
    }
    static void addUnited_kingdom(EntityManager entityManager, Json result){
        if(!result.getCountries().getUnited_kingdom().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getUnited_kingdom().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getUnited_kingdom().setName("united_kingdom");

        result.getCountries().getUnited_kingdom().getData().setName("united_kingdom");
        entityManager.persist(result.getCountries().getUnited_kingdom());
    }
    static void addUnited_states(EntityManager entityManager, Json result){
        if(!result.getCountries().getUnited_states().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getUnited_states().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getUnited_states().setName("united_states");

        result.getCountries().getUnited_states().getData().setName("united_states");
        entityManager.persist(result.getCountries().getUnited_states());
    }
    static void addUruguay(EntityManager entityManager, Json result){
        if(!result.getCountries().getUruguay().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getUruguay().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getUruguay().setName("uruguay");

        result.getCountries().getUruguay().getData().setName("uruguay");
        entityManager.persist(result.getCountries().getUruguay());
    }
    static void addUzbekistan(EntityManager entityManager, Json result){
        if(!result.getCountries().getUzbekistan().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getUzbekistan().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getUzbekistan().setName("uzbekistan");

        result.getCountries().getUzbekistan().getData().setName("uzbekistan");
        entityManager.persist(result.getCountries().getUzbekistan());
    }
    /**
     * Metoda doająca dane państw na literę U
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addU(EntityManager entityManager, Json result){
        addUganda(entityManager,result);
        addUkraine(entityManager,result);
        addUnited_arab_emirates(entityManager,result);
        addUnited_kingdom(entityManager,result);
        addUnited_states(entityManager,result);
        addUruguay(entityManager,result);
        addUzbekistan(entityManager,result);
    }

    static void addVenezuela(EntityManager entityManager, Json result){
        if(!result.getCountries().getVenezuela().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getVenezuela().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getVenezuela().setName("venezuela");

        result.getCountries().getVenezuela().getData().setName("venezuela");
        entityManager.persist(result.getCountries().getVenezuela());
    }
    static void addVietnam(EntityManager entityManager, Json result){
        if(!result.getCountries().getVietnam().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getVietnam().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getVietnam().setName("vietnam");

        result.getCountries().getVietnam().getData().setName("vietnam");
        entityManager.persist(result.getCountries().getVietnam());
    }
    static void addVirgin_islands(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getVirgin_islands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getVirgin_islands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getVirgin_islands().setName("virgin_islands");

        result.getCountries().getVirgin_islands().getData().setName("virgin_islands");
        entityManager.persist(result.getCountries().getVirgin_islands());
    }
    static void addVanuatu(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getVanuatu().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getVanuatu().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getVanuatu().setName("vanuatu");

        result.getCountries().getVanuatu().getData().setName("vanuatu");
        entityManager.persist(result.getCountries().getVanuatu());
    }
    /**
     * Metoda doająca dane państw na literę V
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addV(EntityManager entityManager, Json result){
        addVenezuela(entityManager,result);
        addVietnam(entityManager,result);
        addVirgin_islands(entityManager,result);
        addVanuatu(entityManager,result);
    }

    static void addWake_island(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getWake_island().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getWake_island().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getWake_island().setName("wake_island");

        result.getCountries().getWake_island().getData().setName("wake_island");
        entityManager.persist(result.getCountries().getWake_island());
    }
    static void addWallis_and_futuna(EntityManager entityManager, Json result){
/*        if(!result.getCountries().getWallis_and_futuna().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getWallis_and_futuna().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }*/
        result.getCountries().getWallis_and_futuna().setName("wallis_and_futuna");

        result.getCountries().getWallis_and_futuna().getData().setName("wallis_and_futuna");
        entityManager.persist(result.getCountries().getWallis_and_futuna());
    }
    static void addWest_bank(EntityManager entityManager, Json result){
        if(!result.getCountries().getWest_bank().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getWest_bank().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getWest_bank().setName("west_bank");

        result.getCountries().getWest_bank().getData().setName("west_bank");
        entityManager.persist(result.getCountries().getWest_bank());
    }
    static void addWestern_sahara(EntityManager entityManager, Json result){
        if(!result.getCountries().getWestern_sahara().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getWestern_sahara().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getWestern_sahara().setName("western_sahara");

        result.getCountries().getWestern_sahara().getData().setName("western_sahara");
        entityManager.persist(result.getCountries().getWestern_sahara());
    }
    /**
     * Metoda doająca dane państw na literę W
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addW(EntityManager entityManager, Json result){
        addWake_island(entityManager,result);
        addWallis_and_futuna(entityManager,result);
        addWest_bank(entityManager,result);
        addWestern_sahara(entityManager,result);
    }
    static void addYemen(EntityManager entityManager, Json result){
        if(!result.getCountries().getYemen().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getYemen().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getYemen().setName("yemen");

        result.getCountries().getYemen().getData().setName("yemen");
        entityManager.persist(result.getCountries().getYemen());
    }
    /**
     * Metoda doająca dane państw na literę Y
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addY(EntityManager entityManager, Json result){
        addYemen(entityManager,result);
    }

    static void addZambia(EntityManager entityManager, Json result){
        if(!result.getCountries().getZambia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getZambia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getZambia().setName("zambia");

        result.getCountries().getZambia().getData().setName("zambia");
        entityManager.persist(result.getCountries().getZambia());
    }
    static void addZimbabwe(EntityManager entityManager, Json result){
        if(!result.getCountries().getZimbabwe().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
            for (Border_countries bc : result.getCountries().getZimbabwe().getData().getGeography().getLand_boundaries().getBorder_countries()) {
                bc.setBorder(bc.getBorder_length().getValue());
                bc.setUnits(bc.getBorder_length().getUnits());
            }
        }
        result.getCountries().getZimbabwe().setName("zimbabwe");

        result.getCountries().getZimbabwe().getData().setName("zimbabwe");
        entityManager.persist(result.getCountries().getZimbabwe());
    }
    /**
     * Metoda doająca dane państw na literę Z
     * @param entityManager obiekt do łaczenia z bazy danych
     * @param result źródło danych
     */
    static void addZ(EntityManager entityManager, Json result){
        addZambia(entityManager,result);
        addZimbabwe(entityManager,result);
    }
}
