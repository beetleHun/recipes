package com.beetle.recipe.controller;

import com.beetle.recipe.model.entity.Recipe;
import com.beetle.recipe.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/recipes")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping({"", "/", "/index"})
    public String getRecipes(Model model) {
        List<Recipe> recipes = recipeService.listRecipes();
        model.addAttribute("recipes", recipes);

        return "recipes/index";
    }

}
