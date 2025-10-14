package TugasPBO_4_Muhammad_Faizal;

public class Increment {
    public static void main(String[] args) {
//        Bilangan Asal
        int a = 5;
        int b = 7;
        
        
//        Increment Prefix
        System.out.println("Bilangan asal : " + a);
        System.out.println("Increment Prefix : "+ ++a);
        System.out.println("Hasil Prefix : "+ a);
        
        System.out.println("");
        
//        Increment Postfix
        System.out.println("Bilangan asal : "+b);
        System.out.println("Increment Postfix : "+ b++);
        System.out.println("Hasil Postfix : "+ b);
    }
 

}
