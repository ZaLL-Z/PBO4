package TugasPBO_4_Muhammad_Faizal;

public class HitungWaktuCahaya {

    public static void main(String[] args) {
        double jarakBumiKeBulan = 384400; 
        double jarakMatahariKeBumi = 152100000;
        double kecepatanCahaya = 300000;

        double waktuBumiBulan = jarakBumiKeBulan / kecepatanCahaya;
        double waktuMatahariBumiDetik = jarakMatahariKeBumi / kecepatanCahaya;

        double waktuMatahariBumiMenit = waktuMatahariBumiDetik / 60;

        System.out.println("--- Waktu Tempuh Cahaya ---");
        System.out.println("Jarak Bumi ke Bulan: " + jarakBumiKeBulan + " km");
        System.out.println("Waktu tempuh dari Bumi ke Bulan: " + waktuBumiBulan + " detik");
        System.out.println("\n----------------------------------\n");
        System.out.println("Jarak Matahari ke Bumi: " + jarakMatahariKeBumi + " km");
        System.out.println("Waktu tempuh dari Matahari ke Bumi: " + waktuMatahariBumiDetik + " detik");
        System.out.println("Atau setara dengan: " + waktuMatahariBumiMenit + " menit");
    }

}
