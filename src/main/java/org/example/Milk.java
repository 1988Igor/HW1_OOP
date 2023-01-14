package org.example;

public class Milk extends Product {
    private double volume;

    public Milk(double cost, String name, double volume) {
        super(cost, name);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + " (volume of milk: " + this.volume + " ml " + ")";
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
