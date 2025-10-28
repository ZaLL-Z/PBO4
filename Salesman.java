package tugas4;
import java.util.Scanner;

public class Salesman {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double penjualan, bonus = 0, komisi = 0, pendapatan;

        System.out.print("Masukkan total penjualan hari ini: Rp");
        penjualan = input.nextDouble();

        if (penjualan <= 2000000) {
            bonus = 100000;
            komisi = 0.10 * penjualan;
        } else if (penjualan <= 5000000) {
            bonus = 200000;
            komisi = 0.15 * penjualan;
        } else {
            bonus = 300000;
            komisi = 0.20 * penjualan;
        }

        pendapatan = bonus + komisi;
        System.out.println("Total Pendapatan Hari Ini: Rp" + pendapatan);
    }
}
