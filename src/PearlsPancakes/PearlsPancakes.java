package PearlsPancakes;

import java.util.Scanner;

public class PearlsPancakes {
    public static Scanner input =  new Scanner(System.in);

    public static void main(String[] args) {
        getDinerOrder();
        getNumberOfDinersAtTable();

        /* while (dinerWantsAnotherItem()) {
            getMenuChoice();
            double orderTotal = 0;
            if (userChoice >= 1 && userChoice <=7) {
                System.out.printf("$%.2f%n", getPriceOfMenuChoice(userChoice));
                orderTotal = orderTotal + getPriceOfMenuChoice(userChoice);
                displaySuggestedTipAmounts(getPriceOfMenuChoice(userChoice));
            } else {
                System.out.println("Invalid menu Item"); // fix this when you have time
            }
        } */



    }
    public static void displayMenu() {
        System.out.println("1) eggs          $3.25");
        System.out.println("2) bacon         $4.00");
        System.out.println("3) pancakes      $2.50");
        System.out.println("4) orange juice  $1.25");
        System.out.println("5) oatmeal       $3.99");
        System.out.println("6) milk          $1.25");
        System.out.println("7) donut         $2.00");
    }

    public static int getMenuChoice() {
        System.out.print("Enter a menu choice : ");
        int userChoice = input.nextInt();

        if (userChoice >= 1 && userChoice <=7) {
            System.out.println("Enter a menu choice : " + userChoice);
        } else {
            System.out.println("Invalid menu Item");
        }

        return userChoice;
    }

    public static double getPriceOfMenuChoice(int menuItem) {
        switch (menuItem) {
            case 1 : return 3.25;
            case 2 : return 4.00;
            case 3 : return 2.50;
            case 4 : return 1.25;
            case 5 : return 3.99;
            case 6 : return 1.25;
            case 7 : return 2.00;
            default: return 0.00;
        }
    }

    public static boolean dinerWantsAnotherItem() {
        System.out.print("Another item ('yes' or 'no')? ");
        String userChoice = input.next();
        if (userChoice.equals("yes")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
            return false;
        }

        return  userChoice.equals("yes");
    }

    public static int getNumberOfDinersAtTable() {
        System.out.println("Enter number of diners at this table : ");
        int numOfDiners = input.nextInt();
        System.out.println("Enter number of diners at this table : " + numOfDiners);

        return  numOfDiners;
    }

    public static void displaySuggestedTipAmounts(double amount) {
        double tenPercent =  amount * 0.10;
        double fifteenPercent =  amount * 0.15;
        double twentyPercent =  amount * 0.20;
        double twentyFivePercent =  amount * 0.25;

        System.out.printf("10%% tip: %.2f%n", tenPercent);
        System.out.printf("15%% tip: %.2f%n", fifteenPercent);
        System.out.printf("20%% tip: %.2f%n", twentyPercent);
        System.out.printf("25%% tip: %.2f%n", twentyFivePercent);
    }

    public static double getDinerOrder() { // orderTotal isn't getting the 2nd input
        int userChoice = getMenuChoice();
        System.out.printf("$%.2f%n", getPriceOfMenuChoice(userChoice));
        double orderTotal = getPriceOfMenuChoice(userChoice);

        while (dinerWantsAnotherItem()) {
            getMenuChoice();
            System.out.printf("$%.2f%n", getPriceOfMenuChoice(userChoice));
            orderTotal = orderTotal + getPriceOfMenuChoice(userChoice);
            displaySuggestedTipAmounts(getPriceOfMenuChoice(userChoice));

            System.out.printf("Order Total: $%.2f%n", orderTotal);
        }

        return orderTotal;
    }
}
