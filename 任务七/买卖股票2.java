package TreeNode;

public class Test122 {
	public static void main(String[] args) {
			int[] a = {1,2,3,4,5};
			System.out.println(maxProfit(a));
		}
    public static int maxProfit(int[] prices) {
    	int profit = 0;
    	if (prices==null||prices.length<2) return profit;
    	int curPrice = prices[0];
    	for (int i = 1; i < prices.length; i++) {
			if (prices[i]>=curPrice) {
				profit += (prices[i]-curPrice);
			}
			/*else {
				
			}*/
			curPrice = prices[i];
		}
        return profit;
    }
}
