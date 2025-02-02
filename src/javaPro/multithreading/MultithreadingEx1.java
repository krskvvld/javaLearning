package javaPro.multithreading;

public class MultithreadingEx1 {
    public static void main(String[] args) {
        /**
         * Многопоточность - это принцип построения программы, при котором несколько блоков
         * кода могут выполняться одновременно.
         * Цели многопоточности:
         *      1. Производительность
         *      2. Concurrency
         */
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.start();
        myThread2.start();
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 100; i >= 0; i--) {
            System.out.println(i);
        }
    }
}