import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Select Pizza Type
        System.out.println("Welcome to Pizza Ordering System");
        System.out.println("Select Pizza Type: ");
        System.out.println("1. Veg Pizza (₹200)");
        System.out.println("2. Non-Veg Pizza (₹400)");
        int choice = s.nextInt();
        boolean isVeg = (choice == 1);

        // Create Pizza object veg --> true else false
        Pizza pizza = new Pizza(isVeg);

        // Add extra cheese
        System.out.println("Do you want extra cheese? ( yes=1 / no=0 )");
        int cheeseChoice = s.nextInt();
        if (cheeseChoice == 1) {
            pizza.addExtraCheese();
        }

        // Add extra toppings
        System.out.println("Do you want extra toppings? (yes=1 / no=0)");
        int toppingsChoice = s.nextInt();
        if (toppingsChoice == 1) {
            pizza.addExtraToppings();
        }

        // Generate and display bill
        pizza.generateBill();

    }
    }
