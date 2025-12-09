package PBO.Tugas9;

class Hewan {
    String jenis;

    Hewan(String jenis) {
        this.jenis = jenis;
    }

    void tampil() {
        System.out.println("- hewan berkaki " + jenis);
    }
}

class DuaKaki extends Hewan {
    DuaKaki() { super("dua"); }
}

class EmpatKaki extends Hewan {
    EmpatKaki() { super("empat"); }
}

class EnamKaki extends Hewan {
    EnamKaki() { super("enam"); }
}

class DelapanKaki extends Hewan {
    DelapanKaki() { super("delapan"); }
}

public class Soal1 {
    public static void main(String[] args) {
        System.out.println("Macam-macam hewan:");
        new DuaKaki().tampil();
        new EnamKaki().tampil();
        new EmpatKaki().tampil();
        new DelapanKaki().tampil();

        System.out.println("\nContoh hewan:");
        System.out.println("- hewan berkaki dua: kangguru, ayam, bebek, dll");
        System.out.println("- hewan berkaki enam: capung, nyamuk, kupu-kupu, dll");
        System.out.println("- hewan berkaki empat: kucing, anjing, kuda, dll");
        System.out.println("- hewan berkaki delapan: kepiting, laba-laba, dll");
    }
}