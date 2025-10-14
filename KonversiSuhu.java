
package TugasPBO_3_Muhammad_Faizal;

public class KonversiSuhu {

    public static void main(String[] args) {
        double C_awal = 10;
        double F_awal = 15;
        double R_awal = 5;

        System.out.println("Nilai Awal: Celsius = 10, Fahrenheit = 15, Reamur = 5\n");

        // a. Celcius ke Fahrenheit dan sebaliknya
        double cToF = (C_awal * 9.0/5.0) + 32;
        double fToC = (F_awal - 32) * 5.0/9.0;
        System.out.println("a. Konversi Celcius <=> Fahrenheit");
        System.out.println("   10 Celsius ke Fahrenheit = " + cToF);
        System.out.println("   15 Fahrenheit ke Celsius = " + fToC);
        System.out.println("----------------------------------------------");

        // b. Celcius ke Reamur dan sebaliknya
        double cToR = C_awal * 4.0/5.0;
        double rToC = R_awal * 5.0/4.0;
        System.out.println("b. Konversi Celcius <=> Reamur");
        System.out.println("   10 Celsius ke Reamur = " + cToR);
        System.out.println("   5 Reamur ke Celsius = " + rToC);
        System.out.println("----------------------------------------------");

        // c. Fahrenheit ke Reamur dan sebaliknya
        double fToR = (F_awal - 32) * 4.0/9.0;
        double rToF = (R_awal * 9.0/4.0) + 32;
        System.out.println("c. Konversi Fahrenheit <=> Reamur");
        System.out.println("   15 Fahrenheit ke Reamur = " + fToR);
        System.out.println("   5 Reamur ke Fahrenheit = " + rToF);
        System.out.println("----------------------------------------------");
    }
}
