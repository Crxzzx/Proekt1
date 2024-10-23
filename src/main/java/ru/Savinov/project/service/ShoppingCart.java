package ru.Savinov.project.service;

import ru.Savinov.project.model.Food;

public class ShoppingCart {
    Food[] products = new Food[3];

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public double sumWithOutSale() {
        double sum = 0;
        for (Food productsNoSale : products) {
            sum = sum + (productsNoSale.getAmount() * productsNoSale.getPrice());
        }
        return sum;
    }

    public double sumWithSale() {
        double sum = 0;
        for (Food productsSale : products) {
            sum = sum + (productsSale.getAmount() * (productsSale.getPrice() - (productsSale.getDiscount() / 100) * productsSale.getPrice()));
        }
        return sum;
    }

    public double vegetarianWithOutSale() {
        double sum = 0;
        for (Food productsVegetarian : products) {
            if (productsVegetarian.isVegetarian()) {
                sum = sum + (productsVegetarian.getAmount() * productsVegetarian.getPrice());
            }
        }
        return sum;
    }
}


