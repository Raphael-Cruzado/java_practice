package GrocerySorter;

import java.util.Scanner;

public class GrocerySorter {
    public enum GroceryItem {GR_APPLES, GR_BANANAS, GR_JUICE, GR_WATER}

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a grocery item: ");
        String userInput = input.next();

        GroceryItem userItem;
        try {
            userItem = GroceryItem.valueOf("GR_" + userInput.toUpperCase());
            System.out.println("Category: " + getCategory(userItem));
        } catch (IllegalArgumentException e) {
            System.out.println("Unknown item");
        }

        input.close();
    }

    public static String getCategory(GrocerySorter.GroceryItem item) {
        switch (item) {
            case GR_APPLES:
            case GR_BANANAS:
                return "Fruit";
            case GR_JUICE:
            case GR_WATER:
                return "Drink";
            default:
                return "Unknown";
        }
    }
}
