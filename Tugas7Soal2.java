
package Tugas7;

class PersegiPanjang {
    int keliling(int p, int l) {
        return 2 * (p + l);
    }
}

public class Tugas7Soal2 {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("Keliling = " + pp.keliling(10, 5));
    }
}