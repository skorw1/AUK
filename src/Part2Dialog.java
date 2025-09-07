// Part 2
import java.util.Scanner;

public class Part2Dialog {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Whats your full name? (String): ");
        String fullName = scanner.nextLine();

        System.out.print("2. How old are you? (Integer):");
        int age = scanner.nextInt();

        System.out.print("3. Whats your height in meters? (Double): ");
        double height = scanner.nextDouble();

        System.out.print("4. Whats your weight in kilograms? (Double): ");
        double weight = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("5. Whats your email address? (String):");
        String email = scanner.nextLine();

        System.out.print("6. Could you share your phone number? (Long)");
        long phone = scanner.nextLong();

        scanner.nextLine();

        System.out.print("7. Which city do you live in? (String):");
        String city = scanner.nextLine();

        System.out.print("8. Do you have a pet? (true/false): ");
        boolean hasPet = scanner.nextBoolean();

        System.out.print("9. Whats your favorite number? (Integer):");
        int favoriteNumber = scanner.nextInt();

        System.out.print("10. What's your monthly income in UAH? (float): ");
        float income = scanner.nextFloat();

        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + height + " meters");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phone);
        System.out.println("City: " + city);
        System.out.println("Has a Pet: " + hasPet);
        System.out.println("Favorite Number: " + favoriteNumber);
        System.out.println("Monthly Income: $" + income);

    }
}
