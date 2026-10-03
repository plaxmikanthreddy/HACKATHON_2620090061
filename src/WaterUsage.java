import java.util.Scanner;

public class WaterUsage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of family members: ");
        int familyMembers = scanner.nextInt();

        System.out.print("Enter water consumed in litres: ");
        double waterConsumed = scanner.nextDouble();

        System.out.print("Enter house number: ");
        int houseNumber = scanner.nextInt();

        System.out.print("Enter water usage status (A/I): ");
        char usageStatus = scanner.next().charAt(0);

        System.out.println("\nHousehold Details");
        System.out.println("Family Members: " + familyMembers);
        System.out.println("Water Consumed: " + waterConsumed + " litres");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Water Usage Status: " + usageStatus);

        scanner.close();
    }
}
