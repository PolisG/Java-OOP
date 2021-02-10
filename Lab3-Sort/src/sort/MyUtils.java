package sort;

/**
 *
 * @author Polis
 */
public class MyUtils {
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
    
    public static void insertSortAM(Student[] s) {
	for (int i=1; i<s.length; i++) {
            Student key = s[i];
            int pos = i;
            while (pos>0 && s[pos-1].getAM() > key.getAM()) {
                s[pos] = s[pos-1];
                pos--;
            }
            s[pos] = key;
        }
    }

    public static void selectSortSurname(Student[] s) {
        int min;
	Student temp;
        for (int i=0; i<s.length-1; i++) {
            min = i;
            for (int scan=i+1; scan<s.length; scan++)
                if (s[scan].getSurname().compareTo(s[min].getSurname())<0)
                    min = scan;
            temp = s[min];
            s[min] = s[i];
            s[i] = temp;
        }
    }

    public static void bubbleSortYear(Student[] s) {
        int i, j;
        Student temp;
        boolean flag;
        for (i=1; i<s.length; i++) {
            flag = true;
            for (j=0; j<s.length-i; j++)
                if (s[j].getYear() > s[j+1].getYear()) {
                    temp = s[j];
                    s[j] = s[i+1];
                    s[j+1] = temp;
                    flag = false;
                }
            if (flag) return;
        }
    }

    public static void quickSortAM(Student[] s) {
        Student input[] = new Student[s.length];
        int length;
        if (s == null || s.length == 0)
            return;
        
        input = s;
        length = s.length;
        qSort(s, 0, length -1);
    }
    
    public static void qSort(Student[] input, int low, int high) {
        int i = low;
        int j = high;
        int x = 0;
        x = low + (high - low) / 2;
        int pivot = input[low + (high - low) / 2].getAM();
        while (i<=j) {
            while (input[i].getAM() < pivot) {
                i++;
            }
            while (input[i].getAM() > pivot) {
                j--;
            }
            if (i <= j) {
                swap(input, i, j);
                i++;
                j--;
            }
            if (low < j)
                qSort(input, low, j);
            
            if (high > i)
                qSort(input, i, high);
        }
    }

    private static void swap(Student input[], int i, int j) {
        Student temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    public static void mergeSortSurname(Student[] arr) {
        mSort(arr, 0, arr.length-1);
    }

    public static void mSort(Student[] arr, int first, int last) {
        if (first == last)
            return;
        int mid = (first + last)/2;
	mSort(arr, first, mid);
	mSort(arr, mid+1, last);
	merge(arr, first, last, mid);
    }
    
    public static void merge(Student[] arr, int first, int last, int mid) {
        int n = last - first+1;
	Student[] pin = new Student[n];
        int i1 = first;
	int i2 = mid+1;
	int j = 0;
        while (i1<=mid && i2<=last) {
            if (arr[i1].getSurname().compareTo(arr[i2].getSurname())<0) {
                pin[j] = arr[i1];
                i1++;
            }
	    else {
		pin[j] = arr[i2];
		i2++;
	    }
	    j++;
	}
	while (i1<=mid) {
	    pin[j] = arr[i1];
	    i1++;
	    j++;
	}
	while (i2<=last) {
	    pin[j] = arr[i2];
	    i2++;
	    j++;
	}
    }
}