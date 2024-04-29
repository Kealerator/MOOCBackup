import java.util.ArrayList;

public class Recipe {
    String name;
    int cookingTime;
    ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }


    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

}
