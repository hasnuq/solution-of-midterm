public class Latte implements Coffee{
    @Override
    public int getCost() {
        return 2;
    }

    @Override
    public String getDescription() {
        return "Latte";
    }
}
