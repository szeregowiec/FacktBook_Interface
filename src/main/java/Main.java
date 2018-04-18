package database;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {




        Json result = null;
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("/home/szergowiec/IdeaProjects/parser/src/main/java/pl/edu/agh/dane.json"));
             result = new Gson().fromJson(br, Json.class);



            System.out.println("yhmy");
           // System.out.println(result.getCountries().getWorld().getData().getName());
            // System.out.println(result.getCountries().getPoland().getData().getName());


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

//        JsonElement gson = new Gson().toJsonTree(result.getCountries().getDenmark().getData(),Data.class);
//        System.out.println("yhmy");


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
//
//          //addA(entityManager,result);
////        addB(entityManager,result);
////        addC(entityManager,result);
  addD(entityManager,result);
////        addE(entityManager,result);
////        addF(entityManager,result);
////        addG(entityManager,result);
////        addH(entityManager,result);
////        addI(entityManager,result);
//       // addJ(entityManager,result);
//        //addK(entityManager,result);
//
//
//
//
        entityManager.getTransaction().commit();
        entityManagerFactory.close();


    }



    static void addAfghanistan(EntityManager entityManager, Json result){
        for(Border_countries bc : result.getCountries().getAfghanistan().getData().getGeography().getLand_boundaries().getBorder_countries()){
            bc.setBorder(bc.getBorder_length().getValue());
            bc.setUnits(bc.getBorder_length().getUnits());
        }
        result.getCountries().getAfghanistan().setName("afghanistan");

        result.getCountries().getAfghanistan().getData().setName("afghanistan");
        entityManager.persist(result.getCountries().getAfghanistan());
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


//    public void addBahamas_the(EntityManager entityManager, Json result){
///*        for(Border_countries bc : result.getCountries().getBahamas_the().getData().getGeography().getLand_boundaries().getBorder_countries()){
//            bc.setBorder(bc.getBorder_length().getValue());
//            bc.setUnits(bc.getBorder_length().getUnits());
//        }*/
//        result.getCountries().getBahamas_the().setName("bahamas_the");
//
//        result.getCountries().getBahamas_the().getData().setName("bahamas_the");
//        entityManager.persist(result.getCountries().getBahamas_the());
//    }
//    public void addBahrain(EntityManager entityManager, Json result){
///*        for(Border_countries bc : result.getCountries().getBahrain().getData().getGeography().getLand_boundaries().getBorder_countries()){
//            bc.setBorder(bc.getBorder_length().getValue());
//            bc.setUnits(bc.getBorder_length().getUnits());
//        }*/
//        result.getCountries().getBahrain().setName("bahrain");
//
//        result.getCountries().getBahrain().getData().setName("bahrain");
//        entityManager.persist(result.getCountries().getBahrain());
//    }
//    public void addBangladesh(EntityManager entityManager, Json result){
//        for(Border_countries bc : result.getCountries().getBangladesh().getData().getGeography().getLand_boundaries().getBorder_countries()){
//            bc.setBorder(bc.getBorder_length().getValue());
//            bc.setUnits(bc.getBorder_length().getUnits());
//        }
//        result.getCountries().getBangladesh().setName("bangladesh");
//
//        result.getCountries().getBangladesh().getData().setName("bangladesh");
//        entityManager.persist(result.getCountries().getBangladesh());
//    }
//    public void addBarbados(EntityManager entityManager, Json result){
///*        for(Border_countries bc : result.getCountries().getBarbados().getData().getGeography().getLand_boundaries().getBorder_countries()){
//            bc.setBorder(bc.getBorder_length().getValue());
//            bc.setUnits(bc.getBorder_length().getUnits());
//        }*/
//        result.getCountries().getBarbados().setName("barbados");
//
//        result.getCountries().getBarbados().getData().setName("barbados");
//        entityManager.persist(result.getCountries().getBarbados());
//    }
//    public void addBelarus(EntityManager entityManager, Json result){
//        for(Border_countries bc : result.getCountries().getBelarus().getData().getGeography().getLand_boundaries().getBorder_countries()){
//            bc.setBorder(bc.getBorder_length().getValue());
//            bc.setUnits(bc.getBorder_length().getUnits());
//        }
//        result.getCountries().getBelarus().setName("belarus");
//
//        result.getCountries().getBelarus().getData().setName("bBelarus");
//        entityManager.persist(result.getCountries().getBelarus());
//    }
//    public void addBelgium(EntityManager entityManager, Json result){
//        for(Border_countries bc : result.getCountries().getBelgium().getData().getGeography().getLand_boundaries().getBorder_countries()){
//            bc.setBorder(bc.getBorder_length().getValue());
//            bc.setUnits(bc.getBorder_length().getUnits());
//        }
//        result.getCountries().getBelgium().setName("belgium");
//
//        result.getCountries().getBelgium().getData().setName("belgium");
//        entityManager.persist(result.getCountries().getBelgium());
//    }
//    public void addBelize(EntityManager entityManager, Json result){
//        for(Border_countries bc : result.getCountries().getBelize().getData().getGeography().getLand_boundaries().getBorder_countries()){
//            bc.setBorder(bc.getBorder_length().getValue());
//            bc.setUnits(bc.getBorder_length().getUnits());
//        }
//        result.getCountries().getBelize().setName("belize");
//
//        result.getCountries().getBelize().getData().setName("belize");
//        entityManager.persist(result.getCountries().getBelize());
//    }
//    public void addBenin(EntityManager entityManager, Json result){
//        for(Border_countries bc : result.getCountries().getBenin().getData().getGeography().getLand_boundaries().getBorder_countries()){
//            bc.setBorder(bc.getBorder_length().getValue());
//            bc.setUnits(bc.getBorder_length().getUnits());
//        }
//        result.getCountries().getBenin().setName("benin");
//
//        result.getCountries().getBenin().getData().setName("benin");
//        entityManager.persist(result.getCountries().getBenin());
//    }
//    public void addBermuda(EntityManager entityManager, Json result){
///*        for(Border_countries bc : result.getCountries().getBermuda().getData().getGeography().getLand_boundaries().getBorder_countries()){
//            bc.setBorder(bc.getBorder_length().getValue());
//            bc.setUnits(bc.getBorder_length().getUnits());
//        }*/
//        result.getCountries().getBermuda().setName("bermuda");
//
//        result.getCountries().getBermuda().getData().setName("bermuda");
//        entityManager.persist(result.getCountries().getBermuda());
//    }
//    public void addBhutan(EntityManager entityManager, Json result){
//        for(Border_countries bc : result.getCountries().getBhutan().getData().getGeography().getLand_boundaries().getBorder_countries()){
//            bc.setBorder(bc.getBorder_length().getValue());
//            bc.setUnits(bc.getBorder_length().getUnits());
//        }
//        result.getCountries().getBhutan().setName("bhutan");
//
//        result.getCountries().getBhutan().getData().setName("bhutan");
//        entityManager.persist(result.getCountries().getBhutan());
//    }
//    public void addBolivia(EntityManager entityManager, Json result){
//        for(Border_countries bc : result.getCountries().getBolivia().getData().getGeography().getLand_boundaries().getBorder_countries()){
//            bc.setBorder(bc.getBorder_length().getValue());
//            bc.setUnits(bc.getBorder_length().getUnits());
//        }
//        result.getCountries().getBolivia().setName("bolivia");
//
//        result.getCountries().getBolivia().getData().setName("bolivia");
//        entityManager.persist(result.getCountries().getBolivia());
//    }
//    public void addBosnia_and_herzegovina(EntityManager entityManager, Json result){
//        for(Border_countries bc : result.getCountries().getBosnia_and_herzegovina().getData().getGeography().getLand_boundaries().getBorder_countries()){
//            bc.setBorder(bc.getBorder_length().getValue());
//            bc.setUnits(bc.getBorder_length().getUnits());
//        }
//        result.getCountries().getBosnia_and_herzegovina().setName("bosnia_and_herzegovina");
//
//        result.getCountries().getBosnia_and_herzegovina().getData().setName("bosnia_and_herzegovina");
//        entityManager.persist(result.getCountries().getBosnia_and_herzegovina());
//    }
//    public void addBotswana(EntityManager entityManager, Json result){
//        for(Border_countries bc : result.getCountries().getBotswana().getData().getGeography().getLand_boundaries().getBorder_countries()){
//        bc.setBorder(bc.getBorder_length().getValue());
//        bc.setUnits(bc.getBorder_length().getUnits());
//    }
//        result.getCountries().getBotswana().setName("botswana");
//
//        result.getCountries().getBotswana().getData().setName("botswana");
//        entityManager.persist(result.getCountries().getBotswana());}
//    public void addBouvet_island(EntityManager entityManager, Json result){
///*        for(Border_countries bc : result.getCountries().getBouvet_island().getData().getGeography().getLand_boundaries().getBorder_countries()){
//            bc.setBorder(bc.getBorder_length().getValue());
//            bc.setUnits(bc.getBorder_length().getUnits());
//        }*/
//        result.getCountries().getBouvet_island().setName("bouvet_island");
//
//        result.getCountries().getBouvet_island().getData().setName("bouvet_island");
//        entityManager.persist(result.getCountries().getBouvet_island());
//    }
//    public void addBrazil(EntityManager entityManager, Json result){        for(Border_countries bc : result.getCountries().getBrazil().getData().getGeography().getLand_boundaries().getBorder_countries()){
//        bc.setBorder(bc.getBorder_length().getValue());
//        bc.setUnits(bc.getBorder_length().getUnits());
//    }
//        result.getCountries().getBrazil().setName("brazil");
//
//        result.getCountries().getBrazil().getData().setName("brazil");
//        entityManager.persist(result.getCountries().getBrazil());}
//    public void addBritish_indian_ocean_territory(EntityManager entityManager, Json result){
//        /*for(Border_countries bc : result.getCountries().getBritish_indian_ocean_territory().getData().getGeography().getLand_boundaries().getBorder_countries()){
//        bc.setBorder(bc.getBorder_length().getValue());
//        bc.setUnits(bc.getBorder_length().getUnits());
//    }*/
//        result.getCountries().getBritish_indian_ocean_territory().setName("british_indian_ocean_territory");
//
//        result.getCountries().getBritish_indian_ocean_territory().getData().setName("british_indian_ocean_territory");
//        entityManager.persist(result.getCountries().getBritish_indian_ocean_territory());}
//    public void addBritish_virgin_islands(EntityManager entityManager, Json result){
//        /*for(Border_countries bc : result.getCountries().getBritish_virgin_islands().getData().getGeography().getLand_boundaries().getBorder_countries()){
//        bc.setBorder(bc.getBorder_length().getValue());
//        bc.setUnits(bc.getBorder_length().getUnits());
//    }*/
//        result.getCountries().getBritish_virgin_islands().setName("british_virgin_islands");
//
//        result.getCountries().getBritish_virgin_islands().getData().setName("british_virgin_islands");
//        entityManager.persist(result.getCountries().getBritish_virgin_islands());}
//    public void addBrunei(EntityManager entityManager, Json result){        for(Border_countries bc : result.getCountries().getBrunei().getData().getGeography().getLand_boundaries().getBorder_countries()){
//        bc.setBorder(bc.getBorder_length().getValue());
//        bc.setUnits(bc.getBorder_length().getUnits());
//    }
//        result.getCountries().getBrunei().setName("brunei");
//
//        result.getCountries().getBrunei().getData().setName("brunei");
//        entityManager.persist(result.getCountries().getBrunei());}
//    public void addBulgaria(EntityManager entityManager, Json result){        for(Border_countries bc : result.getCountries().getBulgaria().getData().getGeography().getLand_boundaries().getBorder_countries()){
//        bc.setBorder(bc.getBorder_length().getValue());
//        bc.setUnits(bc.getBorder_length().getUnits());
//    }
//        result.getCountries().getBulgaria().setName("bulgaria");
//
//        result.getCountries().getBulgaria().getData().setName("bulgaria");
//        entityManager.persist(result.getCountries().getBulgaria());}
//    public void addBurkina_faso(EntityManager entityManager, Json result){        for(Border_countries bc : result.getCountries().getBurkina_faso().getData().getGeography().getLand_boundaries().getBorder_countries()){
//        bc.setBorder(bc.getBorder_length().getValue());
//        bc.setUnits(bc.getBorder_length().getUnits());
//    }
//        result.getCountries().getBurkina_faso().setName("burkina_faso");
//
//        result.getCountries().getBurkina_faso().getData().setName("burkina_faso");
//        entityManager.persist(result.getCountries().getBurkina_faso());}
//    public void addBurma(EntityManager entityManager, Json result){        for(Border_countries bc : result.getCountries().getBurma().getData().getGeography().getLand_boundaries().getBorder_countries()){
//        bc.setBorder(bc.getBorder_length().getValue());
//        bc.setUnits(bc.getBorder_length().getUnits());
//    }
//        result.getCountries().getBurma().setName("burma");
//
//        result.getCountries().getBurma().getData().setName("burma");
//        entityManager.persist(result.getCountries().getBurma());}
//    public void addBurundi(EntityManager entityManager, Json result){
//        if(!result.getCountries().getBurundi().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getBurundi().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getBurundi().setName("burundi");
//
//        result.getCountries().getBurundi().getData().setName("burundi");
//        entityManager.persist(result.getCountries().getBurundi());
//    }
//
//    public void addCabo_verde(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getCabo_verde().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getCabo_verde().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getCabo_verde().setName("cabo_verde");
//
//        result.getCountries().getCabo_verde().getData().setName("cabo_verde");
//        entityManager.persist(result.getCountries().getCabo_verde());
//    }
//    public void addCambodia(EntityManager entityManager, Json result){
//        if(!result.getCountries().getCambodia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getCambodia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getCambodia().setName("cambodia");
//
//        result.getCountries().getCambodia().getData().setName("cambodia");
//        entityManager.persist(result.getCountries().getCambodia());
//    }
//    public void addCameroon(EntityManager entityManager, Json result){
//        if(!result.getCountries().getCameroon().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getCameroon().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getCameroon().setName("cameroon");
//
//        result.getCountries().getCameroon().getData().setName("cameroon");
//        entityManager.persist(result.getCountries().getCameroon());
//    }
//    public void addCanada(EntityManager entityManager, Json result){
//        if(!result.getCountries().getCanada().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getCanada().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getCanada().setName("canada");
//
//        result.getCountries().getCanada().getData().setName("canada");
//        entityManager.persist(result.getCountries().getCanada());
//    }
//    public void addCayman_islands(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getCayman_islands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getCayman_islands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getCayman_islands().setName("cayman_islands");
//
//        result.getCountries().getCayman_islands().getData().setName("cayman_islands");
//        entityManager.persist(result.getCountries().getCayman_islands());
//    }
//    public void addCentral_african_republic(EntityManager entityManager, Json result){
//        if(!result.getCountries().getCentral_african_republic().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getCentral_african_republic().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getCentral_african_republic().setName("central_african_republic");
//
//        result.getCountries().getCentral_african_republic().getData().setName("central_african_republic");
//        entityManager.persist(result.getCountries().getCentral_african_republic());
//    }
//    public void addChad(EntityManager entityManager, Json result){
//        if(!result.getCountries().getChad().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getChad().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getChad().setName("chad");
//
//        result.getCountries().getChad().getData().setName("chad");
//        entityManager.persist(result.getCountries().getChad());
//    }
//    public void addChile(EntityManager entityManager, Json result){
//        if(!result.getCountries().getChile().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getChile().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getChile().setName("chile");
//
//        result.getCountries().getChile().getData().setName("chile");
//        entityManager.persist(result.getCountries().getChile());
//    }
//    public void addChina(EntityManager entityManager, Json result){
//        if(!result.getCountries().getChina().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getChina().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getChina().setName("china");
//
//        result.getCountries().getChina().getData().setName("china");
//        entityManager.persist(result.getCountries().getChina());
//    }
//    public void addChristmas_island(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getChristmas_island().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getChristmas_island().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getChristmas_island().setName("christmas_island");
//
//        result.getCountries().getChristmas_island().getData().setName("christmas_island");
//        entityManager.persist(result.getCountries().getChristmas_island());
//    }
//    public void addClipperton_island(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getClipperton_island().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getClipperton_island().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getClipperton_island().setName("clipperton_island");
//
//        result.getCountries().getClipperton_island().getData().setName("clipperton_island");
//        entityManager.persist(result.getCountries().getClipperton_island());
//    }
//    public void addCocos_keeling_islands(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getCocos_keeling_islands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getCocos_keeling_islands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getCocos_keeling_islands().setName("cocos_keeling_islands");
//
//        result.getCountries().getCocos_keeling_islands().getData().setName("cocos_keeling_islands");
//        entityManager.persist(result.getCountries().getCocos_keeling_islands());
//    }
//    public void addColombia(EntityManager entityManager, Json result){
//        if(!result.getCountries().getColombia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getColombia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getColombia().setName("colombia");
//
//        result.getCountries().getColombia().getData().setName("colombia");
//        entityManager.persist(result.getCountries().getColombia());
//    }
//    public void addComoros(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getComoros().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getComoros().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getComoros().setName("comoros");
//
//        result.getCountries().getComoros().getData().setName("comoros");
//        entityManager.persist(result.getCountries().getComoros());
//    }
//    public void addCongo_democratic_republic_of_the(EntityManager entityManager, Json result){
//        if(!result.getCountries().getCongo_democratic_republic_of_the().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getCongo_democratic_republic_of_the().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getCongo_democratic_republic_of_the().setName("congo_democratic_republic_of_the");
//
//        result.getCountries().getCongo_democratic_republic_of_the().getData().setName("congo_democratic_republic_of_the");
//        entityManager.persist(result.getCountries().getCongo_democratic_republic_of_the());
//    }
//    public void addCongo_republic_of_the(EntityManager entityManager, Json result){
//        if(!result.getCountries().getCongo_republic_of_the().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getCongo_republic_of_the().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getCongo_republic_of_the().setName("congo_republic_of_the");
//
//        result.getCountries().getCongo_republic_of_the().getData().setName("congo_republic_of_the");
//        entityManager.persist(result.getCountries().getCongo_republic_of_the());
//    }
//    public void addCook_islands(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getCook_islands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getCook_islands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getCook_islands().setName("cook_islands");
//
//        result.getCountries().getCook_islands().getData().setName("cook_islands");
//        entityManager.persist(result.getCountries().getCook_islands());
//    }
//    public void addCoral_sea_islands(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getCoral_sea_islands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getCoral_sea_islands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getCoral_sea_islands().setName("coral_sea_islands");
//
//        result.getCountries().getCoral_sea_islands().getData().setName("coral_sea_islands");
//        entityManager.persist(result.getCountries().getCoral_sea_islands());
//    }
//    public void addCosta_rica(EntityManager entityManager, Json result){
//        if(!result.getCountries().getCosta_rica().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getCosta_rica().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getCosta_rica().setName("costa_rica");
//
//        result.getCountries().getCosta_rica().getData().setName("costa_rica");
//        entityManager.persist(result.getCountries().getCosta_rica());
//    }
//    public void addCroatia(EntityManager entityManager, Json result){
//        if(!result.getCountries().getCroatia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getCroatia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getCroatia().setName("croatia");
//
//        result.getCountries().getCroatia().getData().setName("croatia");
//        entityManager.persist(result.getCountries().getCroatia());
//    }
//    public void addCuba(EntityManager entityManager, Json result){
//        if(!result.getCountries().getCuba().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getCuba().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getCuba().setName("cuba");
//
//        result.getCountries().getCuba().getData().setName("cuba");
//        entityManager.persist(result.getCountries().getCuba());
//    }
//    public void addCuracao(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getCuracao().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getCuracao().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getCuracao().setName("curacao");
//
//        result.getCountries().getCuracao().getData().setName("curacao");
//        entityManager.persist(result.getCountries().getCuracao());
//    }
//    public void addCyprus(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getCyprus().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getCyprus().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getCyprus().setName("cyprus");
//
//        result.getCountries().getCyprus().getData().setName("cyprus");
//        entityManager.persist(result.getCountries().getCyprus());
//    }
//    public void addCzechia(EntityManager entityManager, Json result){
//        if(!result.getCountries().getCzechia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getCzechia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getCzechia().setName("czechia");
//
//        result.getCountries().getCzechia().getData().setName("czechia");
//        entityManager.persist(result.getCountries().getCzechia());
//    }
//
//    public void addC(EntityManager entityManager, Json result){
//       addCabo_verde(entityManager,result);
//       addCambodia(entityManager,result);
//       addCameroon(entityManager,result);
//       addCanada(entityManager,result);
//       addCayman_islands(entityManager,result);
//       addCentral_african_republic(entityManager,result);
//       addChad(entityManager,result);
//       addChile(entityManager,result);
//       addChina(entityManager,result);
//       addChristmas_island(entityManager,result);
//       addClipperton_island(entityManager,result);
//       addCocos_keeling_islands(entityManager,result);
//       addColombia(entityManager,result);
//       addComoros(entityManager,result);
//       addCongo_democratic_republic_of_the(entityManager,result);
//       addCongo_republic_of_the(entityManager,result);
//       addCook_islands(entityManager,result);
//       addCoral_sea_islands(entityManager,result);
//       addCosta_rica(entityManager,result);
//       addCroatia(entityManager,result);
//       addCuba(entityManager,result);
//       addCuracao(entityManager,result);
//       addCyprus(entityManager,result);
//       addCzechia(entityManager,result);
//
//
//    }
//
//
//    public void addB(EntityManager entityManager, Json result){
//        addBahamas_the(entityManager,result);
//        addBahrain(entityManager,result);
//        addBangladesh(entityManager,result);
//        addBarbados(entityManager,result);
//        addBelarus(entityManager,result);
//        addBelgium(entityManager,result);
//       addBelize(entityManager,result);
//        addBenin(entityManager,result);
//        addBermuda(entityManager,result);
//        addBhutan(entityManager,result);
//        addBolivia(entityManager,result);
//        addBosnia_and_herzegovina(entityManager,result);
//        addBotswana(entityManager,result);
//        addBouvet_island(entityManager,result);
//        addBrazil(entityManager,result);
//        addBritish_indian_ocean_territory(entityManager,result);
//        addBritish_virgin_islands(entityManager,result);
//        addBrunei(entityManager,result);
//        addBulgaria(entityManager,result);
//        addBurkina_faso(entityManager,result);
//        /*addBurma(entityManager,result); ma jakiegos dziwnego stringa, więc na razie go nie dodajemy*/
//        addBurundi(entityManager,result);
//    }

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

    static void addD(EntityManager entityManager, Json result){
        addDenmark(entityManager,result);
        addDhekelia(entityManager,result);
        addDjibouti(entityManager,result);
        addDominica(entityManager,result);
        addDominican_republic(entityManager,result);


    }

//    public void addEcuador(EntityManager entityManager, Json result){
//        if(!result.getCountries().getEcuador().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getEcuador().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getEcuador().setName("ecuador");
//
//        result.getCountries().getEcuador().getData().setName("ecuador");
//        entityManager.persist(result.getCountries().getEcuador());
//    }
//    public void addEgypt(EntityManager entityManager, Json result){
//        if(!result.getCountries().getEgypt().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getEgypt().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getEgypt().setName("egypt");
//
//        result.getCountries().getEgypt().getData().setName("egypt");
//        entityManager.persist(result.getCountries().getEgypt());
//    }
//    public void addEl_salvador(EntityManager entityManager, Json result){
//        if(!result.getCountries().getEl_salvador().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getEl_salvador().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getEl_salvador().setName("el_salvador");
//
//        result.getCountries().getEl_salvador().getData().setName("el_salvador");
//        entityManager.persist(result.getCountries().getEl_salvador());
//    }
//    public void addEquatorial_guinea(EntityManager entityManager, Json result){
//        if(!result.getCountries().getEquatorial_guinea().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getEquatorial_guinea().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getEquatorial_guinea().setName("equatorial_guinea");
//
//        result.getCountries().getEquatorial_guinea().getData().setName("equatorial_guinea");
//        entityManager.persist(result.getCountries().getEquatorial_guinea());
//    }
//    public void addEritrea(EntityManager entityManager, Json result){
//        if(!result.getCountries().getEritrea().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getEritrea().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getEritrea().setName("eritrea");
//
//        result.getCountries().getEritrea().getData().setName("eritrea");
//        entityManager.persist(result.getCountries().getEritrea());
//    }
//    public void addEstonia(EntityManager entityManager, Json result){
//        if(!result.getCountries().getEstonia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getEstonia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getEstonia().setName("estonia");
//
//        result.getCountries().getEstonia().getData().setName("estonia");
//        entityManager.persist(result.getCountries().getEstonia());
//    }
//    public void addEthiopia(EntityManager entityManager, Json result){
//        if(!result.getCountries().getEthiopia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getEthiopia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getEthiopia().setName("ethiopia");
//
//        result.getCountries().getEthiopia().getData().setName("ethiopia");
//        entityManager.persist(result.getCountries().getEthiopia());
//    }
//
//    public void addE(EntityManager entityManager, Json result){
//        addEcuador(entityManager,result);
//        addEgypt(entityManager,result);
//        addEl_salvador(entityManager,result);
//        addEquatorial_guinea(entityManager,result);
//        addEritrea(entityManager,result);
//        addEstonia(entityManager,result);
//        addEthiopia(entityManager,result);
//    }
//
//    public void addFalkland_islands_islas_malvinas(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getFalkland_islands_islas_malvinas().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getFalkland_islands_islas_malvinas().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getFalkland_islands_islas_malvinas().setName("falkland_islands_islas_malvinas");
//
//        result.getCountries().getFalkland_islands_islas_malvinas().getData().setName("falkland_islands_islas_malvinas");
//        entityManager.persist(result.getCountries().getFalkland_islands_islas_malvinas());
//    }
//    public void addFaroe_islands(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getFaroe_islands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getFaroe_islands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getFaroe_islands().setName("faroe_islands");
//
//        result.getCountries().getFaroe_islands().getData().setName("faroe_islands");
//        entityManager.persist(result.getCountries().getFaroe_islands());
//    }
//    public void addFiji(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getFiji().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getFiji().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getFiji().setName("fiji");
//
//        result.getCountries().getFiji().getData().setName("fiji");
//        entityManager.persist(result.getCountries().getFiji());
//    }
//    public void addFinland(EntityManager entityManager, Json result){
//        if(!result.getCountries().getFinland().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getFinland().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getFinland().setName("finland");
//
//        result.getCountries().getFinland().getData().setName("finland");
//        entityManager.persist(result.getCountries().getFinland());
//    }
//    public void addFrance(EntityManager entityManager, Json result){
//        if(!result.getCountries().getFrance().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getFrance().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getFrance().setName("france");
//
//        result.getCountries().getFrance().getData().setName("france");
//        entityManager.persist(result.getCountries().getFrance());
//    }
//    public void addFrench_polynesia(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getFrench_polynesia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getFrench_polynesia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getFrench_polynesia().setName("french_polynesia");
//
//        result.getCountries().getFrench_polynesia().getData().setName("french_polynesia");
//        entityManager.persist(result.getCountries().getFrench_polynesia());
//    }
//
//    public void addF(EntityManager entityManager, Json result){
//        addFalkland_islands_islas_malvinas(entityManager,result);
//        addFaroe_islands(entityManager,result);
//        addFiji(entityManager,result);
//        addFinland(entityManager,result);
//        addFrance(entityManager,result);
//        addFrench_polynesia(entityManager,result);
//    }
//
//    public void addGabon(EntityManager entityManager, Json result){
//        if(!result.getCountries().getGabon().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getGabon().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getGabon().setName("gabon");
//
//        result.getCountries().getGabon().getData().setName("gabon");
//        entityManager.persist(result.getCountries().getGabon());
//    }
//    public void addGambia_the(EntityManager entityManager, Json result){
//        if(!result.getCountries().getGambia_the().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getGambia_the().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getGambia_the().setName("gambia_the");
//
//        result.getCountries().getGambia_the().getData().setName("gambia_the");
//        entityManager.persist(result.getCountries().getGambia_the());
//    }
//    public void addGaza_strip(EntityManager entityManager, Json result){
//        if(!result.getCountries().getGaza_strip().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getGaza_strip().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getGaza_strip().setName("gaza_strip");
//
//        result.getCountries().getGaza_strip().getData().setName("gaza_strip");
//        entityManager.persist(result.getCountries().getGaza_strip());
//    }
//    public void addGeorgia(EntityManager entityManager, Json result){
//        if(!result.getCountries().getGeorgia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getGeorgia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getGeorgia().setName("georgia");
//
//        result.getCountries().getGeorgia().getData().setName("georgia");
//        entityManager.persist(result.getCountries().getGeorgia());
//    }
//    public void addGermany(EntityManager entityManager, Json result){
//        if(!result.getCountries().getGermany().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getGermany().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getGermany().setName("germany");
//
//        result.getCountries().getGermany().getData().setName("germany");
//        entityManager.persist(result.getCountries().getGermany());
//    }
//    public void addGhana(EntityManager entityManager, Json result){
//        if(!result.getCountries().getGhana().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getGhana().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getGhana().setName("ghana");
//
//        result.getCountries().getGhana().getData().setName("ghana");
//        entityManager.persist(result.getCountries().getGhana());
//    }
//    public void addGibraltar(EntityManager entityManager, Json result){
//        if(!result.getCountries().getGibraltar().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getGibraltar().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getGibraltar().setName("gibraltar");
//
//        result.getCountries().getGibraltar().getData().setName("gibraltar");
//        entityManager.persist(result.getCountries().getGibraltar());
//    }
//    public void addGreece(EntityManager entityManager, Json result){
//        if(!result.getCountries().getGreece().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getGreece().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getGreece().setName("greece");
//
//        result.getCountries().getGreece().getData().setName("greece");
//        entityManager.persist(result.getCountries().getGreece());
//    }
//    public void addGreenland(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getGreenland().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getGreenland().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getGreenland().setName("greenland");
//
//        result.getCountries().getGreenland().getData().setName("greenland");
//        entityManager.persist(result.getCountries().getGreenland());
//    }
//    public void addGrenada(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getGrenada().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getGrenada().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getGrenada().setName("grenada");
//
//        result.getCountries().getGrenada().getData().setName("grenada");
//        entityManager.persist(result.getCountries().getGrenada());
//    }
//    public void addGuam(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getGuam().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getGuam().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getGuam().setName("guam");
//
//        result.getCountries().getGuam().getData().setName("guam");
//        entityManager.persist(result.getCountries().getGuam());
//    }
//    public void addGuatemala(EntityManager entityManager, Json result){
//        if(!result.getCountries().getGuatemala().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getGuatemala().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getGuatemala().setName("guatemala");
//
//        result.getCountries().getGuatemala().getData().setName("guatemala");
//        entityManager.persist(result.getCountries().getGuatemala());
//    }
//    public void addGuernsey(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getGuernsey().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getGuernsey().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getGuernsey().setName("guernsey");
//
//        result.getCountries().getGuernsey().getData().setName("guernsey");
//        entityManager.persist(result.getCountries().getGuernsey());
//    }
//    public void addGuinea(EntityManager entityManager, Json result){
//        if(!result.getCountries().getGuinea().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getGuinea().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getGuinea().setName("guinea");
//
//        result.getCountries().getGuinea().getData().setName("guinea");
//        entityManager.persist(result.getCountries().getGuinea());
//    }
//    public void addGuinea_bissau(EntityManager entityManager, Json result){
//        if(!result.getCountries().getGuinea_bissau().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getGuinea_bissau().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getGuinea_bissau().setName("guinea_bissau");
//
//        result.getCountries().getGuinea_bissau().getData().setName("guinea_bissau");
//        entityManager.persist(result.getCountries().getGuinea_bissau());
//    }
//    public void addGuyana(EntityManager entityManager, Json result){
//        if(!result.getCountries().getGuyana().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getGuyana().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getGuyana().setName("guyana");
//
//        result.getCountries().getGuyana().getData().setName("guyana");
//        entityManager.persist(result.getCountries().getGuyana());
//    }
//
//    public void addG(EntityManager entityManager, Json result){
//        addGabon(entityManager,result);
//        addGambia_the(entityManager,result);
//        addGaza_strip(entityManager,result);
//        addGeorgia(entityManager,result);
//        addGermany(entityManager,result);
//        addGhana(entityManager,result);
//        addGibraltar(entityManager,result);
//        addGreece(entityManager,result);
//        addGreenland(entityManager,result);
//        addGrenada(entityManager,result);
//        addGuam(entityManager,result);
//        addGuatemala(entityManager,result);
//        addGuernsey(entityManager,result);
//        addGuinea(entityManager,result);
//        addGuinea_bissau(entityManager,result);
//        addGuyana(entityManager,result);
//      }
//
//    public void addHaiti(EntityManager entityManager, Json result){
//        if(!result.getCountries().getHaiti().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getHaiti().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getHaiti().setName("haiti");
//
//        result.getCountries().getHaiti().getData().setName("haiti");
//        entityManager.persist(result.getCountries().getHaiti());
//    }
//    public void addHeard_island_and_mcdonald_islands(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getHeard_island_and_mcdonald_islands().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getHeard_island_and_mcdonald_islands().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getHeard_island_and_mcdonald_islands().setName("heard_island_and_mcdonald_islands");
//
//        result.getCountries().getHeard_island_and_mcdonald_islands().getData().setName("heard_island_and_mcdonald_islands");
//        entityManager.persist(result.getCountries().getHeard_island_and_mcdonald_islands());
//    }
//    public void addHoly_see_vatican_city(EntityManager entityManager, Json result){
//        if(!result.getCountries().getHoly_see_vatican_city().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getHoly_see_vatican_city().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getHoly_see_vatican_city().setName("holy_see_vatican_city");
//
//        result.getCountries().getHoly_see_vatican_city().getData().setName("holy_see_vatican_city");
//        entityManager.persist(result.getCountries().getHoly_see_vatican_city());
//    }
//    public void addHonduras(EntityManager entityManager, Json result){
//        if(!result.getCountries().getHonduras().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getHonduras().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getHonduras().setName("honduras");
//
//        result.getCountries().getHonduras().getData().setName("honduras");
//        entityManager.persist(result.getCountries().getHonduras());
//    }
//    public void addHong_kong(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getHong_kong().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getHong_kong().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getHong_kong().setName("hong_kong");
//
//        result.getCountries().getHong_kong().getData().setName("hong_kong");
//        entityManager.persist(result.getCountries().getHong_kong());
//    }
//    public void addHungary(EntityManager entityManager, Json result){
//        if(!result.getCountries().getHungary().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getHungary().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getHungary().setName("hungary");
//
//        result.getCountries().getHungary().getData().setName("hungary");
//        entityManager.persist(result.getCountries().getHungary());
//    }
//
//    public void addH(EntityManager entityManager, Json result){
//        addHaiti(entityManager,result);
//        addHeard_island_and_mcdonald_islands(entityManager,result);
//        addHoly_see_vatican_city(entityManager,result);
//        addHonduras(entityManager,result);
//        addHong_kong(entityManager,result);
//        addHungary(entityManager,result);
//    }
//
//    public void addIceland(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getIceland().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getIceland().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getIceland().setName("iceland");
//
//        result.getCountries().getIceland().getData().setName("iceland");
//        entityManager.persist(result.getCountries().getIceland());
//    }
//    public void addIndia(EntityManager entityManager, Json result){
//        if(!result.getCountries().getIndia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getIndia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getIndia().setName("india");
//
//        result.getCountries().getIndia().getData().setName("india");
//        entityManager.persist(result.getCountries().getIndia());
//    }
//    public void addIndian_ocean(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getIndian_ocean().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getIndian_ocean().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getIndian_ocean().setName("indian_ocean");
//
//        result.getCountries().getIndian_ocean().getData().setName("indian_ocean");
//        entityManager.persist(result.getCountries().getIndian_ocean());
//    }
//    public void addIndonesia(EntityManager entityManager, Json result){
//        if(!result.getCountries().getIndonesia().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getIndonesia().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getIndonesia().setName("indonesia");
//
//        result.getCountries().getIndonesia().getData().setName("indonesia");
//        entityManager.persist(result.getCountries().getIndonesia());
//    }
//    public void addIran(EntityManager entityManager, Json result){
//        if(!result.getCountries().getIran().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getIran().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getIran().setName("iran");
//
//        result.getCountries().getIran().getData().setName("iran");
//        entityManager.persist(result.getCountries().getIran());
//    }
//    public void addIraq(EntityManager entityManager, Json result){
//        if(!result.getCountries().getIraq().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getIraq().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getIraq().setName("iraq");
//
//        result.getCountries().getIraq().getData().setName("iraq");
//        entityManager.persist(result.getCountries().getIraq());
//    }
//    public void addIreland(EntityManager entityManager, Json result){
//        if(!result.getCountries().getIreland().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getIreland().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getIreland().setName("ireland");
//
//        result.getCountries().getIreland().getData().setName("ireland");
//        entityManager.persist(result.getCountries().getIreland());
//    }
//    public void addIsle_of_man(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getIsle_of_man().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getIsle_of_man().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getIsle_of_man().setName("isle_of_man");
//
//        result.getCountries().getIsle_of_man().getData().setName("isle_of_man");
//        entityManager.persist(result.getCountries().getIsle_of_man());
//    }
//    public void addIsrael(EntityManager entityManager, Json result){
//        if(!result.getCountries().getIsrael().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getIsrael().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getIsrael().setName("israel");
//
//        result.getCountries().getIsrael().getData().setName("israel");
//        entityManager.persist(result.getCountries().getIsrael());
//    }
//    public void addItaly(EntityManager entityManager, Json result){
//        if(!result.getCountries().getItaly().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getItaly().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getItaly().setName("italy");
//
//        result.getCountries().getItaly().getData().setName("italy");
//        entityManager.persist(result.getCountries().getItaly());
//    }
//
//    public void addI(EntityManager entityManager, Json result){
//        addIceland(entityManager,result);
//        addIndia(entityManager,result);
//        addIndian_ocean(entityManager,result);
//        addIndonesia(entityManager,result);
//        addIran(entityManager,result);
//        addIraq(entityManager,result);
//        addIreland(entityManager,result);
//        addIsle_of_man(entityManager,result);
//        addIsrael(entityManager,result);
//        addItaly(entityManager,result);
//
//    }
//
//    public void addJamaica(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getJamaica().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getJamaica().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getJamaica().setName("jamaica");
//
//        result.getCountries().getJamaica().getData().setName("jamaica");
//        entityManager.persist(result.getCountries().getJamaica());
//    }
//    public void addJan_mayen(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getJan_mayen().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getJan_mayen().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getJan_mayen().setName("jan_mayen");
//
//        result.getCountries().getJan_mayen().getData().setName("jan_mayen");
//        entityManager.persist(result.getCountries().getJan_mayen());
//    }
//    public void addJapan(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getJapan().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getJapan().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getJapan().setName("japan");
//
//        result.getCountries().getJapan().getData().setName("japan");
//        entityManager.persist(result.getCountries().getJapan());
//    }
//    public void addJersey(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getJersey().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getJersey().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getJersey().setName("jersey");
//
//        result.getCountries().getJersey().getData().setName("jersey");
//        entityManager.persist(result.getCountries().getJersey());
//    }
//    public void addJordan(EntityManager entityManager, Json result){
//        if(!result.getCountries().getJordan().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getJordan().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getJordan().setName("jordan");
//
//        result.getCountries().getJordan().getData().setName("jordan");
//        entityManager.persist(result.getCountries().getJordan());
//    }
//
//    public void addJ(EntityManager entityManager, Json result){
//        addJamaica(entityManager,result);
//        addJan_mayen(entityManager,result);
//        addJapan(entityManager,result);
//        addJersey(entityManager,result);
//        addJordan(entityManager,result);
//    }
//
//    public void addKazakhstan(EntityManager entityManager, Json result){
//        if(!result.getCountries().getKazakhstan().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getKazakhstan().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getKazakhstan().setName("kazakhstan");
//
//        result.getCountries().getKazakhstan().getData().setName("kazakhstan");
//        entityManager.persist(result.getCountries().getKazakhstan());
//    }
//    public void addKenya(EntityManager entityManager, Json result){
//        if(!result.getCountries().getKenya().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getKenya().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getKenya().setName("kenya");
//
//        result.getCountries().getKenya().getData().setName("kenya");
//        entityManager.persist(result.getCountries().getKenya());
//    }
//    public void addKiribati(EntityManager entityManager, Json result){
///*        if(!result.getCountries().getKiribati().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getKiribati().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }*/
//        result.getCountries().getKiribati().setName("kiribati");
//
//        result.getCountries().getKiribati().getData().setName("kiribati");
//        entityManager.persist(result.getCountries().getKiribati());
//    }
//    public void addKorea_north(EntityManager entityManager, Json result){
//        if(!result.getCountries().getKorea_north().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getKorea_north().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getKorea_north().setName("korea_north");
//
//        result.getCountries().getKorea_north().getData().setName("korea_north");
//        entityManager.persist(result.getCountries().getKorea_north());
//    }
//    public void addKorea_south(EntityManager entityManager, Json result){
//        if(!result.getCountries().getKorea_south().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getKorea_south().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getKorea_south().setName("korea_south");
//
//        result.getCountries().getKorea_south().getData().setName("korea_south");
//        entityManager.persist(result.getCountries().getKorea_south());
//    }
//    public void addKosovo(EntityManager entityManager, Json result){
//        if(!result.getCountries().getKosovo().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getKosovo().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getKosovo().setName("kosovo");
//
//        result.getCountries().getKosovo().getData().setName("kosovo");
//        entityManager.persist(result.getCountries().getKosovo());
//    }
//    public void addKyrgyzstan(EntityManager entityManager, Json result){
//        if(!result.getCountries().getKyrgyzstan().getData().getGeography().getLand_boundaries().getBorder_countries().isEmpty()) {
//            for (Border_countries bc : result.getCountries().getKyrgyzstan().getData().getGeography().getLand_boundaries().getBorder_countries()) {
//                bc.setBorder(bc.getBorder_length().getValue());
//                bc.setUnits(bc.getBorder_length().getUnits());
//            }
//        }
//        result.getCountries().getKyrgyzstan().setName("kyrgyzstan");
//
//        result.getCountries().getKyrgyzstan().getData().setName("kyrgyzstan");
//        entityManager.persist(result.getCountries().getKyrgyzstan());
//    }
//
//    public void addK(EntityManager entityManager, Json result){
//        addKazakhstan(entityManager,result);
//        addKenya(entityManager,result);
//        addKiribati(entityManager,result);
//        addKorea_north(entityManager,result);
//        addKorea_south(entityManager,result);
//        addKosovo(entityManager,result);
//        addKyrgyzstan(entityManager,result);
//    }







}
