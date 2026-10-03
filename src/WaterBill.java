import java.util.Scanner;

public class WaterBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter water consumption in litres: ");
        double waterConsumption = scanner.nextDouble();

        int bill;

        if (waterConsumption <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }

        System.out.println("Water Bill: Rs." + bill);

        scanner.close();
    }
}
