package Assignment02;

import java.util.*;

public class BinaryToDecimal {

    public static int btod(int n) {
        int s = 0;
        int b;
        int i = 0;

        while (n > 0) {
            int p = n % 10;
            b = (int) Math.pow(2, i); // Math.pow returns a double, so we cast it to int
            i++;
            s = s + p * b;
            n = n / 10;
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = btod(n);
        System.out.println(w);
        sc.close();
    }

}
