package Assignment02;

import java.util.Scanner;

public class Inverse {

    public static int reverseNumber(int number) {
        int reverse = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reversedNumber = reverseNumber(number);
        System.out.println(reversedNumber);

        sc.close();
    }

}
