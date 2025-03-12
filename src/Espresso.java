public class Espresso implements Coffee{

    @Override
    public int getCost() {
        return 3;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
