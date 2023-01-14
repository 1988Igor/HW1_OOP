package org.example;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }
    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName().contains(name)) {
                return product;
            }
        }
        return null;
    }
    public Product getProductByCost(double cost) {
        for (Product product : products) {
            if (product.getCost() == cost) {
                return product;
            }
        }
        return null;
    }
    public VendingMachine() {
        this.products = new ArrayList<>();
    }

}
