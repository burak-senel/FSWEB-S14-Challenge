package org.example.models;

import org.example.enums.BreadRollType;

public class DeluxeBurger extends Hamburger {
    private Drink drink;
    private  Cips cips;

    public DeluxeBurger(Drink drink, Cips cips) {
        super("DELUXE BURGER", "DOUBLE",19.10,BreadRollType.DOUBLE_BURGER);
        this.drink = drink;
        this.cips = cips;
    }

    @Override
    public void addAddition(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder deluxeBurgerStringBuilder  = new StringBuilder();
        deluxeBurgerStringBuilder.append("DRINK: "+ drink.getDrinkType() + "\n");
        deluxeBurgerStringBuilder.append("CIPS: "+ cips.getCipsType() + "\n");
        System.out.println(deluxeBurgerStringBuilder);
        super.itemizeHamburger();
    }
}