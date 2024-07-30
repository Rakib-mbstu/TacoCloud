package com.dsi.tacocloud.tacos;

import lombok.Getter;

@Getter
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public enum Type {
        WRAP, PROTEIN, VEGETABLE, CHEESE, SAUCE, POTATO
    }

    public Ingredient(String id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
}
