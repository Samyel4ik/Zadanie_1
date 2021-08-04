public abstract class CondimentDecorator {
    String name = "Unknown Beverage";

    public String getName() {
        return name;
    }
    public abstract double Milk();
    public abstract double Soy();
}
