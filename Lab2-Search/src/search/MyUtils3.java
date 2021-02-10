package search;

/**
 *
 * @author Polis
 */
public class MyUtils3 {
    public static int searchBySurname(Student arr[], String key) {
        int size = arr.length;
        for (int i=0; i<size; i++) {
            if (arr[i].getSurname().equals(key))
                return i;
        }
        return -1;
    }
    
    public static int searchByAM(Student arr[], int key) {
        int left = 0, right = arr.length-1;
        int mid, found = -1;
        while (found == -1 && left <= right) {
            mid = (left+right)/2;
            if (key < arr[mid].getAM())
                right = mid-1;
	    else if (key > arr[mid].getAM())
		left = mid+1;
	    else
                found = mid;
        }
        return found;
    }
    
    public static int recursiveSearchByAM(Student arr[], int key) {
        int left = 0, right = arr.length-1;
        return recSearch(arr, key, left, right);
    }
    
    private static int recSearch(Student arr[], int key, int left, int right) {
        int index = (left+right)/2;
        if (left > right)
            return -1;
        else {
            if (key == arr[index].getAM())
                return index;
            else if (key > arr[index].getAM())
                return recSearch (arr, key, index+1, right);
            else
                return recSearch (arr, key, left, index-1);
        }
    }
}
