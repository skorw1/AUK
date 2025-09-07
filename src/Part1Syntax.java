// Part 1: Syntax

import java.util.Scanner;
public class Part1Syntax {
    public static void main(String[] args) {

        // Part 1.1
        int digit = 10;
        double decimal = 3.14;
        char letter = 'G';
        boolean bool = true;
        String str = "Simple string";

        // Part 1.2

        int addition = digit + (int) decimal;
        int subtraction = digit - (int) decimal;
        int multiplication = digit * digit;
        int division = digit / digit;
        int modulus = digit % digit;
        digit += 1; // increment
        digit -=1; // decrement
        double typeCasting = (double) digit + (int) decimal;

        // Part 1.3

        System.out.println(str + " + Hard string" + " = Middle string");
        System.out.println(str.contains("Simple"));

        // Part 1.4
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(number);

        // Part 1.5

        // Simple comment
        /* Multiple
           String comment
         */

    }
}
