
package tugasprak;

import java.util.Scanner;


public class Tugas5Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak angka: ");
        int n = input.nextInt();

        int total = 0;
        int angka = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(angka + " ");
            total += angka;
            angka += 2; // lompat ke angka ganjil berikutnya
        }

        System.out.println("\nTotal penjumlahan: " + total);
    }
}
