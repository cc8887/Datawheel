package Datawheel;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = {1,4,6,2,4};
		Sort(a);
		for (int i : a) {
			System.out.print(i+",");	
		}
	}
	public static void Sort(int[] a) {
	//	int length = a.length;
		int flag = 1;
		while (flag==1) {
			flag = 0;
			for (int i = 0; i < a.length-1; i++) {
				if (a[i]>a[i+1]) {
					int tamp = a[i];
					a[i] = a[i+1];
					a[i+1] = tamp;
					flag = 1;
				}
			}
		}
	}
}
