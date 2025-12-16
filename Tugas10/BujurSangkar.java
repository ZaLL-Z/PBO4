
package Tugas10;


public class BujurSangkar extends Bentuk {
    double sisi;

    public BujurSangkar(double s) {
        sisi = s;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }
}