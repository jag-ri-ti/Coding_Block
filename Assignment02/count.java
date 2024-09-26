package Assignment02;

import java.util.*;

public class count {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int s = obj.nextInt();
        int count = 0;

        while (n > 0) {
            int x = n % 10;
            n = n / 10;
            if (x == s) {
                count += 1;
            }
        }
        System.out.println(count);
        obj.close();
    }

}

// import java.util.*;
// public class Main {

// public static int countDigitOccurrences(int number, int digit) {
// int count = 0;
// while (number > 0) {
// // Check if the last digit matches the given digit
// if (number % 10 == digit) {
// count++;
// }
// // Remove the last digit from the number
// number /= 10;
// }
// return count;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// // Input number and digit
// int number = sc.nextInt();
// int digit = sc.nextInt();

// // Output the result
// System.out.println(countDigitOccurrences(number, digit));

// sc.close();
// }

// }
