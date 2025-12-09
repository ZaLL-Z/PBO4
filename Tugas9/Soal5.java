package PBO.Tugas9;


class Produk {
    String judul;
    String penulis;

    Produk(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
}

class Komik extends Produk {

    Komik(String judul, String penulis) {
        super(judul, penulis);
    }

    String getInfoProduk() {
        return "Komik: " + judul + " | Penulis: " + penulis;
    }
}

class Games extends Produk {

    Games(String judul, String penulis) {
        super(judul, penulis);
    }

    String getInfoProduk() {
        return "Game: " + judul + " | Developer: " + penulis;
    }
}

public class Soal5 {
    public static void main(String[] args) {
        Komik k = new Komik("Hunter x Hunter", "Yoshihiro Togashi");
        Games g = new Games("Elden Ring", "FromSoftware");

        System.out.println(k.getInfoProduk());
        System.out.println(g.getInfoProduk());
    }
}