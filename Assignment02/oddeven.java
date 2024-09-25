package Assignment02;

import java.util.*;

public class oddeven {
    public static void main(String args[]) {
        int odd = 0, even = 0, pos = 1;
        ;
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        while (n > 0) {
            int x = n % 10; // picks the last digit
            n = n / 10; // removes the last digit
            // System.out.println(n);
            if (pos % 2 == 1) {
                odd += x;
            } else {
                even += x;
            }
            pos++;
        }
        System.out.println("odd sum=" + odd);
        System.out.println("even sum=" + even);

        obj.close();
    }
}
