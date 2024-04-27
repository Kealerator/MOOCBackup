
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here

    public void addMeal(String mealString){
        if (!meals.contains(mealString)) {
            meals.add(mealString);
        }
    }

    public void printMeals(){
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu(){
        meals.clear();
    }
}
