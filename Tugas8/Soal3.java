package Tugas8;
import java.util.Scanner;

class Soal3 {
    String konversi(int n) {
        return Integer.toBinaryString(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan desimal: ");
        int n = sc.nextInt();

        Soal3 b = new Soal3();
        System.out.println("Biner = " + b.konversi(n));
    }
}

