package Tugas10;


public class Main {
    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Yusuf");
        mhs.setUmur(22);
        mhs.setNim("20231781");

        System.out.println(mhs.info());
    }
}