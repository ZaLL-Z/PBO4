package tugas3;
  import java.util.Scanner;
  
public class Sentripetal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan massa (kg): ");
        double m = input.nextDouble();

        System.out.print("Masukkan kecepatan (m/s): ");
        double v = input.nextDouble();

        System.out.print("Masukkan jari-jari (m): ");
        double r = input.nextDouble();

        double Fc = (m * v * v) / r;

        System.out.println("\nSentripetal (Fc) = " + Fc + " Newton");
    }
}


