package Assignment02;

import java.util.Scanner;

public class Boston_No {

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Function to perform prime factorization and calculate the sum of digits of
    // the prime factors
    public static int sumOfPrimeFactorsDigits(int num) {
        int sum = 0;
        int n = num;

        while (n % 2 == 0) {
            sum += sumOfDigits(2);
            n /= 2;
        }

        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                sum += sumOfDigits(i);
                n /= i;
            }
        }

        // If n is still greater than 2, it must be prime
        if (n > 2) {
            sum += sumOfDigits(n);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sumDigitsOfN = sumOfDigits(N);
        int sumPrimeFactorsDigits = sumOfPrimeFactorsDigits(N);
        if (sumDigitsOfN == sumPrimeFactorsDigits) {
            System.out.println(1); // Boston number
        } else {
            System.out.println(0); // Not a Boston number
        }

        sc.close();
    }
}
