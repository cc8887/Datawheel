package Datawheel;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(getFibonacci(10));
	}
	
	public static int getFibonacci(int i) {
		if(i<3)return i;
		return getFibonacci(i-2)+getFibonacci(i-1);
	}   
}
