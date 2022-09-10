package Exercise1;

public class Facebook implements Advertise {
    public static final String NAME = "Facebook";
    private int quantity;

    @Override
    public String getAdvertiseType() {
        return NAME;
    }

    @Override
    public String advertiseService() {
        quantity++;
        return "Cleaning";
    }

    @Override
    public int advertiseQuantity() {
        return quantity;
    }
}

