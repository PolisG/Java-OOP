package search;

import java.util.Scanner;

/**
 *
 * @author Polis
 */
public class TestMyUtils2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Student[] arr = new Student[10];
	arr[0] = new Student(1646, "Nikolaos", "Papas", 2016);
	arr[1] = new Student(1242, "Giannis", "Giannou", 2012);
	arr[2] = new Student(1525, "Anna", "Dimitriou", 2015);
	arr[3] = new Student(1313, "Niki", "Gregoriadou", 2013);
	arr[4] = new Student(1616, "Maria", "Xatzi", 2016);
	arr[5] = new Student(1610, "Panagiotis", "Lamprou", 2016);
	arr[6] = new Student(1511, "Kostantinos", "Papadopoulos", 2015);
	arr[7] = new Student(1412, "Pavlos", "Pavlou", 2014);
	arr[8] = new Student(1716, "Aggelos", "Charalampous",2017);
	arr[9] = new Student(1717, "Dimitris", "Dimitriou",2017);

	System.out.print("Give an AM: ");	
	int key = sc.nextInt();
        
	int found = MyUtils2.searchByAM(arr, key);
	if (found == -1)
            System.out.println("No match was found for the specified search!");
	else
            System.out.println("AM was found in position (index) " + found + 
                    ". Student: " + arr[found].getSurname() + " " + arr[found].getName());
    }
    
}
