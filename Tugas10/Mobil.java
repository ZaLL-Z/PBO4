
package Tugas10;


public class Mobil extends Kendaraan {
    String nama, jenis;

    @Override
    public void informasi() {
        System.out.println("Mobil");
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
    }
}