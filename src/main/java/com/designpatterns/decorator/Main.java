package com.designpatterns.decorator;

public class Main {

    public static void main(String[] args) {
        Beverage blackCoffee = new BlackCoffee();
        System.out.println("Black coffee cost: " + blackCoffee.cost());

        Beverage coffeeWithMilk = new MilkAddOn(blackCoffee);
        System.out.println("Black coffee with milk cost: " + coffeeWithMilk.cost());

        Beverage coffeeWithMilkAndSugar = new SugarAddOn(coffeeWithMilk);
        System.out.println("Black coffee with milk cost: " + coffeeWithMilkAndSugar.cost());
    }
}
