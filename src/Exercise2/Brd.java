package Exercise2;

public class Brd implements BankAccount{
    public static final String NAME = "BRD";
    private int soldAccount = 0;

    public String getBankName() {
        return NAME;
    }

    @Override
    public int depositMoney(int sum) {
        if (sum > 0) {
            soldAccount += sum;
        }
        return soldAccount;
    }

    @Override
    public int withdrawMoney(int sum) {
        if (sum <= soldAccount && sum > 0) {
            soldAccount -= sum;
        }
        return soldAccount;
    }
}
