
package Tugas7;

class Rekursif {
    void hitung(int n) {
        if (n == 0) return;
        System.out.println("n = " + n);
        hitung(n - 1);     // memanggil dirinya sendiri
    }
}

public class Tugas7Soal5 {
    public static void main(String[] args) {
        Rekursif r = new Rekursif();
        r.hitung(5);
    }
}
