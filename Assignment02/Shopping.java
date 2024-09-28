package Assignment02;

import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int M = sc.nextInt();
            int N = sc.nextInt();

            int turn = 1;
            while (true) {
                if (turn % 2 != 0) {
                    if (M >= turn) {
                        M -= turn;
                    } else {
                        System.out.println("Harshit");
                        break;
                    }
                } else {

                    if (N >= turn) {
                        N -= turn;
                    } else {
                        System.out.println("Aayush");
                        break;
                    }
                }
                turn++;
            }
        }
        sc.close();
    }
}
