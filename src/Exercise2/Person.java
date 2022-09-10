package Exercise2;

public class Person {
    private BankAccount bankAccount;
    String personName = "Popescu Ioan";


    public Person(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int depositMoney(int sum) {
        return bankAccount.depositMoney(sum);
    }

    public int withdrawMoney(int sum) {
        return bankAccount.withdrawMoney(sum);
    }

    public String bankName() {
        return bankAccount.getBankName();
    }

}
