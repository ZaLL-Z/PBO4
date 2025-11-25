
package Tugas7;

class TebakTanggal {
    int hitung(int bulan, int tanggal) {
        return (bulan * 100) + tanggal;
    }
}

public class Tugas7Soal3 {
    public static void main(String[] args) {
        TebakTanggal t = new TebakTanggal();
        System.out.println("Hasil = " + t.hitung(1, 14));
    }
}