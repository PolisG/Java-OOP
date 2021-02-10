package sort;

/**
 *
 * @author Polis
 */
public class TestSortUtils {
    public static void main(String[] args) {
        
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

	System.out.println("Original array:");
        for (Student arr1 : arr) {
            System.out.println(arr1);
        }

	MyUtils.quickSortAM(arr);
	System.out.println();
	System.out.println("Students sorted by AM (Quick sort):");
        for (Student arr1 : arr) {
            System.out.println(arr1);
        }

	MyUtils.mergeSortSurname(arr);
	System.out.println();
	System.out.println("Students sorted by surname (Merge sort):");
        for (Student arr1 : arr) {
            System.out.println(arr1);
        }
    }
}