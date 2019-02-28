package TreeNode;

public class Test41 {
	public static void main(String[] args) {
		int[] nums = {1};
		System.out.println(firstMissingPositive1(nums));
	}
    public static int firstMissingPositive(int[] nums) {
        //int res = 0;
    	if (nums==null||nums.length==0) return 1;
    	if (nums.length==1) return nums[0]+1;
    	
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
			if (nums[i]<0) nums[i] = 0;
        	if(nums[i]<=min&&nums[i]>=0) min = nums[i];
		}
        //int lastIndex = nums.length;
        for (int i = 0; i < nums.length; ) {
			int tampNum = nums[i];
        	if (tampNum-min>=nums.length) {
			//	lastIndex--;
				i++;
			}
        	else {
				if (nums[tampNum-min]==nums[i]) i++;
				else {
					nums[i] = nums[tampNum-min];
					nums[tampNum-min] = tampNum;
				}
			}
		}
        for (int i = 1; i < nums.length; i++) {
			if (nums[i]!=nums[i-1]+1) return nums[i-1]+1;
		}
/*        for (int i : nums) {
			System.out.print(i+",");
		}*/
        return nums[nums.length-1]+1;
    }

    public static int firstMissingPositive1(int[] nums) {
    	if (nums==null||nums.length==0) return 1;

        for (int i = 0; i < nums.length; ) {
			nums[i] = nums[i]>0? nums[i]:0;
        	int tampNum = nums[i];
        	if (tampNum>=nums.length||tampNum<1) {
			//	lastIndex--;
				i++;
			}
        	//需要把我们当前的值挪到它（存储值 - 1）的位置上
        	else {
				if (nums[tampNum-1]==nums[i]) i++;
				else {
					nums[i] = nums[tampNum-1];
					nums[tampNum - 1] = tampNum;
				}
			}
		}
        for (int i = 0; i < nums.length; i++) {
			if (i+1!=nums[i]) return i+1;
		}
        
        return nums[nums.length-1]+1;
    }
}
