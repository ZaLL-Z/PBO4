
package Tugas10;


public class Mahasiswa extends Orang {
    private String nim;

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public String info() {
        return "Nama: " + nama +
               ", Umur: " + umur +
               ", NIM: " + nim;
    }
}