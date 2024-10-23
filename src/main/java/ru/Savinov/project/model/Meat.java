package ru.Savinov.project.model;

import ru.Savinov.project.model.constants.Discount;

public class Meat extends Food {
    public Meat(int amount, double price) {
        super(amount, price);
        isVegetarian = false;
    }

    @Override
    public double getDiscount() {
        return Discount.WITHOUT_SALE;
    }
}
