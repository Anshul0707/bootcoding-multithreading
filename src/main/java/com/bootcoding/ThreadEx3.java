package src.main.java.com.bootcoding;

import src.main.java.com.bootcoding.mythread.FibonacciThread;
import src.main.java.com.bootcoding.mythread.PalindromeThread;
import src.main.java.com.bootcoding.mythread.PrimeNumberThread;

public class ThreadEx3 {
    public static void main(String[] args) {
        Thread t1 = new PalindromeThread();
        t1.start();
        Thread t2 = new PrimeNumberThread();
        t2.start();
        Thread t3 = new FibonacciThread();
        t3.start();
    }
}
