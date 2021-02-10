package search;

/**
 *
 * @author Polis
 */
public class MyUtils1 {
    public static int searchBySurname(Student arr[], String key) {
        int size = arr.length;
        for (int i=0; i<size; i++) {
            if (arr[i].getSurname().equals(key)) {
                return i;
            }
        }
        return -1;
    }
}
