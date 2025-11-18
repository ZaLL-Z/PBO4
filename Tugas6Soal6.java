package Tugas6;
import java.util.Scanner;

public class Tugas6Soal6 {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Masukkan jumlah data: ");
            int n = in.nextInt();

            int[] data = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Data ke-" + (i + 1) + ": ");
                data[i] = in.nextInt();
            }

            int sum = 0;
            for (int x : data) sum += x;

            System.out.println("Rata-rata = " + (sum / n));
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input! " + e.getMessage());
        }
    }
}
