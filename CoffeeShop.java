import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the coffee shop\nWhat do you want?");
        System.out.println("1. Espresso       $10");
        System.out.println("2. Cappuccino     $12");
        System.out.println("3. Americano       $8");
        System.out.println("4. Cafe Latte     $11");
        System.out.println("5. Turkish Coffee $15");

        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();

        System.out.println("How much money do you have?");
        int dollar = scanner.nextInt();
        int dollarleft = 0;

        switch (choice) {
            case 1:
                dollarleft = dollar - 10;
                break;
            case 2:
                dollarleft = dollar - 12;
                break;
            case 3:
                dollarleft = dollar - 8;
                break;
            case 4:
                dollarleft = dollar - 11;
                break;
            case 5:
                dollarleft = dollar - 15;
                break;
            default:
                System.out.println("Please enter a valid option.");
                return;
        }

        if (dollarleft >= 0) {
            System.out.println("You bought your coffee. You have $" + dollarleft + " left.");
        } else {
            System.out.println("You don't have enough money to buy coffee.");
        }
    }
}
