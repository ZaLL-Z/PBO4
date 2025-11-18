package Tugas6;

import java.util.Scanner;

public class Tugas6Soal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] data = new int[5];

        System.out.println("Masukkan 5 data integer:");
        for (int i = 0; i < data.length; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            data[i] = in.nextInt();
        }

        // a. Tampilkan semua elemen
        System.out.print("\nData yang diinput: ");
        for (int x : data) System.out.print(x + " ");

        // b. Nilai terbesar & terkecil
        int max = data[0], min = data[0];
        for (int x : data) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println("\nNilai terbesar = " + max);
        System.out.println("Nilai terkecil = " + min);

        // c. Posisi indeks ke-3
        System.out.println("Nilai indeks ke-3 = " + data[2]);

        // d. Rata-rata
        double sum = 0;
        for (int x : data) sum += x;
        System.out.println("Rata-rata = " + (sum / data.length));

        // e. Jumlah bilangan ganjil
        int jmlGanjil = 0, jmlGenap = 0;
        for (int x : data) {
            if (x % 2 != 0) jmlGanjil += x;
            else jmlGenap += x;
        }
        System.out.println("Jumlah bilangan ganjil = " + jmlGanjil);
        System.out.println("Jumlah bilangan genap = " + jmlGenap);

        // f. Check bilangan ganjil & genap
        System.out.println("\nCek bilangan: ");
        for (int x : data) {
            System.out.println(x + " = " + ((x % 2 == 0) ? "Genap" : "Ganjil"));
        }
    }
}