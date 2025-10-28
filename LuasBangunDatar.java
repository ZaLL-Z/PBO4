package tugas4;
import java.util.Scanner;

public class LuasBangunDatar {

  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int pilihan;
  double hasil = 0;

  System.out.println("=== Program Luas Bangun Datar ===");
  System.out.println("1. Luas Persegi");
  System.out.println("2. Luas Segitiga");
  System.out.println("3. Luas Lingkaran");
  System.out.println("4. Luas Trapesium");
  System.out.println("5. Luas Layang-layang");
  System.out.print("Pilih menu (1-5): ");
  pilihan = input.nextInt();

  switch (pilihan) {
    case 1:
    System.out.print("Masukkan sisi: ");
    double sisi = input.nextDouble();
    hasil = sisi * sisi;
    System.out.println("Luas Persegi = " + hasil);
    break;

case 2:
    System.out.print("Masukkan alas: ");
    double alas = input.nextDouble();
    System.out.print("Masukkan tinggi: ");
    double tinggi = input.nextDouble();
    hasil = 0.5 * alas * tinggi;
    System.out.println("Luas Segitiga = " + hasil);
    break;

case 3:
    System.out.print("Masukkan jari-jari: ");
    double r = input.nextDouble();
    hasil = Math.PI * r * r;
    System.out.println("Luas Lingkaran = " + hasil);
    break;

case 4:
    System.out.print("Masukkan sisi atas: ");
    double atas = input.nextDouble();
    System.out.print("Masukkan sisi bawah: ");
    double bawah = input.nextDouble();
    System.out.print("Masukkan tinggi: ");
    double t = input.nextDouble();
    hasil = 0.5 * (atas + bawah) * t;
    System.out.println("Luas Trapesium = " + hasil);
    break;

case 5:
    System.out.print("Masukkan diagonal 1: ");
    double d1 = input.nextDouble();
    System.out.print("Masukkan diagonal 2: ");
    double d2 = input.nextDouble();
    hasil = 0.5 * d1 * d2;
    System.out.println("Luas Layang-layang = " + hasil);
    break;

  default:
  System.out.println("Pilihan tidak valid!");
  break;
  }

  System.out.println("===============================");
  }
}
