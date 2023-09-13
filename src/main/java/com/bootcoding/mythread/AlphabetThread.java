package src.main.java.com.bootcoding.mythread;

public class AlphabetThread extends Thread {
    public void run(){

        for(int i = 0; i < 100000000; i++) {
            System.out.println("Alphabet Thread is executed!");
        }
    }
}
