package Assignment02;

import java.util.Scanner;

public class Conversion {

    // Function to convert a number from base 'sb' to decimal (base 10)
    public static int sourceToDecimal(int sn, int sb) {
        int decimalValue = 0;
        int power = 1; // Power of the current position (i.e., sb^0, sb^1, sb^2, ...)

        // Process each digit of the source number
        while (sn > 0) {
            int digit = sn % 10;
            decimalValue += digit * power;
            power *= sb;
            sn /= 10;
        }

        return decimalValue;
    }

    // Function to convert a number from decimal (base 10) to the destination base
    // 'db'
    public static String decimalToDestination(int decimalValue, int db) {
        StringBuilder result = new StringBuilder();

        // Process the decimal number to convert it into the destination base
        while (decimalValue > 0) {
            int remainder = decimalValue % db;
            result.append(remainder);
            decimalValue /= db;
        }

        // The result is constructed in reverse order, so we need to reverse it
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs: source base (sb), destination base (db), and source number (sn)
        int sb = sc.nextInt();
        int db = sc.nextInt();
        int sn = sc.nextInt();

        // Step 1: Convert source number to decimal (base 10)
        int decimalValue = sourceToDecimal(sn, sb);

        // Step 2: Convert the decimal number to the destination base
        String result = decimalToDestination(decimalValue, db);
        System.out.println(result);
        sc.close();
    }
}
