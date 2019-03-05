package Datawheel;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] a = {4,2,1};
		Arrays.sort(a);
		quickSort(a,0,2);
		for (int i : a) {
			System.out.print(i+",");	
		}
	}
	public static void Sort(int[] a) {
	//	int length = a.length;
		
		
		
	}
	public static void quickSort(int[] a, int low, int high) {
		if (low>=high) return;
		
		int basic = a[low];
		int leftIndex = low;
		int rightIndex = high;
		while (leftIndex < rightIndex) {
			while (a[leftIndex] <= basic && leftIndex < rightIndex)leftIndex++;
			while (a[rightIndex] > basic && leftIndex < rightIndex)rightIndex--;
 			if (leftIndex < rightIndex) {
 				exch(a, leftIndex, rightIndex);	
			}
		}
		System.out.println(leftIndex+","+rightIndex);
		exch(a, low, leftIndex-1);
		//quickSort(a, low, high);
	}		
	public static void quickSort1(int[] a, int low, int high) {
		if (low>=high) return;
		
		int basic = a[low];
		int leftIndex = low;
		int rightIndex = high+1;
		while(true) {
			while (a[++leftIndex] < basic) if (leftIndex==high) break;
			while (a[--rightIndex] > basic) if (rightIndex==low) break;
			if (leftIndex >= rightIndex) break;
			exch(a, leftIndex, rightIndex);
		}
		System.out.println(leftIndex+","+rightIndex);
		exch(a, 0, leftIndex);
	}	
	public static void exch(int[] a, int indexA, int indexB) {
		int tamp = a[indexA];
		a[indexA] = a[indexB];
		a[indexB] = tamp;
	}
}
