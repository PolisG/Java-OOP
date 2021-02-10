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

    public static void swap(Student S[], int x, int y) {
        Student temp = S[x];
        S[x] = S[y];
        S[y] = temp;
    }

    public static int partition(Student S[], int s, int l) {
        int retValue = -1;
        int lowerLimit = s;
        Student pivot = S[s];
	s++;
	while (s < l) {
            while (S[s].getAM() <= pivot.getAM() && s< l)
                s++;
            while (S[l].getAM() >= pivot.getAM() && s<= l)
                l--;
            if (s < l)
                swap(S,s,l);
        }
        if (pivot.getAM() > S[s].getAM()) {
            swap(S,s,lowerLimit);
            retValue = s;
	}
        else if (pivot.getAM() >= S[l].getAM()) {
            swap (S,l,lowerLimit);
            retValue = l;
        }
        return retValue;
    }

    public static void Qsort(Student[] S, int s, int l) {
        final int min=5;
        if (l-s >= 1) {
            int pivot_index = partition (S, s, l);
            if(s <= pivot_index-1 && pivot_index!=-1)
                Qsort (S, s, pivot_index-1);
            if(l >= pivot_index+1 && pivot_index!=-1)
                Qsort (S, pivot_index+1, l);
        }
    }

    public static void quickSortAM(Student[] S) {
        Qsort(S, 0, S.length-1);
    }

    public static void mergeSortSurname(Student[] S) {
        Msort(S, 0, S.length-1);
    }

    public static void Msort(Student[] S, int s, int l) {
        if (s == l) return;
        int mid=(s+l)/2;
        Msort(S, s, mid);
        Msort(S, mid+1, l);
        merge(S,s,l,mid);
    }

    public static void merge(Student S[], int s, int l, int mid) {
	int n = l-s+1;
	Student[] st = new Student[n];
        int i1 = s;
        int i2 = mid+1;
        int j = 0;
        while (i1<=mid && i2<=l) {
            if (S[i1].getSurname().compareTo(S[i2].getSurname())<0) {
                st[j] = S[i1];
                i1++;
            }
            else {
                st[j] = S[i2];
                i2++;
            }
            j++;
        }
        while (i1<=mid) {
            st[j] = S[i1];
            i1++;
            j++;
        }
	while (i2<=l){
            st[j] = S[i2];
            i2++;
            j++;
        }
        for (j=0; j<n; j++)
            S[s+j] = st[j];
    }
}