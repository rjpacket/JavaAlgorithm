package com.company.difficult;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintHelloWorld {
    public static int count = 0;

    public static class MyRun implements Runnable {

        private String lock;

        public MyRun(String lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            System.out.println("hello" + "|lock=" + lock);
            synchronized (lock) {
                count++;
                if (count != 5) {
                    try {
                        lock.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                lock.notifyAll();
                System.out.println("world" + "|lock=" + lock);
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRun("123"));
        Thread t2 = new Thread(new MyRun("123"));
        Thread t3 = new Thread(new MyRun("123"));
        Thread t4 = new Thread(new MyRun("123"));
        Thread t5 = new Thread(new MyRun("123"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
