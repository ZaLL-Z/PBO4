
package Tugas10;


public class Main2 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.nama = "Nissan";
        m.jenis = "Darat";
        m.informasi();

        Pesawat p = new Pesawat();
        p.nama = "Garuda";
        p.jenis = "Udara";
        p.informasi();

        KapalLaut k = new Kapal();
        k.nama = "Titanic";
        k.jenis = "Laut";
        k.informasi();
    }
}