package TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.sun.org.apache.bcel.internal.generic.NEW;

//import com.sun.tools.classfile.Annotation.element_value;

//import jdk.internal.joptsimple.internal.Strings;

class Test15 {
	public static void main(String[] arg) {
		LinkedList<Integer> a1 = new LinkedList<>();
		List<LinkedList<Integer>> a2 = new LinkedList<LinkedList<Integer>>();
		a1.add(1);
		a2.add(a1);
		System.out.print(a2.contains(new LinkedList<>().add(1)));
		
		int[] is = {-1,-2,-3,-4,-5,7,0,1,2,3,4,5};
		int[] is2 = {-1,1};
		int[] is3 = {-2,0,1,1,2};
		List<List<Integer>> a = threeSum4(is3);
		System.out.print(a);
	/*	for (List<Integer> list : a) {
			for (List<Integer> list2 : a) {
				
			}
			System.out.println();
		}*/
		
	}
    public static List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> res = new LinkedList<List<Integer>>();
    	
    	Arrays.sort(nums);
    	int fir = 0,sec = 1,thi = nums.length-1;
    	while(fir<thi&&sec<thi) {
    		if (fir==sec) {
				sec++;
				continue;
			}
    		if (nums[fir]+nums[sec]+nums[thi]==0) {
				List<Integer> tampList = new ArrayList<>();
				tampList.add(nums[fir]);
				tampList.add(nums[sec]);
				tampList.add(nums[thi]);
				res.add(tampList);
				thi--;
				fir++;
			}
    		else if (nums[fir]+nums[sec]+nums[thi]<0) {
				fir++;
    		}
    		else {
				thi--;
			}
    	}
    	return res;
    }
    public static List<List<Integer>> threeSum2(int[] nums) {
    	List<List<Integer>> res = new LinkedList<List<Integer>>();
    	Arrays.sort(nums);
    	int fir = 0,thi = nums.length-1,sec = fir + 1;
    	while(fir<thi) {
    		for (sec = fir + 1; sec < thi; sec++) {
        		if (nums[fir]+nums[sec]+nums[thi]==0) {
    				List<Integer> tampList = new ArrayList<>();
    				tampList.add(nums[fir]);
    				tampList.add(nums[sec]);
    				tampList.add(nums[thi]);
    				res.add(tampList);
    				break;
    			}

			}
    		if (nums[fir]+nums[sec]+nums[thi]<=0) fir++;
    		else thi--;
    	}
    	return res;
    }
    //Aborted
    public static List<List<Integer>> threeSum3(int[] nums) {
    	List<List<Integer>> res = new LinkedList<List<Integer>>();
    	Arrays.sort(nums);
    	int fir = 0,thi = nums.length-1;
    	for (int sec = 1; sec < nums.length-1; sec++) {
    		if (nums[sec]==nums[sec-1]) {
				
			}
			while(fir<sec-1||thi>sec+1) {
				if(fir>0&&nums[fir]==nums[fir-1]) {
					fir++;
					continue;
				}
        		if (nums[fir]+nums[sec]+nums[thi]==0) {
    				List<Integer> tampList = new ArrayList<>();
    				tampList.add(nums[fir]);
    				tampList.add(nums[sec]);
    				tampList.add(nums[thi]);
    				fir++;
    				thi--;
    				res.add(tampList);
    				break;
    			}
        		else if (nums[fir]+nums[sec]+nums[thi]<0) fir++;
        		else thi--;
			}
			fir = 0;
			thi = nums.length-1;
		}
    	
    	return res;
    }
    //这里我们从赋值 的角度调换了fir和sec的意义
    public static List<List<Integer>> threeSum4(int[] nums) {
    	List<List<Integer>> res = new LinkedList<List<Integer>>();
    	Arrays.sort(nums);
    	int fir,thi;
    	for (int sec = 0; sec < nums.length-1; sec++) {
    		if (sec>0&&nums[sec]==nums[sec-1]) continue;
			thi = nums.length-1;
    		fir = sec + 1;
			while(fir<thi) {
				if(fir>sec+1&&nums[fir]==nums[fir-1]) {
					fir++;
					continue;
				}
        		if (nums[fir]+nums[sec]+nums[thi]==0) {
    				List<Integer> tampList = new ArrayList<>();
    				tampList.add(nums[sec]);
    				tampList.add(nums[fir]);
    				tampList.add(nums[thi]);
    				fir++;
    				thi--;
    				res.add(tampList);
    			}
        		else if (nums[fir]+nums[sec]+nums[thi]<0) fir++;
        		else thi--;
			}
		}
    	return res;
    }
}
