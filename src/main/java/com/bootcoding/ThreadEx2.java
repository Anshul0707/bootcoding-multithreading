package src.main.java.com.bootcoding;

import src.main.java.com.bootcoding.mythread.AlphabetThread;
import src.main.java.com.bootcoding.mythread.NumberThread;
import src.main.java.com.bootcoding.mythread.SpecialSymbolThread;

public class ThreadEx2 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

        Thread t1 = new NumberThread();
        t1.start();
        Thread t2 = new AlphabetThread();
        t2.start();
        Thread t3 = new SpecialSymbolThread();
        t3.start();
    }
}
