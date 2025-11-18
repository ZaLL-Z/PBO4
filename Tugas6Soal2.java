package Tugas6;

public class Tugas6Soal2 {
    public static void main(String[] args) {
        String[] mobil = {"Tesla","Suzuki","Civic","Mazda","BMW"};

        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
                mobil[i] = "Toyota";      // ubah
                System.out.println("Index diubah: " + i);
                System.out.println("Nilai baru: " + mobil[i]);
            }
        }
    }
}
