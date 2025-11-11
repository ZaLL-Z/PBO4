
package tugasprak;

import java.util.Scanner;


public class Tugas5Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int n = input.nextInt();

        // Half Triangle
        System.out.println("\nHalf Triangle");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Full Triangle
        System.out.println("\nFull Triangle");
        for(int i = 1; i <= n; i++){
            for(int j = i; j < n; j++){
                System.out.println("");
            }
            for (int k = 1; k <= (2 * i - 1); k++){
                System.out.println("*");
            }
            System.out.println();
        }

    }
}
