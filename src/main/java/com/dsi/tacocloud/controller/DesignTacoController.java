package com.dsi.tacocloud.controller;



import com.dsi.tacocloud.tacos.Ingredient;
import com.dsi.tacocloud.tacos.Taco;
import com.dsi.tacocloud.tacos.TacoOrder;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/design")//handles path after /design
@SessionAttributes("tacoOrder")//The obj of TacoOrder should be added a lil late and maintained throughout a session
public class DesignTacoController {
    @ModelAttribute
    public void addIngredientsToModel(Model model) {
        List<Ingredient> ingredientList = Arrays.asList(
                new Ingredient("FLTO","Flower Tortilla", Ingredient.Type.WRAP),
                new Ingredient("COTO","Corn Tortilla", Ingredient.Type.WRAP),
                new Ingredient("GRBF","Ground Beef", Ingredient.Type.PROTEIN),
                new Ingredient("CARN","Carnites", Ingredient.Type.PROTEIN),
                new Ingredient("TMTO","Diced Tomatoes", Ingredient.Type.VEGETABLE),
                new Ingredient("NMTO","Diced Corolla", Ingredient.Type.VEGETABLE),
                new Ingredient("LTCE", "Goat Milk", Ingredient.Type.CHEESE),
                new Ingredient("LDCE", "Cow Milk", Ingredient.Type.CHEESE),
                new Ingredient("FrTt","Sour Cream", Ingredient.Type.SAUCE),
                new Ingredient("FrTL","Heavy Sour Cream", Ingredient.Type.SAUCE)
        );
        Ingredient.Type[] types = Ingredient.Type.values();
        for(Ingredient.Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),filterByType(ingredientList,type));
        }
    }
    @ModelAttribute(name = "tacoOrder")
    public TacoOrder order(){
        return new TacoOrder();
    }
    @ModelAttribute(name = "taco")
    public Taco taco(){
        return new Taco();
    }
    @GetMapping
    public String showDesignForm(){
        return "design";
    }
    @PostMapping
    public String processTaco(@Valid  Taco taco, Errors error, @ModelAttribute TacoOrder tacoOrder){
        if(error.hasErrors()){
            return "design";
        }
        tacoOrder.addTaco(taco);
        return "redirect:/orders/current";
    }
    private List<Ingredient> filterByType(List<Ingredient> ingredientList, Ingredient.Type type) {
        return ingredientList
                .stream()
                .filter(x->x.getType().equals(type))
                .collect(Collectors.toList());
    }
}