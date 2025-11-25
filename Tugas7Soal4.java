
package Tugas7;

class SumpahPemuda {
    String awal;

    SumpahPemuda() {
        awal = "Kami putra dan putri Indonesia";
    }

    void lanjutan() {
        System.out.println("Mengaku bertumpah darah yang satu, tanah air Indonesia");
        System.out.println("Mengaku berbangsa yang satu, bangsa Indonesia");
        System.out.println("Menjunjung bahasa persatuan, bahasa Indonesia");
    }
}

public class Tugas7Soal4 {
    public static void main(String[] args) {
        SumpahPemuda s = new SumpahPemuda();
        System.out.println(s.awal);
        s.lanjutan();
    }
}
