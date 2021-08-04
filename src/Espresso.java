public class Espresso extends Recipe {

    public Espresso() {
        name = "Espresso";
    }

    public double  getCoffee(){
        return 1.5;
    }

    public double getWater() {
        return 0.45;
    }

    @Override
    public String toString() {
        return "Espresso{" +
                "name='" + name + '\'' +
                '}';
    }
}
