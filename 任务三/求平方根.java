package Datawheel;

public class Sqrt {
	public static void main(String[] args) {
		System.out.println(sqrt(16));
	}
	public static int sqrt(int num) {
    	int low = 1;
    	int high = num/2;

    	while (low <= high) {
    			int mid = (low + high) >>> 1;
//@SuppressWarnings("rawtypes")
			//	int midVal = mid;
//@SuppressWarnings("unchecked")
				int cmp = mid*mid-num;

				if (cmp < 0)
					low = mid + 1;
				else if (cmp > 0)
					high = mid - 1;
				else
					return mid; // key found
    	}
    	return -1;  // key not found.
    }
}
