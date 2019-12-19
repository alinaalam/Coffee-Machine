package machine;

public class Machine {

    private int water = 400;
    private int milk = 540;
    private int coffeeBeans = 120;
    private int disposableCups = 9;
    private int money = 550;

    public void addWater(int water) {
        this.water += water;
    }

    public void addMilk(int milk) {
        this.milk += milk;
    }

    public void addCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans += coffeeBeans;
    }

    public void addDisposableCups(int disposableCups) {
        this.disposableCups += disposableCups;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public int getMoney() {
        return money;
    }

    public int takeMoney() {
        int moneyToTake = money;
        money = 0;
        return moneyToTake;
    }

    public void makeCoffee(Coffee coffee) {
        if (water < coffee.getWater()) {
            System.out.println("Sorry, not enough water!");
            return;
        }
        if (milk < coffee.getMilk()) {
            System.out.println("Sorry, not enough milk!");
            return;
        }
        if (coffeeBeans < coffee.getCoffeeBeans()) {
            System.out.println("Sorry, not enough coffee beans!");
            return;
        }
        if (disposableCups < coffee.getDisposableCup()) {
            System.out.println("Sorry, not enough disposable cups!");
            return;
        }
        System.out.println("I have enough resources, making you a coffee!");
        water -= coffee.getWater();
        milk -= coffee.getMilk();
        coffeeBeans -= coffee.getCoffeeBeans();
        disposableCups -= coffee.getDisposableCup();
        money += coffee.getCost();
    }
}
