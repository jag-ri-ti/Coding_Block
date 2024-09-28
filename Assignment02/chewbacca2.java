package Assignment02;

import java.util.*;

public class chewbacca2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String x = sc.next();

        char[] digits = x.toCharArray();
        for (int i = 0; i < digits.length; i++) {

            int digit = digits[i] - '0';
            int inverted = 9 - digit;
            if (inverted < digit) {
                if (i == 0 && inverted == 0) {
                    continue;
                }
                digits[i] = (char) (inverted + '0');
            }
        }
        System.out.println(new String(digits));
        sc.close();
    }

}
