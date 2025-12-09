package PBO.Tugas9;

class Segitiga {
    protected double alas;
    protected double tinggi;

    protected double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}

public class Soal2 extends Segitiga {
    public Soal2(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public static void main(String[] args) {
        Soal2 s = new Soal2(14, 40);
        System.out.println("Luas segitiga = " + s.hitungLuas());
    }
}