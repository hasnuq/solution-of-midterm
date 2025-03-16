public class MainDemo {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("espresso");
        Coffee coffee1 = CoffeeFactory.createCoffee("latte");
        Coffee coffee2 = CoffeeFactory.createCoffee("cappuccino");
        coffee = new MilkDecorator(coffee);
        coffee1 = new ChocolateDecorator(coffee1);
        double totalCost = coffee.getCost() + coffee1.getCost();

        System.out.println("Order: " + coffee.getDescription()+ ", " + coffee1.getDescription() + ", " + coffee2.getDescription());
        System.out.println("Total Cost: $" + totalCost);
    }
}
