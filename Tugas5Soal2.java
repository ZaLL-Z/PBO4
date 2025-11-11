
package tugasprak;

import java.util.Scanner;


public class Tugas5Soal2 {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int n = input.nextInt();
        int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Bilangan ke-" + i + ": ");
            int angka = input.nextInt();
            total += angka;
        }

        double rata = (double) total / n;
        System.out.println("Total jumlah bilangan: " + total);
        System.out.println("Rata-Rata" + rata);
    }
}
