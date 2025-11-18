package Tugas6;

public class Tugas6Soal1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};

        int[] b = new int[3];
        b[0] = 10; b[1] = 20; b[2] = 30;

        int[] c;
        c = new int[]{7, 8, 9};

        System.out.println("Array a: ");
        for(int x : a) System.out.print(x+" ");

        System.out.println("\nArray b: ");
        for(int x : b) System.out.print(x+" ");

        System.out.println("\nArray c: ");
        for(int x : c) System.out.print(x+" ");
    }
}

