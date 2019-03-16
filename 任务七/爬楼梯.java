
public class Test70 {
	public static void main(String[] args) {
		System.out.println(climbStairs(2));
	}
    public static int climbStairs(int n) {
    	if (n<=0) return 0;
    	if (n==1) return 1;
    	int[] step = new int[n+1];
    	step[n] = 1;
    	step[n-1] = 1;
    	for (int i = n-2; i >= 0; i--) {
				step[i] = step[i+1] + step[i+2];
		}
    	return step[0];
    }
}
