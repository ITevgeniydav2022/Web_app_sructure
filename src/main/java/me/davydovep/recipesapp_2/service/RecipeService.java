package me.davydovep.recipesapp_2.service;

import me.davydovep.recipesapp_2.model.Recipe;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RecipeService {

    private final Map<Long, Recipe> recipes = new HashMap<>();

    private long idGenerator = 1;

    public Recipe add(Recipe recipe) {
        recipes.put(idGenerator++, recipe);
        return recipe;
    }

    @Nullable
    public Recipe get(long id) {
        return recipes.get(id);
    }

}
