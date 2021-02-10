/*
 * Check if a given number is palindrome.
 */
package recursion;

import java.util.Scanner;

public class Palindrome {
    static int pal = 0;
    public static int PAL(int num) {
        if(num>0) {
            pal = (pal*10) + (num %10);
            PAL(num/10);
        }
        return pal;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dose ena thetiko arithmo: ");
        if(sc.hasNextInt()) {
            int x = sc.nextInt();
            int y = Palindrome.PAL(x);
            System.out.println(y);
            if (x==y) System.out.println("Palindrome!");
            else System.out.println("Not Palindrome!");
        }
    }
    
}
