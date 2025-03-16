public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    public double getCost() {
        return super.getCost() + 0.3;
    }
    public String getDescription() {
        return super.getDescription() + " with milk";
    }
}
