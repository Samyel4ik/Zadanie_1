public abstract class Recipe {
    String recipe = "Unknown Beverage";

    public String getRecipe(String name) {
        return recipe;
    }

    public abstract double  getCoffee();

    public abstract double getWater() ;
}
