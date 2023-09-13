package src.main.java.com.bootcoding.mythread;

public class NumberThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("NumberThread");
        }
    }
}
