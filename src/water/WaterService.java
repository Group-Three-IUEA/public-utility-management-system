package water;

public class WaterService {

    private String customerName;
    private String meterNumber;
    private double unitsConsumed;

    // Constructor
    public WaterService(String customerName,
                        String meterNumber,
                        double unitsConsumed) {
        this.customerName = customerName;
        this.meterNumber = meterNumber;
        this.unitsConsumed = unitsConsumed;
    }

    // Calculate water bill
    public double calculateBill() {
        double ratePerUnit = 3500;
        return unitsConsumed * ratePerUnit;
    }

    // Display water details
    public void displayDetails() {
        System.out.println("WATER SERVICES");
        System.out.println("Customer: " + customerName);
        System.out.println("Meter Number: " + meterNumber);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill: UGX " + calculateBill());
    }
}