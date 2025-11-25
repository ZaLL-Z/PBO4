
package Tugas7;

import java.util.Scanner;

class Mahasiswa2 {
    String nama, npm, kelas;

    Mahasiswa2(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    void tampil() {
        System.out.println("Nama  : " + this.nama);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
    }
}

public class Tugas7Soal7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = sc.nextLine();

        System.out.print("NPM : ");
        String npm = sc.nextLine();

        System.out.print("Kelas : ");
        String kelas = sc.nextLine();

        Mahasiswa2 m = new Mahasiswa2(nama, npm, kelas);
        m.tampil();
    }
}
