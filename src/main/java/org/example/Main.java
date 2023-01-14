package org.example;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.getProducts().add(new Product(12, "Stake"));
        vendingMachine.getProducts().add(new Product(5, "Cola"));
        vendingMachine.getProducts().add(new Bread(5, "Baguete", 500));
        vendingMachine.getProducts().add(new Milk(2, "Barista", 0.5));

        for (Product product : vendingMachine.getProducts()) {
            System.out.println(product);
        }

    }
}