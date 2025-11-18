package Tugas6;

public class Tugas6Soal9 {
   public static void main(String[] args) {

        int[] age = {12, 4, 5, 2, 6};

        System.out.print("For biasa: ");
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i] + " ");
        }

        System.out.print("\nFor-each: ");
        for (int x : age) {
            System.out.print(x + " ");
        }
    }
}
