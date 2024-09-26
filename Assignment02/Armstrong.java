package Assignment02;

import java.util.Scanner;

public class Armstrong {

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        // Convert the number to a string to get the number of digits
        String numStr = Integer.toString(num);
        int numDigits = numStr.length();
        int sum = 0;
        int original = num;

        // Calculate the sum of each digit raised to the power of the number of digits
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        // If the sum equals the original number, it's an Armstrong number
        return sum == original;
    }

    // Function to print all Armstrong numbers between N1 and N2
    public static void printArmstrongNumbers(int N1, int N2) {
        for (int i = N1; i <= N2; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        // Create a scanner to take input
        Scanner sc = new Scanner(System.in);

        // Take inputs N1 and N2
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        // Print all Armstrong numbers between N1 and N2
        printArmstrongNumbers(N1, N2);

        // Close the scanner
        sc.close();
    }
}
