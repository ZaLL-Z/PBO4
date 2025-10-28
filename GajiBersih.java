package tugas4;
import java.util.Scanner;

public class GajiBersih {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, nik, status;
        int golongan, jumlahAnak;
        double gajiPokok = 0, tunjanganPasangan = 0, tunjanganAnak = 0, gajiBersih;

        System.out.print("Masukkan NIK: ");
        nik = input.nextLine();
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan Kode Golongan (1-4): ");
        golongan = input.nextInt();
        System.out.print("Masukkan Status (Menikah/Belum menikah/Cerai): ");
        status = input.next();
        System.out.print("Masukkan Jumlah Anak: ");
        jumlahAnak = input.nextInt();

        switch (golongan) {
            case 1: gajiPokok = 1200000; break;
            case 2: gajiPokok = 1500000; break;
            case 3: gajiPokok = 1750000; break;
            case 4: gajiPokok = 2000000; break;
            default: System.out.println("Golongan tidak valid!"); return;
        }

        if (status.equalsIgnoreCase("Menikah") || status.equalsIgnoreCase("Menikah_dan_punya_anak")) {
            tunjanganPasangan = 0.10 * gajiPokok;
        }

        tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;
        gajiBersih = gajiPokok + tunjanganPasangan + tunjanganAnak;

        System.out.println("\n=== Slip Gaji Karyawan ===");
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("Golongan: " + golongan);
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
        System.out.println("Tunjangan Pasangan: Rp" + tunjanganPasangan);
        System.out.println("Tunjangan Anak: Rp" + tunjanganAnak);
        System.out.println("-------------------------------");
        System.out.println("Gaji Bersih: Rp" + gajiBersih);
    }
}
