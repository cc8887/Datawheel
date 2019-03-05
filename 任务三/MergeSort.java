package Datawheel;

public class MergeSort {
	public static void main(String[] args) {
		int[] a = {1,4,6,2,4};
		int[] a1 = {4,3,6,9,-10,1};
		//Sort(a);
		mergeSort(0, a1.length-1, a1);
		for (int i : a1) {
			System.out.print(i+",");	
		}
	}
	public static void Sort(int[] a) {
	//	int length = a.length;
		mergeSort(0, a.length-1, a);
		
	}
	
	public static void mergeSort(int head, int tail, int[] num) {
		if (tail-head<1) return;
		mergeSort(head, (tail+head)/2, num);
		mergeSort((head+tail)/2+1, tail, num);
		
		int lowIndex = head;
		int highIndex = (head+tail)/2+1;
		
		int[] tamp = new int[tail-head+1];
		int tampIndex = 0;
		while (lowIndex <= (head+tail)/2 && highIndex <= tail ) {
			if (num[lowIndex]>=num[highIndex]) {
				tamp[tampIndex++] = num[highIndex++];
			}
			else{
				tamp[tampIndex++] = num[lowIndex++];
			}
		}
		while(lowIndex<=(head+tail)/2) {
			tamp[tampIndex++] = num[lowIndex++]; 
		}
		while(highIndex<=tail) {
			tamp[tampIndex++] = num[highIndex++];
		}
/*		for (int i : tamp) {
			System.out.print(i+",");
		}*/
		//System.out.println();
		System.arraycopy(tamp, 0, num, head, tail-head+1);
	}
}
