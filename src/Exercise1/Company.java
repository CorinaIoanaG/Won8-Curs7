package Exercise1;

public class Company {
    private Advertise advertise;
    private long maxAdvertiseNumber;

    public Company(Advertise advertise, long maxAdvertiseNumber) {
        this.advertise = advertise;
        this.maxAdvertiseNumber = maxAdvertiseNumber;
    }

    public void advertiseCompanyService() {
        for (int i = 1; i < maxAdvertiseNumber; i++) {
            advertise.advertiseService();
        }
    }

    public void printReport() {
        System.out.println(String.format("Advertises on %s - %s: %d", advertise.getAdvertiseType(), advertise.advertiseService(), advertise.advertiseQuantity()));
    }

}
