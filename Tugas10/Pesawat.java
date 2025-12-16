
package Tugas10;


public class Pesawat extends Kendaraan {
    String nama, jenis;

    @Override
    public void informasi() {
        System.out.println("Pesawat");
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
    }
}