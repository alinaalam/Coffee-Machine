package machine;

public enum Coffee {
    ESPRESSO(250, 0, 16, 1, 4),
    LATTE(350, 75, 20, 1, 7),
    CAPPUCCINO(200, 100, 12, 1, 6);

    private int water;
    private int milk;
    private int coffeeBeans;
    private int disposableCup;
    private int cost;

    Coffee(int water, int milk, int coffeeBeans, int disposableCup, int cost) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.disposableCup = disposableCup;
        this.cost = cost;
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

    public int getDisposableCup() {
        return disposableCup;
    }

    public int getCost() {
        return cost;
    }
}
