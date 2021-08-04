public class CoffeeMachine {
    double coffee = 100;
    double water = 50;

    double takeCoffee(double amount) {
        coffee = coffee - amount;
        return amount;
    }
    double takeWater(double amount){
        water = water - amount;
        return amount;
    }

    public  Beverage purchaseBeverage(String name) {
        Recipe recipe = getRecipe(name);
        double coffee = takeCoffee(recipe.getCoffee());
        double water = takeWater(recipe.getWater());

        return new Beverage(coffee, water);
    }
}
