package src.main.java.com.bootcoding;

public class demo {
    public static void main(String[] args) {
        int n = 4, a = 0, b = 0, sumf = 1;
        if (n <= 0)
            sumf = 0;
        int curr = 1;
        for(int i = 1; i < n; i++){
            a = b;
            b = curr;
            curr = a+b;
            sumf += curr;
        }
        System.out.println("The sum of fibonocci numbers is:"+sumf);
    }
}
