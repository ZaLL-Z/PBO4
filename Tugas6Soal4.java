package Tugas6;
import java.util.Scanner;

public class Tugas6Soal4 {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = in.nextInt();
        in.nextLine();

        String[] nama = new String[n];
        int[] nilai = new int[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nama: ");
            nama[i] = in.nextLine();

            System.out.print("Nilai: ");
            nilai[i] = in.nextInt();
            in.nextLine();

            status[i] = (nilai[i] > 50) ? "Lulus" : "Tidak Lulus";
            System.out.println();
        }

        System.out.println("Daftar Nilai Mahasiswa");
        System.out.println("----------------------");
        System.out.println("No\tNama\t\tNilai\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + nama[i] + "\t\t" +
                    nilai[i] + "\t" + status[i]);
        }
    }
}
