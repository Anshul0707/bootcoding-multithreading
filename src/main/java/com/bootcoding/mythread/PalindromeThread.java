package src.main.java.com.bootcoding.mythread;

public class PalindromeThread extends Thread {
    public void run() {
        for (int i = 1; i <=100000; i++) {
            int r, sum = 0, temp;
            int n = i;
            temp = n;
            while (n > 0) {
                r = n % 10;
                sum = (sum * 10) + r;
                n = n / 10;
            }
            if (temp == sum) System.out.println(i+" is Palindrome number ");
            else System.out.println(i+" is Not Palindrome");
        }
    }
}
