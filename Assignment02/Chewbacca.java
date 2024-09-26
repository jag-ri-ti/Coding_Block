package Assignment02;

import java.util.Scanner;

public class Chewbacca {

    public static void main(String[] args) {
        // Create a scanner to take input
        Scanner sc = new Scanner(System.in);
        // Read the input number as a string
        String x = sc.next();

        // Convert the input number into a character array for easier manipulation
        char[] digits = x.toCharArray();

        // Iterate through each digit
        for (int i = 0; i < digits.length; i++) {
            // Convert the character digit to its integer form
            int digit = digits[i] - '0';

            // Calculate the inverted digit
            int inverted = 9 - digit;

            // If the inverted digit is smaller, we take the inverted one
            // However, the first digit should not be '0' (so don't invert 9 at the start)
            if (inverted < digit) {
                // Avoid leading zeroes, so don't invert the first digit if it becomes zero
                if (i == 0 && inverted == 0) {
                    continue;
                }
                // Replace the current digit with the inverted one
                digits[i] = (char) (inverted + '0');
            }
        }

        // Print the resulting number
        System.out.println(new String(digits));

        // Close the scanner
        sc.close();
    }
}
