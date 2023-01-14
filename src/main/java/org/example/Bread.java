package org.example;

public class Bread extends Product {
    private double calories;

    public Bread(double cost, String name, double calories) {
        super(cost, name);
        this.calories = calories;
    }

    @Override
    public String toString() {
        return super.toString() + " (calories: " + this.calories + ")";
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}
