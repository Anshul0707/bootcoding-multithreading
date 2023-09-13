package src.main.java.com.bootcoding.mythread;

public class FibonacciThread extends Thread {
    public void run() {
        for (int i = 1; i < 100000; i++) {
            int n = i, a = 0, b = 0, sumf = 1;
            if (n <= 0)
                sumf = 0;
            int curr = 1;
            for(int j = 1; j < n; j++){
                a = b;
                b = curr;
                curr = a+b;
                sumf += curr;
            }
            System.out.println("The sum of fibonocci numbers "+i+" is: "+sumf);
        }
    }
}

