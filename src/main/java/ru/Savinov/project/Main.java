package ru.Savinov.project;

import ru.Savinov.project.model.Apple;
import ru.Savinov.project.model.Food;
import ru.Savinov.project.model.Meat;
import ru.Savinov.project.model.constants.Colour;
import ru.Savinov.project.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food appleRed = new Apple(10, 50, Colour.RED_APPLE);
        Food appleGreen = new Apple(8, 60, Colour.GREEN_APPLE);
        Food[] shoppingCart = {meat, appleRed, appleGreen};
        ShoppingCart cart = new ShoppingCart(shoppingCart);
        System.out.println(cart.sumWithOutSale());
        System.out.println(cart.sumWithSale());
        System.out.println(cart.vegetarianWithOutSale());
    }
}
