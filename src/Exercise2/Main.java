package Exercise2;

public class Main {
    public static void main(String[] args) {
        Person bank1 = new Person(new Brd());
        System.out.println(bank1.bankName() + " account of " + bank1.personName);
        System.out.println("Sold is now: " + bank1.depositMoney(3000));
        System.out.println("Sold is now: " + bank1.withdrawMoney(1000));
    }
}
