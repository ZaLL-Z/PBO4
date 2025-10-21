package tugas3;
  import java.util.Scanner;

public class SelisihWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jam pertama (0-23): ");
        int jam1 = input.nextInt();
        System.out.print("Masukkan menit pertama (0-59): ");
        int menit1 = input.nextInt();
        System.out.print("Masukkan detik pertama (0-59): ");
        int detik1 = input.nextInt();

        System.out.print("\nMasukkan jam kedua (0-23): ");
        int jam2 = input.nextInt();
        System.out.print("Masukkan menit kedua (0-59): ");
        int menit2 = input.nextInt();
        System.out.print("Masukkan detik kedua (0-59): ");
        int detik2 = input.nextInt();

        int totalDetik1 = jam1 * 3600 + menit1 * 60 + detik1;
        int totalDetik2 = jam2 * 3600 + menit2 * 60 + detik2;

        int selisih = Math.abs(totalDetik2 - totalDetik1);

        int jam = selisih / 3600;
        int sisa = selisih % 3600;
        int menit = sisa / 60;
        int detik = sisa % 60;

        System.out.println("\nSelisih waktu: " + jam + " jam " + menit + " menit " + detik + " detik");
    }
}

