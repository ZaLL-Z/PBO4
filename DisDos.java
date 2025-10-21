package tugas3;
  import java.io.DataInputStream;
  import java.io.DataOutputStream;
  import java.io.IOException;

public class DisDos {
    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(System.in);
        DataOutputStream output = new DataOutputStream(System.out);

        // Input data
        output.writeBytes("Masukkan Nama: ");
        String nama = input.readLine();

        output.writeBytes("Total Belanja: ");
        double totalBelanja = Double.parseDouble(input.readLine());

        output.writeBytes("Diskon (%): ");
        double diskon = Double.parseDouble(input.readLine());

        double potongan = totalBelanja * (diskon / 100);
        double totalBayar = totalBelanja - potongan;

        output.writeBytes("Uang Bayar: ");
        double bayar = Double.parseDouble(input.readLine());

        double kembalian = bayar - totalBayar;

        output.writeBytes("\n===== STRUK PEMBELANJAAN =====\n");
        output.writeBytes("Nama         : " + nama + "\n");
        output.writeBytes("Total Belanja: Rp" + totalBelanja + "\n");
        output.writeBytes("Diskon       : " + diskon + "%\n");
        output.writeBytes("Total Bayar  : Rp" + totalBayar + "\n");
        output.writeBytes("Uang Bayar   : Rp" + bayar + "\n");
        output.writeBytes("Kembalian    : Rp" + kembalian + "\n");
    }
}


