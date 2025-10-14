package TugasPBO_4_Muhammad_Faizal;

public class OperasiMatematika {
    static void Pertambahan(int a, int b){
        System.out.println("Pertambahan dari " + a + " + " + b + " = " + (a+b));
    }
    static void Pengurangan(int a, int b){
        System.out.println("Pengurangan dari " + a + " - " + b + " = " + (a-b));
    }
    static void Perkalian(int a, int b){
        System.out.println("Perkalian dari " + a + " x " + b + " = " + (a*b));
    }
    
    public static void main(String[] args) {
        int x = 22, y = 33;
//        Pertambahan
        Pertambahan(x, y);
//        Pengurangan
        Pengurangan(x, y);
//        Perkalian
        Perkalian(x, y);
    }

}
