package waste;

public class WasteCollectionService {

    private String customerName;
    private String collectionAddress;
    private double collectionFee;

    public WasteCollectionService(String customerName,
                                  String collectionAddress,
                                  double collectionFee) {
        this.customerName = customerName;
        this.collectionAddress = collectionAddress;
        this.collectionFee = collectionFee;
    }

    public double calculateCollectionFee() {
        return collectionFee;
    }

    public void displayDetails() {
        System.out.println("WASTE COLLECTION SERVICES");
        System.out.println("Customer: " + customerName);
        System.out.println("Collection Address: " + collectionAddress);
        System.out.println("Collection Fee: UGX " + calculateCollectionFee());
    }
}