package Datawheel;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
    	int[] a = {1,4,6,2,4};
    	Arrays.sort(a);
    	System.out.println(binarySearch0(a, 4));
	}
	
	public static int binarySearch0(int[] a, int key) {
    	int low = 0;
    	int high = a.length - 1;

    	while (low <= high) {
    			int mid = (low + high) >>> 1;
//@SuppressWarnings("rawtypes")
				int midVal = a[mid];
//@SuppressWarnings("unchecked")
				int cmp = mid-key;

				if (cmp < 0)
					low = mid + 1;
				else if (cmp > 0)
					high = mid - 1;
				else
					return mid; // key found
    	}
    	return -(low + 1);  // key not found.
    }

    
    
    
}
