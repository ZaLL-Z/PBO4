
package Tugas7;

class Civitas {
    String nama;
    String status;

    Civitas(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }

    void info() {
        System.out.println(nama + " adalah " + status + " Fakultas Teknik");
    }
}

class Dosen extends Civitas {
    Dosen(String nama) {
        super(nama, "Dosen");
    }
}

class Mahasiswa extends Civitas {
    Mahasiswa(String nama) {
        super(nama, "Mahasiswa");
    }
}

class Staff extends Civitas {
    Staff(String nama) {
        super(nama, "Staff");
    }
}

public class Tugas7Soal6 {
    public static void main(String[] args) {
        Civitas d = new Dosen("Pak Budi");
        Civitas m = new Mahasiswa("Andi");
        Civitas s = new Staff("Ibu Sari");

        d.info();
        m.info();
        s.info();
    }
}
