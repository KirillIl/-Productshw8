import java.util.HashSet;
import java.util.Set;

public class RecipeService {

    private final Set<Recipe> recipes = new HashSet<>();

    public void addRecipe(Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже есть в списке!");
        } else {
            recipes.add(recipe);
        }
    }
}