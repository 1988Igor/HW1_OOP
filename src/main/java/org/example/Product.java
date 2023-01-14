package org.example;

public class Product {
    private double cost;
    private String name;

    public Product(double cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName() + ": " + getCost();
    }

    public void setName(String name) {
        this.name = name;
    }
}
