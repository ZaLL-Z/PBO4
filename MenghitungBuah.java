package tugas3;
  import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenghitungBuah {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan jumlah buah semangka: ");
        int semangka = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah buah semangka busuk: ");
        int busuk = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah tetangga: ");
        int tetangga = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah melon per tetangga: ");
        int melonPerTetangga = Integer.parseInt(br.readLine());

        int totalMelon = tetangga * melonPerTetangga;
        int totalSemangka = semangka - busuk;
        int totalBuah = totalSemangka + totalMelon;

        System.out.println("\n===== HASIL PERHITUNGAN =====");
        System.out.println("Total Melon : " + totalMelon);
        System.out.println("Total Semangka (setelah dikurangi busuk): " + totalSemangka);
        System.out.println("Total Semua Buah : " + totalBuah + " pcs");
    }
}
