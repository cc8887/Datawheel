package Datawheel;

import java.util.Arrays;

public class VagueBinarySearch {
    public static void main(String[] args) {
    	int[] a = {-1,1,2,3,6,7};
    	Arrays.sort(a);
    	System.out.println(vagueBinarySearch(a, 4));
	}
	public static int vagueBinarySearch(int[] a, int key) {
    	int low = 0;
    	int high = a.length - 1;

    	while (high - low > 1) {
    			int mid = (low + high) >>> 1;
//@SuppressWarnings("rawtypes")
				int midVal = a[mid];
//@SuppressWarnings("unchecked")
				int cmp = mid-key;

				if (cmp < 0)
					low = mid + 1;
				else if (cmp > 0)
					high = mid;
				else
					return mid; // key found
    	}
    	return (high);  // key not found.
    }
}
