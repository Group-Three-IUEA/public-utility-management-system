
package electricity;

public class ElectricityService {

    private String customerName;
    private String meterNumber;
    private double unitsConsumed;

    // Constructor
    public ElectricityService(String customerName,
                             String meterNumber,
                             double unitsConsumed) {
        this.customerName = customerName;
        this.meterNumber = meterNumber;
        this.unitsConsumed = unitsConsumed;
    }

    // Calculate electricity bill
    public double calculateBill() {
        double ratePerUnit = 850;
        return unitsConsumed * ratePerUnit;
    }

    // Display electricity details
    public void displayDetails() {
        System.out.println("ELECTRICITY SERVICES");
        System.out.println("Customer: " + customerName);
        System.out.println("Meter Number: " + meterNumber);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill: UGX " + calculateBill());
    }
}

