package com.nithish.app.mysql.models;

import jakarta.persistence.*;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String Company_name;

    @Column
    private String Model_name;

    @Column
    private String Model_type;

    @Column
    private String fuel_type;

    @Column
    private String engine_spec;

    @Column
    private String color;

    @Column
    private String model_year;

    @Column
    private long price;

    @Column
    private int seat_count;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompany_name() {
        return Company_name;
    }

    public void setCompany_name(String company_name) {
        Company_name = company_name;
    }

    public String getModel_name() {
        return Model_name;
    }

    public void setModel_name(String model_name) {
        Model_name = model_name;
    }

    public String getModel_type() {
        return Model_type;
    }

    public void setModel_type(String model_type) {
        Model_type = model_type;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public String getEngine_spec() {
        return engine_spec;
    }

    public void setEngine_spec(String engine_spec) {
        this.engine_spec = engine_spec;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel_year() {
        return model_year;
    }

    public void setModel_year(String model_year) {
        this.model_year = model_year;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getSeat_count() {
        return seat_count;
    }

    public void setSeat_count(int seat_count) {
        this.seat_count = seat_count;
    }
}
