package Tugas8;
import java.util.Scanner;

class Soal2 {
    int hitung(int a, int b) {
        int hasil = 1;
        for(int i = 0; i < b; i++) {
            hasil *= a;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bilangan: ");
        int a = sc.nextInt();
        System.out.print("Pangkat: ");
        int b = sc.nextInt();

        Soal2 p = new Soal2();
        System.out.println("Hasil = " + p.hitung(a, b));
    }
}
