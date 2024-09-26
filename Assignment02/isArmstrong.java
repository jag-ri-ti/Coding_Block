package Assignment02;

import java.util.Scanner;

public class isArmstrong {

    public static boolean IsArmstrong(int num) {

        String numStr = Integer.toString(num);
        int numDigits = numStr.length();
        int sum = 0;
        int original = num;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(IsArmstrong(num));
        sc.close();
    }
}
