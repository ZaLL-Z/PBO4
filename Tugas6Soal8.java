package Tugas6;

class Worker extends Thread {
    private int id;

    Worker(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Thread " + id + " berjalan...");
    }
}
public class Tugas6Soal8 {
  public static void main(String[] args) {
        int jumlah = 5; // ubah jumlah thread sesuai kebutuhan

        for (int i = 1; i <= jumlah; i++) {
            Worker w = new Worker(i);
            w.start();
        }
    }

}
