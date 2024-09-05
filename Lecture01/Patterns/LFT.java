package Lecture01.Patterns;

import java.util.*;

public class LFT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        // ---LEFT FACING TRIANGLE---

        for (int i = 0; i < num; i++) {

            for (int k = 0; k <= num - i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        scan.close();
    }
}
