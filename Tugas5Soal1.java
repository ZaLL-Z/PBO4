
package tugasprak;

import java.util.Scanner;


public class Tugas5Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max, min, bilangan;

        System.out.print("Masukkan bilangan ke-1: ");
        bilangan = input.nextInt();
        max = min = bilangan;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            bilangan = input.nextInt();
            if (bilangan > max) max = bilangan;
            if (bilangan < min) min = bilangan;
        }

        System.out.println("Bilangan terbesar: " + max);
        System.out.println("Bilangan Terkecil: " + min);

    }
}
