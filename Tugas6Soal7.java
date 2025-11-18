package Tugas6;

class Proses extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread berjalan: " + i);
            try { Thread.sleep(500); } catch (Exception ignored) {}
        }
    }
}
public class Tugas6Soal7 {
   public static void main(String[] args) {
        Proses p = new Proses();
        p.start();
    }
}
