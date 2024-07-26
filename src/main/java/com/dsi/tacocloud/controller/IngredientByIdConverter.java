package com.dsi.tacocloud.controller;

import com.dsi.tacocloud.tacos.Ingredient;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {
    private final Map<String, Ingredient> ingredientMap = new HashMap<>();

    public IngredientByIdConverter() {
        ingredientMap.put("FLTO", new Ingredient("FLTO", "Flower Tortilla", Ingredient.Type.WRAP));
        ingredientMap.put("COTO", new Ingredient("COTO","Corn Tortilla", Ingredient.Type.WRAP));
        ingredientMap.put("GRBF", new Ingredient("GRBF","Ground Beef", Ingredient.Type.PROTEIN));
        ingredientMap.put("CARN", new Ingredient("CARN","Carnites", Ingredient.Type.PROTEIN));
        ingredientMap.put("TMTO", new Ingredient("TMTO","Diced Tomatoes", Ingredient.Type.VEGETABLE));
        ingredientMap.put("NMTO", new Ingredient("NMTO","Diced Corolla", Ingredient.Type.VEGETABLE));
        ingredientMap.put("LTCE", new Ingredient("LTCE", "Goat Milk", Ingredient.Type.CHEESE));
        ingredientMap.put("LDCE", new Ingredient("LDCE", "Cow Milk", Ingredient.Type.CHEESE));
        ingredientMap.put("FrTt", new Ingredient("FrTt","Sour Cream", Ingredient.Type.SAUCE));
        ingredientMap.put("FrTL", new Ingredient("FrTL","Heavy Sour Cream", Ingredient.Type.SAUCE));
    }

    public Ingredient convert(String id) {
        return ingredientMap.get(id);
    }
}
