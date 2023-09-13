package src.main.java.com.bootcoding.mythread;

public class PrimeNumberThread extends Thread {
    public void run() {
        for (int i = 2; i <= 100000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " is a Prime number");
            }
            else {
                System.out.println(i + " is not a Prime number");
            }
        }
    }
}

