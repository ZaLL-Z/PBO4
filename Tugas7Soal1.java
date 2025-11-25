
package Tugas7;

class Mobil {
    String merk;

    void jalan() {
        System.out.println(merk + " sedang berjalan");
    }
}

public class Tugas7Soal1 {
    public static void main(String[] args) {
        Mobil m = new Mobil();     // membuat object
        m.merk = "Toyota";
        m.jalan();
    }
}