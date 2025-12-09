
package PBO.Tugas9;

class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    String berak() {
        return nama + " sedang berak.";
    }
}

class Kucing extends Hewan {
    Kucing(String nama) {
        super(nama);
    }

    String display() {
        return "Nama hewan: " + nama;
    }
}

public class Soal4 {
    public static void main(String[] args) {
        Kucing k = new Kucing("Yusuf");
        System.out.println(k.display());
        System.out.println(k.berak());
    }
}