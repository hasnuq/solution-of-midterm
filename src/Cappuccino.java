public class Cappuccino implements Coffee{

    @Override
    public double getCost() {
        return 4.0;
    }

    @Override
    public String getDescription() {
        return "Cappuccino";
    }
}
