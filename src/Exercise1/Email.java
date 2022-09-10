package Exercise1;

public class Email implements Advertise {
    public static final String NAME = "Email";
    private int quantity;

    @Override
    public String getAdvertiseType() {
        return NAME;
    }

    @Override
    public String advertiseService() {
        quantity++;
        return "Washing";
    }

    @Override
    public int advertiseQuantity() {
        return quantity;
    }
}
