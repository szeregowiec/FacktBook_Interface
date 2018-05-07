package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Economy {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(length = 50000)
    private String overview;
    @OneToOne(cascade = {CascadeType.ALL})
    private Gdp gdp;
    @OneToOne(cascade = {CascadeType.ALL})
    private Annual_Values gross_national_saving;
    @OneToOne(cascade = {CascadeType.ALL})
    private Agriculture_products agriculture_products;
    @OneToOne(cascade = {CascadeType.ALL})
    private Industries industries;
    @OneToOne(cascade = {CascadeType.ALL})
    private Industrial_production_growth_rate industrial_production_growth_rate;
    @OneToOne(cascade = {CascadeType.ALL})
    private Labor_force labor_force;
    @OneToOne(cascade = {CascadeType.ALL})
    private Annual_Values unemployment_rate;
    @OneToOne(cascade = {CascadeType.ALL})
    private ValueAndUnits population_below_poverty_line;
    @OneToOne(cascade = {CascadeType.ALL})
    private Household_income_by_percentage_share household_income_by_percentage_share;
    @OneToOne(cascade = {CascadeType.ALL})
    private Annual_Values distribution_of_family_income;
    @OneToOne(cascade = {CascadeType.ALL})
    private Budget budget;
    @OneToOne(cascade = {CascadeType.ALL})
    private Taxes_and_other_revenues taxes_and_other_revenues;
    @OneToOne(cascade = {CascadeType.ALL})
    private Budget_surplus_or_deficit budget_surplus_or_deficit;
    @OneToOne(cascade = {CascadeType.ALL})
    private Annual_Values public_debt;
    @OneToOne(cascade = {CascadeType.ALL})
    private Fiscal_year fiscal_year;
    @OneToOne(cascade = {CascadeType.ALL})
    private Annual_Values inflation_rate;
    @OneToOne(cascade = {CascadeType.ALL})
    private Annual_Values central_bank_discount_rate;
    @OneToOne(cascade = {CascadeType.ALL})
    private Annual_Values commercial_bank_prime_lending_rate;
    @OneToOne(cascade = {CascadeType.ALL})
    private Annual_Values stock_of_narrow_money;
    @OneToOne(cascade = {CascadeType.ALL})
    private Annual_Values stock_of_broad_money;
    @OneToOne(cascade = {CascadeType.ALL})
    private Annual_Values stock_of_domestic_credit;
    @OneToOne(cascade = {CascadeType.ALL})
    private Annual_Values market_value_of_publicly_traded_shares;
    @OneToOne(cascade = {CascadeType.ALL})
    private Annual_Values current_account_balance;
    @OneToOne(cascade = {CascadeType.ALL})
    private Exports exports;
    @OneToOne(cascade = {CascadeType.ALL})
    private Imports imports;
    @OneToOne(cascade = {CascadeType.ALL})
    private Annual_Values reserves_of_foreign_exchange_and_gold;
    @OneToOne(cascade = {CascadeType.ALL})
    private Annual_Values external_debt;
    @OneToOne(cascade = {CascadeType.ALL})
    private Stock_of_direct_foreign_investment stock_of_direct_foreign_investment;
    @OneToOne(cascade = {CascadeType.ALL})
    private Annual_Values exchange_rates;

    public String getOverview() {
        return overview;
    }

    public Gdp getGdp() {
        return gdp;
    }

    public Annual_Values getGross_national_saving() {
        return gross_national_saving;
    }

    public Agriculture_products getAgriculture_products() {
        return agriculture_products;
    }

    public Industries getIndustries() {
        return industries;
    }

    public Industrial_production_growth_rate getIndustrial_production_growth_rate() {
        return industrial_production_growth_rate;
    }

    public Labor_force getLabor_force() {
        return labor_force;
    }

    public Annual_Values getUnemployment_rate() {
        return unemployment_rate;
    }

    public ValueAndUnits getPopulation_below_poverty_line() {
        return population_below_poverty_line;
    }

    public Household_income_by_percentage_share getHousehold_income_by_percentage_share() {
        return household_income_by_percentage_share;
    }

    public Annual_Values getDistribution_of_family_income() {
        return distribution_of_family_income;
    }

    public Budget getBudget() {
        return budget;
    }

    public Taxes_and_other_revenues getTaxes_and_other_revenues() {
        return taxes_and_other_revenues;
    }

    public Budget_surplus_or_deficit getBudget_surplus_or_deficit() {
        return budget_surplus_or_deficit;
    }

    public Annual_Values getPublic_debt() {
        return public_debt;
    }

    public Fiscal_year getFiscal_year() {
        return fiscal_year;
    }

    public Annual_Values getInflation_rate() {
        return inflation_rate;
    }

    public Annual_Values getCentral_bank_discount_rate() {
        return central_bank_discount_rate;
    }

    public Annual_Values getCommercial_bank_prime_lending_rate() {
        return commercial_bank_prime_lending_rate;
    }

    public Annual_Values getStock_of_narrow_money() {
        return stock_of_narrow_money;
    }

    public Annual_Values getStock_of_broad_money() {
        return stock_of_broad_money;
    }

    public Annual_Values getStock_of_domestic_credit() {
        return stock_of_domestic_credit;
    }

    public Annual_Values getMarket_value_of_publicly_traded_shares() {
        return market_value_of_publicly_traded_shares;
    }

    public Annual_Values getCurrent_account_balance() {
        return current_account_balance;
    }

    public Exports getExports() {
        return exports;
    }

    public Imports getImports() {
        return imports;
    }

    public Annual_Values getReserves_of_foreign_exchange_and_gold() {
        return reserves_of_foreign_exchange_and_gold;
    }

    public Annual_Values getExternal_debt() {
        return external_debt;
    }

    public Stock_of_direct_foreign_investment getStock_of_direct_foreign_investment() {
        return stock_of_direct_foreign_investment;
    }

    public Annual_Values getExchange_rates() {
        return exchange_rates;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}
