import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.setRecipeList(recipeList());
        System.out.println("выберите напиток из предложенных " + coffeeMachine.listDrink());
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Beverage beverage = coffeeMachine.purchaseBeverage(name);
        System.out.println("Выберите напиток из предложенных " + coffeeMachine.componentList());

    }

    public static Beverage endDrink(Beverage beverage, List<CondimentDecorator> list) {
        Beverage beverage1;
        for (int i = 0; i < list.size(); i++) {
            CondimentDecorator condimentDecorator = list.get(i);

        }
        return beverage1;
    }


    public static List<CondimentDecorator> selectComponent(CoffeeMachine coffeeMachine) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("выберите сладость из предложенных или введите (выход) для завершения выбора:");
        System.out.println(coffeeMachine.componentList());

        List<CondimentDecorator> componentForDrink = new ArrayList<>();
        String userInput = "";

        while (!userInput.equalsIgnoreCase("выход")) {
            userInput = scanner.nextLine();

            if (!userInput.equalsIgnoreCase("выход")) {
                CondimentDecorator condimentDecorator = coffeeMachine.purchaseComponent(userInput);
                componentForDrink.add(condimentDecorator);
            }
        }

        return componentForDrink;
    }

    public static List<Recipe> recipeList() {
        List<Recipe> recipeList = new ArrayList<>();
        recipeList.add(new Espresso());
        recipeList.add(new Latte());
        return recipeList;
    }

    public static List<CondimentDecorator> componentList() {
        List<CondimentDecorator> componentList = new ArrayList<>();
        componentList.add(new Soy());
        componentList.add(new Milk());
        return componentList;
    }
}
