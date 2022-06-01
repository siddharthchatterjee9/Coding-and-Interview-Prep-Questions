package factory;

import java.util.Scanner;

interface Food {
    public String getType();
}
class Pizza implements Food {
    public String getType() {
        return "Someone has ordered a fast food!";
    }
}
class Cake implements Food {
    public String getType() {
        return "Someone has ordered a dessert!";
    }
}
class FoodFactory {
    public Food getFood(String order) {
        switch (order) {
            case "pizza":
                return new Pizza();
            case "cake":
                return new Cake();
            default:
                return null;
        }
    }
}

public class Solution {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        FoodFactory foodFactory = new FoodFactory();
        Food food = foodFactory.getFood(in.nextLine());
        // foodFactory is a factory (simply an object) that returns another object
        // from some other method call (here: getFood(String order))
        // which is assumed to be "new"
        System.out.println("The factory returned " + food.getClass());
        System.out.println(food.getType());
    }
}
