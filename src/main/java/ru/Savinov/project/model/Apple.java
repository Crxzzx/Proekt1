package ru.Savinov.project.model;

import ru.Savinov.project.model.constants.Colour;
import ru.Savinov.project.model.constants.Discount;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
        isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.RED_APPLE)) {
            return Discount.SALE_60;
        } else {
            return Discount.WITHOUT_SALE;
        }
    }
}

