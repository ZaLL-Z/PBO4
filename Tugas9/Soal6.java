package PBO.Tugas9;

class Komik6 extends Produk {
    int jumlahHalaman;

    Komik6(String judul, String penulis, int jumlahHalaman) {
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }

    String getInfoProduk() {
        return "Komik: " + judul + " | Penulis: " + penulis +
               " | Halaman: " + jumlahHalaman;
    }
}

class Games6 extends Produk {
    int waktuMain;

    Games6(String judul, String penulis, int waktuMain) {
        super(judul, penulis);
        this.waktuMain = waktuMain;
    }

    String getInfoProduk() {
        return "Game: " + judul + " | Developer: " + penulis +
               " | Waktu Main: " + waktuMain + " jam";
    }
}

public class Soal6 {
    public static void main(String[] args) {
        Komik6 k = new Komik6("Hunter x Hunter", "Yoshihiro Togashi", 208);
        Games6 g = new Games6("Elden Ring", "FromSoftware", 69);

        System.out.println(k.getInfoProduk());
        System.out.println(g.getInfoProduk());
    }
}