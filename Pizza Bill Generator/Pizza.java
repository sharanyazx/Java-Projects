import java.util.*;

class Pizza {
    private int basePrice;
    private boolean veg;
    private boolean extraCheese;
    private boolean extraToppings;
    private final int cheesePrice = 50;
    private final int toppingsPrice = 70;
    private int totalPrice;

    // Constructor
    public Pizza(boolean veg) {
        this.veg = veg;
        this.basePrice = veg ? 200 : 400;  // ternary operator for veg or non veg
        this.totalPrice = basePrice;
        // initially false
        this.extraCheese = false;
        this.extraToppings = false;
    }

    // Add extra cheese
    public void addExtraCheese() {
        this.extraCheese = true;
        this.totalPrice += cheesePrice;
    }

    // Add extra toppings
    public void addExtraToppings() {
        this.extraToppings = true;
        this.totalPrice += toppingsPrice;
    }

    // Generate bill
    public void generateBill() {
        System.out.println("\n------ PIZZA BILL ------");
        System.out.println(" Base Pizza (" + (veg ? "Veg" : "Non-Veg") + "): $" + basePrice);
        if (extraCheese) {
            System.out.println("Extra Cheese: ₹" + cheesePrice);
        }
        if (extraToppings) {
            System.out.println("Extra Toppings: ₹" + toppingsPrice);
        }
        System.out.println("------------------------");
        System.out.println("Total Bill: $" + totalPrice);
        System.out.println("------------------------");
    }
}

