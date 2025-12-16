
package Tugas10;


public class Kapal extends Kendaraan {
    String nama, jenis;

    @Override
    public void informasi() {
        System.out.println("Kapal Laut");
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
    }
}