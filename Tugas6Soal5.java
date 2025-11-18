package Tugas6;

public class Tugas6Soal5 {
   public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int kolom = m[0].length;
        int[] hasil = new int[kolom];

        for (int j = 0; j < kolom; j++) {
            int sum = 0;
            for (int i = 0; i < m.length; i++) {
                sum += m[i][j];
            }
            hasil[j] = sum;
        }

        for (int j = 0; j < hasil.length; j++) {
            System.out.println("Jumlah kolom ke-" + j + " = " + hasil[j]);
        }
    }
}
