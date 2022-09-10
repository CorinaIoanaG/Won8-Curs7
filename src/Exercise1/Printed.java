package Exercise1;

public class Printed implements Advertise {
    public static final String NAME = "Printed";
    private int quantity;

    @Override
    public String getAdvertiseType() {
        return NAME;
    }

    @Override
    public String advertiseService() {
        quantity++;
        return "Cleaning and Washing";
    }

    @Override
    public int advertiseQuantity() {
        return quantity;
    }
}
