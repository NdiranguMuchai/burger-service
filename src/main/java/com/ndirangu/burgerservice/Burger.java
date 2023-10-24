package com.ndirangu.burgerservice;

import java.lang.reflect.Field;
import java.util.Map;

public class Burger {
    private final String buns;
    private final Map<String, Integer> patty; //type and number of patties.

    private final String cheese;
    private final int bacon;
    private final String lettuce;
    private final  String tomatoes;
    private final String sauce;

    private final String egg;


    public static class Builder{
        private  String buns;
        private  Map<String, Integer> patty;

        private  String cheese;
        private  int bacon;
        private  String lettuce;
        private   String tomatoes;
        private  String sauce;

        private  String egg;


        public Builder buns(String type){this.buns = type; return this; }

        public Builder patty(String type, int num){this.patty = Map.of(type, num); return this;}
        public Builder cheese(String type){this.cheese = type; return this;}

        public Builder bacon(int noOfStrips) {this.bacon  = noOfStrips; return this;}

        public Builder lettuce(String type){this.lettuce = type; return this;}

        public Builder tomatoes(String type){this.tomatoes = type; return this;}

        public Builder sauce(String type){this.sauce = type; return this;}

        public Builder egg(String cookedOption){this.egg = cookedOption; return this;}


        public Burger build(){
            return new Burger(this);
        }
    }

    private Burger (Builder builder){
        this.buns = builder.buns;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.bacon = builder.bacon;
        this.lettuce = builder.lettuce;
        this.tomatoes = builder.tomatoes;
        this.sauce = builder.sauce;
        this.egg = builder.egg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Burger{");

        Field[] fields = getClass().getDeclaredFields();
        for (Field field : fields) {
            try {
                Object value = field.get(this);
                if (value != null) {
                    sb.append(field.getName()).append('=').append(value).append(", ");
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        if (sb.toString().endsWith(", ")) {
            sb.setLength(sb.length() - 2); // Remove the trailing comma and space
        }

        sb.append("}");

        return sb.toString();
    }
}
