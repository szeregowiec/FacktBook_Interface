package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Transportation {
    @Id
    @GeneratedValue(generator = "incrementator")
    @GenericGenerator(name="incrementator", strategy ="increment")
    private int id;

    @OneToOne(cascade = {CascadeType.ALL})
    private Air_transport air_transport;
    @OneToOne(cascade = {CascadeType.ALL})
    private Pipelines pipelines;
    @OneToOne(cascade = {CascadeType.ALL})
    private Railways railways;
    @OneToOne(cascade = {CascadeType.ALL})
    private Roadways roadways;
    @OneToOne(cascade = {CascadeType.ALL})
    private Waterways waterways;
    @OneToOne(cascade = {CascadeType.ALL})
    private Merchant_marine merchant_marine;
    @OneToOne(cascade = {CascadeType.ALL})
    private Ports_and_terminals ports_and_terminals;


    public int getId() {
        return id;
    }

    public Air_transport getAir_transport() {
        return air_transport;
    }

    public Pipelines getPipelines() {
        return pipelines;
    }

    public Railways getRailways() {
        return railways;
    }

    public Roadways getRoadways() {
        return roadways;
    }

    public Waterways getWaterways() {
        return waterways;
    }

    public Merchant_marine getMerchant_marine() {
        return merchant_marine;
    }

    public Ports_and_terminals getPorts_and_terminals() {
        return ports_and_terminals;
    }
}
