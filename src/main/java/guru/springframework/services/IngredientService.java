package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;
import guru.springframework.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long Id);
    IngredientCommand saveIngredientCommand(IngredientCommand ingredientCommand);
}
