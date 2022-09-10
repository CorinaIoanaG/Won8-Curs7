package Exercise1;

public class Main {
    public static void main(String[] args) {
        Company firstAdvertise = new Company(new Email(), 10);
        firstAdvertise.advertiseCompanyService();
        firstAdvertise.printReport();

        Company secondAdvertise = new Company(new Printed(), 20);
        secondAdvertise.advertiseCompanyService();
        secondAdvertise.printReport();

        Company thirdAdvertise = new Company(new Facebook(),15);
        thirdAdvertise.advertiseCompanyService();
        thirdAdvertise.printReport();
    }
}
