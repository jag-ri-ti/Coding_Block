package Assignment01;

public class astrik {

    public static void main(String[] args) {
        int n = 4; // Number of rows for the upper half of the pattern

        // Loop for the upper part of the pattern (pyramid-like)
        for (int i = 0; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print the alternating '*' and '!'
            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("!");
                }
            }
            for (int j = 0; j < i; j++) {
                if ((j + i) % 2 == 0) {
                    System.out.print(" *");
                } else {
                    System.out.print(" !.");
                }
            }
            System.out.println();
        }

        // Loop for the lower part of the pattern (inverted pyramid-like)
        for (int i = n - 1; i >= 0; i--) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print the alternating '*' and '!'
            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("!.");
                }
            }
            for (int j = 0; j < i; j++) {
                if ((j + i) % 2 == 0) {
                    System.out.print(" *");
                } else {
                    System.out.print(" !.");
                }
            }
            System.out.println();
        }
    }

}
