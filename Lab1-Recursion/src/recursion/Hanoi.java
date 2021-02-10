package recursion;

import java.util.Scanner;

public class Hanoi {
    
    static int moves = 0;
    
    static int getInt() {
        String line;
        Scanner sc = new Scanner(System.in);
        try {
            line = sc.nextLine();
            int i = Integer.valueOf(line);
            return i;
        }
        catch (NumberFormatException e) {
            System.out.println("Error occurred!");
            return 1;
        }
    }
    
    static void hanoi(int h, char from, char to, char with) {
        if (h >= 1) {
            hanoi(h-1, from, with, to);
            moveDisk(from, to);
            hanoi(h-1, with, to, from);
        }
    }
    static void moveDisk(char from, char to) {
        moves++;
        System.out.println(from);
        System.out.println(to);
    }
    
    public static void main (String[] args) {
        int TowerHeight;
        char from = '1';
        char to = '2';
        char with = '3';
        System.out.println("Dose plithos diskwn :");
        TowerHeight = getInt();
        hanoi(TowerHeight, from, to, with);
        System.out.println();
    }
    
}
