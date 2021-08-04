public abstract class Recipe {
    String name = "Unknown Beverage";

    public String getName() {
        return name;
    }

    public abstract double  getCoffee();

    public abstract double getWater() ;
}
