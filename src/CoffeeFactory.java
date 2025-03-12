public class CoffeeFactory {
    public static Coffee createCoffee(String type) {
        if (type.equalsIgnoreCase("Espresso")) {
            return new Espresso();
        } else if (type.equalsIgnoreCase("Latte")) {
            return new Latte();
        } else if (type.equalsIgnoreCase("Cappuccino")) {
            return new Cappuccino();
        } else {
            throw new IllegalArgumentException("Unknown type of coffee");
        }
    }
}
