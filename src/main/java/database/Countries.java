package database;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Countries {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

 //   private MyCountry world;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry afghanistan;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry akrotiri;
//
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry albania;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry algeria;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry american_samoa;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry andorra;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry angola;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry anguilla;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry antarctica;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry antigua_and_barbuda;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry arctic_ocean;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry argentina;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry armenia;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry aruba;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry ashmore_and_cartier_islands;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry atlantic_ocean;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry australia;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry austria;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry azerbaijan;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry bahamas_the;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry bahrain;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry bangladesh;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry barbados;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry belarus;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry belgium;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry belize;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry benin;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry bermuda;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry bhutan;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry bolivia;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry bosnia_and_herzegovina;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry botswana;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry bouvet_island;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry brazil;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry british_indian_ocean_territory;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry british_virgin_islands;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry brunei;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry bulgaria;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry burkina_faso;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry burma;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry burundi;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry cabo_verde;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry cambodia;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry cameroon;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry canada;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry cayman_islands;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry central_african_republic;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry chad;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry chile;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry china;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry christmas_island;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry clipperton_island;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry cocos_keeling_islands;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry colombia;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry comoros;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry congo_democratic_republic_of_the;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry congo_republic_of_the;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry cook_islands;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry coral_sea_islands;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry costa_rica;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry croatia;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry cuba;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry curacao;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry cyprus;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry czechia;
    @OneToOne(cascade = {CascadeType.ALL})
    private MyCountry denmark;
    @OneToOne(cascade = {CascadeType.ALL})
    private MyCountry dhekelia;
    @OneToOne(cascade = {CascadeType.ALL})
    private MyCountry djibouti;
    @OneToOne(cascade = {CascadeType.ALL})
    private MyCountry dominica;
    @OneToOne(cascade = {CascadeType.ALL})
    private MyCountry dominican_republic;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry ecuador;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry egypt;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry el_salvador;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry equatorial_guinea;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry eritrea;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry estonia;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry ethiopia;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry falkland_islands_islas_malvinas;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry faroe_islands;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry fiji;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry finland;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry france;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry french_polynesia;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry gabon;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry gambia_the;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry gaza_strip;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry georgia;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry germany;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry ghana;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry gibraltar;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry greece;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry greenland;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry grenada;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry guam;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry guatemala;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry guernsey;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry guinea;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry guinea_bissau;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry guyana;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry haiti;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry heard_island_and_mcdonald_islands ;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry holy_see_vatican_city;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry honduras;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry hong_kong;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry hungary;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry iceland;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry india;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry indian_ocean;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry indonesia;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry iran;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry iraq;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry ireland;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry isle_of_man ;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry israel;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry italy;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry jamaica;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry jan_mayen;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry japan;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry jersey;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry jordan;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry kazakhstan;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry kenya;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry kiribati;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry korea_north;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry korea_south;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry kosovo;
//    @OneToOne(cascade = {CascadeType.ALL})
//    private MyCountry kyrgyzstan;

//    private MyCountry laos;
//    private MyCountry latvia;
//    private MyCountry lebanon;
//    private MyCountry lesotho;
//    private MyCountry liberia;
//    private MyCountry libya;
//    private MyCountry liechtenstein;
//    private MyCountry lithuania;
//    private MyCountry luxembourg;

//    private MyCountry macau;
//    private MyCountry macedonia;
//    private MyCountry madagascar;
//    private MyCountry malawi;
//    private MyCountry malaysia;
//    private MyCountry maldives;
//    private MyCountry mali;
//    private MyCountry malta;
//    private MyCountry marshall_islands;
//    private MyCountry mauritania;
//    private MyCountry mauritius;
//    private MyCountry mexico;
//    private MyCountry micronesia_federated_states_of;
//    private MyCountry moldova;
//    private MyCountry monaco;
//    private MyCountry mongolia;
//    private MyCountry montenegro;
//    private MyCountry montserrat ;
//    private MyCountry morocco;
//    private MyCountry mozambique;

//    private MyCountry namibia ;
//    private MyCountry nauru;
//    private MyCountry navassa_island;
//    private MyCountry nepal;
//    private MyCountry netherlands;
//    private MyCountry new_caledonia;
//    private MyCountry new_zealand;
//    private MyCountry nicaragua;
//    private MyCountry niger ;
//    private MyCountry nigeria;
//    private MyCountry niue;
//    private MyCountry norfolk_island;
//    private MyCountry northern_mariana_islands;
//    private MyCountry norway;

//    private MyCountry oman;

//    private MyCountry pacific_ocean ;
//    private MyCountry pakistan;
//    private MyCountry palau;
//    private MyCountry panama ;
//    private MyCountry papua_new_guinea;
//    private MyCountry paracel_islands ;
//    private MyCountry paraguay ;
//    private MyCountry peru;
//    private MyCountry philippines;
//    private MyCountry pitcairn_islands;
//    private MyCountry poland;
//    private MyCountry portugal;
//    private MyCountry puerto_rico;

//    private MyCountry qatar ;

//    private MyCountry romania;
//    private MyCountry russia;
//    private MyCountry rwanda;

//    private MyCountry saint_helena_ascension_and_tristan_da_cunha;
//    private MyCountry saint_kitts_and_nevis;
//    private MyCountry saint_lucia;
//    private MyCountry saint_pierre_and_miquelon;
//    private MyCountry saint_vincent_and_the_grenadines;
//    private MyCountry samoa;
//    private MyCountry san_marino;
//    private MyCountry sao_tome_and_principe;
//    private MyCountry saudi_arabia;
//    private MyCountry senegal;
//    private MyCountry serbia;
//    private MyCountry seychelles ;
//    private MyCountry sierra_leone;
//    private MyCountry singapore;
//    private MyCountry sint_maarten;
//    private MyCountry slovakia ;
//    private MyCountry slovenia;
//    private MyCountry solomon_islands;
//    private MyCountry somalia;
//    private MyCountry south_africa ;
//    private MyCountry southern_ocean;
//    private MyCountry south_georgia_and_south_sandwich_islands;
//    private MyCountry south_sudan;
//    private MyCountry spain;
//    private MyCountry spratly_islands;
//    private MyCountry sri_lanka;
//    private MyCountry sudan;
//    private MyCountry suriname;
//    private MyCountry svalbard;
//    private MyCountry swaziland;
//    private MyCountry sweden;
//    private MyCountry switzerland;
//    private MyCountry syria;

//    private MyCountry taiwan;
//    private MyCountry tajikistan;
//    private MyCountry tanzania ;
//    private MyCountry thailand;
//    private MyCountry timor_leste;
//    private MyCountry togo
//    private MyCountry tokelau;
//    private MyCountry tonga;
//    private MyCountry trinidad_and_tobago;
//    private MyCountry tunisia;
//    private MyCountry turkey;
//    private MyCountry turkmenistan;
//    private MyCountry turks_and_caicos_islands;
//    private MyCountry tuvalu;

//    private MyCountry uganda;
//    private MyCountry ukraine;
//    private MyCountry united_arab_emirates ;
//    private MyCountry united_kingdom;
//    private MyCountry united_states;
//    private MyCountry uruguay;
//    private MyCountry uzbekistan;

//    private MyCountry vanuatu;
//    private MyCountry venezuela;
//    private MyCountry vietnam;
//    private MyCountry virgin_islands;

//    private MyCountry wake_island;
//    private MyCountry wallis_and_futuna ;
//    private MyCountry west_bank;
//    private MyCountry western_sahara;

//    private MyCountry yemen;

//    private MyCountry zambia;
//    private MyCountry zimbabwe ;

    /*// private MyCountry european_union; // geographic_coordinates
    // private MyCountry saint_martin ; // nie ma danych N/A
    // private MyCountry saint_barthelemy; // nie ma danych N/A
    // private MyCountry kuwait; // nie ma danych i wywala
    // private MyCountry cote_d'_ivoire; // nazwa*/

//    public MyCountry getWorld() {
//        return world;
//    }

//    public MyCountry getAfghanistan() {
//        return afghanistan;
//    }
//
//    public MyCountry getAkrotiri() {
//        return akrotiri;
//    }
//
//    public MyCountry getAlbania() {
//        return albania;
//    }
//
//    public MyCountry getAlgeria() {
//        return algeria;
//    }
//
//    public MyCountry getAmerican_samoa() {
//        return american_samoa;
//    }
//
//    public MyCountry getAndorra() {
//        return andorra;
//    }
//
//    public MyCountry getAngola() {
//        return angola;
//    }
//
//    public MyCountry getAnguilla() {
//        return anguilla;
//    }
//
//    public MyCountry getAntarctica() {
//        return antarctica;
//    }
//
//    public MyCountry getAntigua_and_barbuda() {
//        return antigua_and_barbuda;
//    }
//
//    public MyCountry getArctic_ocean() {
//        return arctic_ocean;
//    }
//
//    public MyCountry getArgentina() {
//        return argentina;
//    }
//
//    public MyCountry getArmenia() {
//        return armenia;
//    }
//
//    public MyCountry getAruba() {
//        return aruba;
//    }
//
//    public MyCountry getAshmore_and_cartier_islands() {
//        return ashmore_and_cartier_islands;
//    }
//
//    public MyCountry getAtlantic_ocean() {
//        return atlantic_ocean;
//    }
//
//    public MyCountry getAustralia() {
//        return australia;
//    }
//
//    public MyCountry getAustria() {
//        return austria;
//    }
//
//    public MyCountry getAzerbaijan() {
//        return azerbaijan;
//    }
//
//    public MyCountry getBahamas_the() {
//        return bahamas_the;
//    }
//
//    public MyCountry getBahrain() {
//        return bahrain;
//    }
//
//    public MyCountry getBangladesh() {
//        return bangladesh;
//    }
//
//    public MyCountry getBarbados() {
//        return barbados;
//    }
//
//    public MyCountry getBelarus() {
//        return belarus;
//    }
//
//    public MyCountry getBelgium() {
//        return belgium;
//    }
//
//    public MyCountry getBelize() {
//        return belize;
//    }
//
//    public MyCountry getBenin() {
//        return benin;
//    }
//
//    public MyCountry getBermuda() {
//        return bermuda;
//    }
//
//    public MyCountry getBhutan() {
//        return bhutan;
//    }
//
//    public MyCountry getBolivia() {
//        return bolivia;
//    }
//
//    public MyCountry getBosnia_and_herzegovina() {
//        return bosnia_and_herzegovina;
//    }
//
//    public MyCountry getBotswana() {
//        return botswana;
//    }
//
//    public MyCountry getBouvet_island() {
//        return bouvet_island;
//    }
//
//    public MyCountry getBrazil() {
//        return brazil;
//    }
//
//    public MyCountry getBritish_indian_ocean_territory() {
//        return british_indian_ocean_territory;
//    }
//
//    public MyCountry getBritish_virgin_islands() {
//        return british_virgin_islands;
//    }
//
//    public MyCountry getBrunei() {
//        return brunei;
//    }
//
//    public MyCountry getBulgaria() {
//        return bulgaria;
//    }
//
//    public MyCountry getBurkina_faso() {
//        return burkina_faso;
//    }
//
//    public MyCountry getBurma() {
//        return burma;
//    }
//
//    public MyCountry getBurundi() {
//        return burundi;
//    }
//
//    public MyCountry getCabo_verde() {
//        return cabo_verde;
//    }
//
//    public MyCountry getCambodia() {
//        return cambodia;
//    }
//
//    public MyCountry getCameroon() {
//        return cameroon;
//    }
//
//    public MyCountry getCanada() {
//        return canada;
//    }
//
//    public MyCountry getCayman_islands() {
//        return cayman_islands;
//    }
//
//    public MyCountry getCentral_african_republic() {
//        return central_african_republic;
//    }
//
//    public MyCountry getChad() {
//        return chad;
//    }
//
//    public MyCountry getChile() {
//        return chile;
//    }
//
//    public MyCountry getChina() {
//        return china;
//    }
//
//    public MyCountry getChristmas_island() {
//        return christmas_island;
//    }
//
//    public MyCountry getClipperton_island() {
//        return clipperton_island;
//    }
//
//    public MyCountry getCocos_keeling_islands() {
//        return cocos_keeling_islands;
//    }
//
//    public MyCountry getColombia() {
//        return colombia;
//    }
//
//    public MyCountry getComoros() {
//        return comoros;
//    }
//
//    public MyCountry getCongo_democratic_republic_of_the() {
//        return congo_democratic_republic_of_the;
//    }
//
//    public MyCountry getCongo_republic_of_the() {
//        return congo_republic_of_the;
//    }
//
//    public MyCountry getCook_islands() {
//        return cook_islands;
//    }
//
//    public MyCountry getCoral_sea_islands() {
//        return coral_sea_islands;
//    }
//
//    public MyCountry getCosta_rica() {
//        return costa_rica;
//    }
//
//    public MyCountry getCroatia() {
//        return croatia;
//    }
//
//    public MyCountry getCuba() {
//        return cuba;
//    }
//
//    public MyCountry getCuracao() {
//        return curacao;
//    }
//
//    public MyCountry getCyprus() {
//        return cyprus;
//    }
//
//    public MyCountry getCzechia() {
//        return czechia;
//    }

    public MyCountry getDenmark() {
        return denmark;
    }

    public MyCountry getDhekelia() {
        return dhekelia;
    }

    public MyCountry getDjibouti() {
        return djibouti;
    }

    public MyCountry getDominica() {
        return dominica;
    }

    public MyCountry getDominican_republic() {
        return dominican_republic;
    }

//    public MyCountry getEcuador() {
//        return ecuador;
//    }
//
//    public MyCountry getEgypt() {
//        return egypt;
//    }
//
//    public MyCountry getEl_salvador() {
//        return el_salvador;
//    }
//
//    public MyCountry getEquatorial_guinea() {
//        return equatorial_guinea;
//    }
//
//    public MyCountry getEritrea() {
//        return eritrea;
//    }
//
//    public MyCountry getEstonia() {
//        return estonia;
//    }
//
//    public MyCountry getEthiopia() {
//        return ethiopia;
//    }
//
//    public MyCountry getFalkland_islands_islas_malvinas() {
//        return falkland_islands_islas_malvinas;
//    }
//
//    public MyCountry getFaroe_islands() {
//        return faroe_islands;
//    }
//
//    public MyCountry getFiji() {
//        return fiji;
//    }
//
//    public MyCountry getFinland() {
//        return finland;
//    }
//
//    public MyCountry getFrance() {
//        return france;
//    }
//
//    public MyCountry getFrench_polynesia() {
//        return french_polynesia;
//    }
//
//    public MyCountry getGabon() {
//        return gabon;
//    }
//
//    public MyCountry getGambia_the() {
//        return gambia_the;
//    }
//
//    public MyCountry getGaza_strip() {
//        return gaza_strip;
//    }
//
//    public MyCountry getGeorgia() {
//        return georgia;
//    }
//
//    public MyCountry getGermany() {
//        return germany;
//    }
//
//    public MyCountry getGhana() {
//        return ghana;
//    }
//
//    public MyCountry getGibraltar() {
//        return gibraltar;
//    }
//
//    public MyCountry getGreece() {
//        return greece;
//    }
//
//    public MyCountry getGreenland() {
//        return greenland;
//    }
//
//    public MyCountry getGrenada() {
//        return grenada;
//    }
//
//    public MyCountry getGuam() {
//        return guam;
//    }
//
//    public MyCountry getGuatemala() {
//        return guatemala;
//    }
//
//    public MyCountry getGuernsey() {
//        return guernsey;
//    }
//
//    public MyCountry getGuinea() {
//        return guinea;
//    }
//
//    public MyCountry getGuinea_bissau() {
//        return guinea_bissau;
//    }
//
//    public MyCountry getGuyana() {
//        return guyana;
//    }
//
//    public MyCountry getHaiti() {
//        return haiti;
//    }
//
//    public MyCountry getHeard_island_and_mcdonald_islands() {
//        return heard_island_and_mcdonald_islands;
//    }
//
//    public MyCountry getHoly_see_vatican_city() {
//        return holy_see_vatican_city;
//    }
//
//    public MyCountry getHonduras() {
//        return honduras;
//    }
//
//    public MyCountry getHong_kong() {
//        return hong_kong;
//    }
//
//    public MyCountry getHungary() {
//        return hungary;
//    }
//
//    public MyCountry getIceland() {
//        return iceland;
//    }
//
//    public MyCountry getIndia() {
//        return india;
//    }
//
//    public MyCountry getIndian_ocean() {
//        return indian_ocean;
//    }
//
//    public MyCountry getIndonesia() {
//        return indonesia;
//    }
//
//    public MyCountry getIran() {
//        return iran;
//    }
//
//    public MyCountry getIraq() {
//        return iraq;
//    }
//
//    public MyCountry getIreland() {
//        return ireland;
//    }
//
//    public MyCountry getIsle_of_man() {
//        return isle_of_man;
//    }
//
//    public MyCountry getIsrael() {
//        return israel;
//    }
//
//    public MyCountry getItaly() {
//        return italy;
//    }
//
//    public MyCountry getJamaica() {
//        return jamaica;
//    }
//
//    public MyCountry getJan_mayen() {
//        return jan_mayen;
//    }
//
//    public MyCountry getJapan() {
//        return japan;
//    }
//
//    public MyCountry getJersey() {
//        return jersey;
//    }
//
//    public MyCountry getJordan() {
//        return jordan;
//    }
//
//    public MyCountry getKazakhstan() {
//        return kazakhstan;
//    }
//
//    public MyCountry getKenya() {
//        return kenya;
//    }
//
//    public MyCountry getKiribati() {
//        return kiribati;
//    }
//
//    public MyCountry getKorea_north() {
//        return korea_north;
//    }
//
//    public MyCountry getKorea_south() {
//        return korea_south;
//    }
//
//    public MyCountry getKosovo() {
//        return kosovo;
//    }
//
////    public MyCountry getKuwait() {
////        return kuwait;
////    }
//
//    public MyCountry getKyrgyzstan() {
//        return kyrgyzstan;
//    }

//    public MyCountry getLaos() {
//        return laos;
//    }
//
//    public MyCountry getLatvia() {
//        return latvia;
//    }
//
//    public MyCountry getLebanon() {
//        return lebanon;
//    }
//
//    public MyCountry getLesotho() {
//        return lesotho;
//    }
//
//    public MyCountry getLiberia() {
//        return liberia;
//    }
//
//    public MyCountry getLibya() {
//        return libya;
//    }
//
//    public MyCountry getLiechtenstein() {
//        return liechtenstein;
//    }
//
//    public MyCountry getLithuania() {
//        return lithuania;
//    }
//
//    public MyCountry getLuxembourg() {
//        return luxembourg;
//    }
//
//    public MyCountry getMacau() {
//        return macau;
//    }
//
//    public MyCountry getMacedonia() {
//        return macedonia;
//    }
//
//    public MyCountry getMadagascar() {
//        return madagascar;
//    }
//
//    public MyCountry getMalawi() {
//        return malawi;
//    }
//
//    public MyCountry getMalaysia() {
//        return malaysia;
//    }
//
//    public MyCountry getMaldives() {
//        return maldives;
//    }
//
//    public MyCountry getMali() {
//        return mali;
//    }
//
//    public MyCountry getMalta() {
//        return malta;
//    }
//
//    public MyCountry getMarshall_islands() {
//        return marshall_islands;
//    }
//
//    public MyCountry getMauritania() {
//        return mauritania;
//    }
//
//    public MyCountry getMauritius() {
//        return mauritius;
//    }
//
//    public MyCountry getMexico() {
//        return mexico;
//    }
//
//    public MyCountry getMicronesia_federated_states_of() {
//        return micronesia_federated_states_of;
//    }
//
//    public MyCountry getMoldova() {
//        return moldova;
//    }
//
//    public MyCountry getMonaco() {
//        return monaco;
//    }
//
//    public MyCountry getMongolia() {
//        return mongolia;
//    }
//
//    public MyCountry getMontenegro() {
//        return montenegro;
//    }
//
//    public MyCountry getMontserrat() {
//        return montserrat;
//    }
//
//    public MyCountry getMorocco() {
//        return morocco;
//    }
//
//    public MyCountry getMozambique() {
//        return mozambique;
//    }
//
//    public MyCountry getNamibia() {
//        return namibia;
//    }
//
//    public MyCountry getNauru() {
//        return nauru;
//    }
//
//    public MyCountry getNavassa_island() {
//        return navassa_island;
//    }
//
//    public MyCountry getNepal() {
//        return nepal;
//    }
//
//    public MyCountry getNetherlands() {
//        return netherlands;
//    }
//
//    public MyCountry getNew_caledonia() {
//        return new_caledonia;
//    }
//
//    public MyCountry getNew_zealand() {
//        return new_zealand;
//    }
//
//    public MyCountry getNicaragua() {
//        return nicaragua;
//    }
//
//    public MyCountry getNiger() {
//        return niger;
//    }
//
//    public MyCountry getNigeria() {
//        return nigeria;
//    }
//
//    public MyCountry getNiue() {
//        return niue;
//    }
//
//    public MyCountry getParacel_islands() {
//        return paracel_islands;
//    }
//
//    public MyCountry getParaguay() {
//        return paraguay;
//    }
//
//    public MyCountry getPeru() {
//        return peru;
//    }
//
//    public MyCountry getPhilippines() {
//        return philippines;
//    }
//
//    public MyCountry getPitcairn_islands() {
//        return pitcairn_islands;
//    }
//
//    public MyCountry getPoland() {
//        return poland;
//    }
//
//    public MyCountry getVenezuela() {
//        return venezuela;
//    }
//
//    public MyCountry getVietnam() {
//        return vietnam;
//    }
//
//    public MyCountry getVirgin_islands() {
//        return virgin_islands;
//    }
//
//    public MyCountry getWake_island() {
//        return wake_island;
//    }
//
//    public MyCountry getWallis_and_futuna() {
//        return wallis_and_futuna;
//    }
//
//    public MyCountry getWest_bank() {
//        return west_bank;
//    }
//
//    public MyCountry getWestern_sahara() {
//        return western_sahara;
//    }
//
//    public MyCountry getYemen() {
//        return yemen;
//    }
//
//    public MyCountry getZambia() {
//        return zambia;
//    }
//
//    public MyCountry getZimbabwe() {
//        return zimbabwe;
//    }
//
////    public MyCountry getEuropean_union() {
////        return european_union;
////    }
//
//    public MyCountry getNorfolk_island() {
//        return norfolk_island;
//    }
//
//    public MyCountry getNorthern_mariana_islands() {
//        return northern_mariana_islands;
//    }
//
//    public MyCountry getNorway() {
//        return norway;
//    }
//
//    public MyCountry getOman() {
//        return oman;
//    }
//
//    public MyCountry getPacific_ocean() {
//        return pacific_ocean;
//    }
//
//    //  public MyCountry getPakistan() {
//    //     return pakistan;
//    //   }
//
//    public MyCountry getPalau() {
//        return palau;
//    }
//
//    public MyCountry getPanama() {
//        return panama;
//    }
//
//    public MyCountry getPapua_new_guinea() {
//        return papua_new_guinea;
//    }
//
//    public MyCountry getPortugal() {
//        return portugal;
//    }
//
//    public MyCountry getPuerto_rico() {
//        return puerto_rico;
//    }
//
//    public MyCountry getQatar() {
//        return qatar;
//    }
//
//    public MyCountry getRomania() {
//        return romania;
//    }
//
//    public MyCountry getRussia() {
//        return russia;
//    }
//
//    public MyCountry getRwanda() {
//        return rwanda;
//    }
//
////    public MyCountry getSaint_barthelemy() {
////        return saint_barthelemy;
////    }
//
//    public MyCountry getSaint_helena_ascension_and_tristan_da_cunha() {
//        return saint_helena_ascension_and_tristan_da_cunha;
//    }
//
//    public MyCountry getSaint_kitts_and_nevis() {
//        return saint_kitts_and_nevis;
//    }
//
//    public MyCountry getSaint_lucia() {
//        return saint_lucia;
//    }
//
////    public MyCountry getSaint_martin() {
////        return saint_martin;
////    }
//
//    public MyCountry getSaint_pierre_and_miquelon() {
//        return saint_pierre_and_miquelon;
//    }
//
//    public MyCountry getSaint_vincent_and_the_grenadines() {
//        return saint_vincent_and_the_grenadines;
//    }
//
//    public MyCountry getSamoa() {
//        return samoa;
//    }
//
//    public MyCountry getSan_marino() {
//        return san_marino;
//    }
//
//    public MyCountry getSao_tome_and_principe() {
//        return sao_tome_and_principe;
//    }
//
//    public MyCountry getSaudi_arabia() {
//        return saudi_arabia;
//    }
//
//    public MyCountry getSenegal() {
//        return senegal;
//    }
//
//    public MyCountry getSerbia() {
//        return serbia;
//    }
//
//    public MyCountry getSeychelles() {
//        return seychelles;
//    }
//
//    public MyCountry getSierra_leone() {
//        return sierra_leone;
//    }
//
//    public MyCountry getSingapore() {
//        return singapore;
//    }
//
//    public MyCountry getSint_maarten() {
//        return sint_maarten;
//    }
//
//    public MyCountry getSlovakia() {
//        return slovakia;
//    }
//
//    public MyCountry getSlovenia() {
//        return slovenia;
//    }
//
//    public MyCountry getSolomon_islands() {
//        return solomon_islands;
//    }
//
//    public MyCountry getSomalia() {
//        return somalia;
//    }
//
//    public MyCountry getSouth_africa() {
//        return south_africa;
//    }
//
//    public MyCountry getSouthern_ocean() {
//        return southern_ocean;
//    }
//
//    public MyCountry getSouth_georgia_and_south_sandwich_islands() {
//        return south_georgia_and_south_sandwich_islands;
//    }
//
//    public MyCountry getSouth_sudan() {
//        return south_sudan;
//    }
//
//    public MyCountry getSpain() {
//        return spain;
//    }
//
//    public MyCountry getSpratly_islands() {
//        return spratly_islands;
//    }
//
//    public MyCountry getSri_lanka() {
//        return sri_lanka;
//    }
//
//    public MyCountry getSudan() {
//        return sudan;
//    }
//
//    public MyCountry getSuriname() {
//        return suriname;
//    }
//
//    public MyCountry getSvalbard() {
//        return svalbard;
//    }
//
//    public MyCountry getSwaziland() {
//        return swaziland;
//    }
//
//    public MyCountry getSweden() {
//        return sweden;
//    }
//
//    public MyCountry getSwitzerland() {
//        return switzerland;
//    }
//
//    public MyCountry getSyria() {
//        return syria;
//    }
//
//    public MyCountry getTaiwan() {
//        return taiwan;
//    }
//
//    public MyCountry getTajikistan() {
//        return tajikistan;
//    }
//
//    public MyCountry getTanzania() {
//        return tanzania;
//    }
//
//    public MyCountry getThailand() {
//        return thailand;
//    }
//
//    public MyCountry getTimor_leste() {
//        return timor_leste;
//    }
//
//    public MyCountry getTogo() {
//        return togo;
//    }
//
//    public MyCountry getTokelau() {
//        return tokelau;
//    }
//
//    public MyCountry getTonga() {
//        return tonga;
//    }
//
//    public MyCountry getTrinidad_and_tobago() {
//        return trinidad_and_tobago;
//    }
//
//    public MyCountry getTunisia() {
//        return tunisia;
//    }
//
//    public MyCountry getTurkey() {
//        return turkey;
//    }
//
//    public MyCountry getTurkmenistan() {
//        return turkmenistan;
//    }
//
//    public MyCountry getTurks_and_caicos_islands() {
//        return turks_and_caicos_islands;
//    }
//
//    public MyCountry getTuvalu() {
//        return tuvalu;
//    }
//
//    public MyCountry getUganda() {
//        return uganda;
//    }
//
//    public MyCountry getUkraine() {
//        return ukraine;
//    }
//
//    public MyCountry getUnited_arab_emirates() {
//        return united_arab_emirates;
//    }
//
//    public MyCountry getUnited_kingdom() {
//        return united_kingdom;
//    }
//
//    public MyCountry getUnited_states() {
//        return united_states;
//    }
//
//    public MyCountry getUruguay() {
//        return uruguay;
//    }
//
//    public MyCountry getUzbekistan() {
//        return uzbekistan;
//    }
//
//    public MyCountry getVanuatu() {
//        return vanuatu;
//    }
}