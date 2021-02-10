package recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dose ena thetiko arithmo: ");
        if(input.hasNextInt()) {
            int n = input.nextInt();
            System.out.println("H " + n + " thesi tis akolouthias antistoixei ston arithmo: " + fibo(n));
        }
    }
    
    public static int fibo (int num) {
        if (num == 0) return 0;
        if (num == 1 || num == 2) return 1;
        else return fibo(num - 1) + fibo(num - 2);
    }
    
}
