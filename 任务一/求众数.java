package TreeNode;

import java.util.HashMap;
import java.util.Iterator;

public class Test169 {
	public static void main(String[] args) {
		int[] nums = {1,2,2,1,1,2,2};
		System.out.println(majorityElement(nums));
	}
    public static int majorityElement(int[] nums) {
        //int res = nums[0];
    	HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int tamp = map.get(nums[i]);
				map.put(nums[i], tamp+1);
				if (tamp+1>nums.length/2) return nums[i];
			}
			else {
				map.put(nums[i], 1);
			}
		}
        return nums[0];
    }
}
