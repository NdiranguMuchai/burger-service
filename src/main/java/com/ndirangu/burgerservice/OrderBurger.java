package com.ndirangu.burgerservice;

public class OrderBurger {

    public static void main(String[] args) {
        Burger suzzieBurger =
                new Burger.Builder()
                        .buns("regular")
                        .patty("chicken", 1)
                        .cheese("regular")
                        .bacon(2)
                        .sauce("ketchup")
                        .build();

        Burger kimothoBurger  = new Burger.Builder()
                .buns("buns with sesame")
                .patty("beef", 2)
                .bacon(4)
                .lettuce("extra")
                .tomatoes("regular")
                .sauce("ketchup")
                .egg("well done")
                .build();


        System.out.println(suzzieBurger);
        System.out.println(kimothoBurger);
    }
}
