package me.davydovep.recipesapp_2.controller;


import me.davydovep.recipesapp_2.model.Ingredient;
import me.davydovep.recipesapp_2.model.Recipe;
import me.davydovep.recipesapp_2.service.IngredientService;
import me.davydovep.recipesapp_2.service.RecipeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping
    public Ingredient add(@RequestBody Ingredient ingredient) {
        return ingredientService.add(ingredient);
    }

    @GetMapping("/{id}")
    public Ingredient get(@PathVariable long id) {
        return ingredientService.get(id);
    }

}
