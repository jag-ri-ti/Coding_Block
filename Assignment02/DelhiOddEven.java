package Assignment02;

import java.util.Scanner;

public class DelhiOddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Number of cars to check

        for (int i = 0; i < N; i++) {
            int carNumber = sc.nextInt();
            checkCarNumber(carNumber);
        }
        sc.close();
    }

    public static void checkCarNumber(int carNumber) {
        int sumEven = 0; // Sum of even digits
        int sumOdd = 0; // Sum of odd digits

        while (carNumber > 0) {
            int digit = carNumber % 10;
            if (digit % 2 == 0) {
                sumEven += digit; // Even digit
            } else {
                sumOdd += digit; // Odd digit
            }
            carNumber /= 10;
        }

        // Check the conditions
        if (sumEven % 4 == 0 || sumOdd % 3 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}