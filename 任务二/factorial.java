package Datawheel;

public class factorial {
	public static void main(String[] args) {
		System.out.println(getFactorial(3));
	}
	public static int getFactorial(int i) {
		if (i<=1) return 1;
		return i*getFactorial(i-1);
	}

}
