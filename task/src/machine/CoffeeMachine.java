package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private final Scanner scanner = new Scanner(System.in);
    private final Machine coffeeMachine = new Machine();

    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.printMenu();
    }

    public void printMenu() {

        boolean exit = false;

        while (!exit) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();

            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    printCoffeeMachineItems();
                    break;
                case "exit":
                    exit = true;
                    break;
            }
        }
    }

    private void printCoffeeMachineItems() {
        System.out.println("The coffee machine has:");
        System.out.println(coffeeMachine.getWater() + " of water");
        System.out.println(coffeeMachine.getMilk() + " of milk");
        System.out.println(coffeeMachine.getCoffeeBeans() + " of coffee beans");
        System.out.println(coffeeMachine.getDisposableCups() + " of disposable cups");
        System.out.println(coffeeMachine.getMoney() + " of money");
    }

    private void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String option = scanner.nextLine();
        Coffee coffee = null;

        switch (option) {
            case "1":
                coffee = Coffee.ESPRESSO;
                break;
            case "2":
                coffee = Coffee.LATTE;
                break;
            case "3":
                coffee = Coffee.CAPPUCCINO;
                break;
            case "back":
                return;
        }

        coffeeMachine.makeCoffee(coffee);
    }

    private void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        coffeeMachine.addWater(scanner.nextInt());

        System.out.println("Write how many ml of milk do you want to add:");
        coffeeMachine.addMilk(scanner.nextInt());

        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffeeMachine.addCoffeeBeans(scanner.nextInt());

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        coffeeMachine.addDisposableCups(scanner.nextInt());
    }

    private void take() {
        System.out.println("I gave you $" + coffeeMachine.takeMoney());
    }
}
