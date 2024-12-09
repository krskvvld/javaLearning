package javaPro.multithreading;

public class MultithreadingEx2 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 100; i >= 0; i--) {
                System.out.println(i);
            }
        };

        Thread t3 = new Thread(new MyThread3());
        Thread t4 = new Thread(runnable);
        t3.start();
        t4.start();
    }
}

class MyThread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}