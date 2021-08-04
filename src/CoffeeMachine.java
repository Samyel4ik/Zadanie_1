import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    double coffee = 100;
    double water = 50;
    List<Recipe> recipeList;
    List<CondimentDecorator> condimentDecoratorList;


    double takeCoffee(double amount) {
        coffee = coffee - amount;
        return amount;
    }

    double takeWater(double amount) {
        water = water - amount;
        return amount;
    }

    public Recipe findRecipe(String name) {
        for (int i = 0; i < recipeList.size(); i++) {
            if (name.equalsIgnoreCase(recipeList.get(i).getName())) {
                return recipeList.get(i);
            }
        }
        return null;

    }

    public List<String> componentList() {
        List<String> componentList = new ArrayList<>();
        for (int i = 0; i < condimentDecoratorList.size(); i++) {
            componentList.add(condimentDecoratorList.get(i).getName());
        }
        return componentList;
    }

    public List<String> listDrink() {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < recipeList.size(); i++) {
            stringList.add(recipeList.get(i).getName());
        }
        return stringList;
    }

    public CondimentDecorator purchaseComponent(String name) {

        wfor( int i = 0;
        i<condimentDecoratorList.size (); i++){
            if (name.equalsIgnoreCase(condimentDecoratorList.get(i).getName())) ;
            return condimentDecoratorList.get(i);
        }
        return null;
    }

    public Beverage purchaseBeverage(String name) {
        Recipe recipe = findRecipe(name);
        double coffee = takeCoffee(recipe.getCoffee());
        double water = takeWater(recipe.getWater());

        return new Beverage(coffee, water);
    }

    public void setRecipeList(List<Recipe> recipeList) {
        this.recipeList = recipeList;
    }

    public void setCoffee(double coffee) {
        this.coffee = coffee;
    }

    public void setWater(double water) {
        this.water = water;
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "coffee=" + coffee +
                ", water=" + water +
                '}';
    }
}
