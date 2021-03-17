package com.munnicha.patterns.gof.structural.facade.model;

/**
 *
 * @author munnicha
 */
public class Product {
    
    private int id;
    private String name;
    private double price;
    private String[] availableCountries={"HU","DE","US"};

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String[] getAvailableCountries() {
        return availableCountries;
    }

    public void setAvailableCountries(String[] availableCountries) {
        this.availableCountries = availableCountries;
    }
    
}
