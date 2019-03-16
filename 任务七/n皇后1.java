package TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;



public class Test51 {
	public static void main(String[] arg) {
		List<List<String>> res = solveNQueens(4);
		for (List<String> list : res) {
			for (String string : list) {
				System.out.println(string);
			}
			//System.out.println();
		}
	}
    public static List<List<String>> solveNQueens(int n) {
    	List<List<String>> res = new LinkedList<>();
    	int[] leDia = new int[2*n-1];
    	int[] rDia = new int[2*n-1];
    	int[] col = new int[n];
    	int[] place = new int[n];
 /*   	for (int i : place) {
			System.out.print(i+",");
		}*/
    	placeOne(0, place, col, rDia, leDia, res);
    	return res;
    }
    public static void placeOne(int curIndex,int[] place ,int[] col, int[] rDia, int[] leDia ,List<List<String>> res) {
		for (int i = 0; i < place.length; i++) {
			if (curIndex==place.length) {
				System.out.println("find one");
				res.add(listToString(place));
				return;
			}
			if (col[i]!=1 && rDia[i+curIndex]!=1 && leDia[i-curIndex+place.length-1]!=1) {
				System.out.println("place one");
				place[curIndex] = i; 
				col[i] = 1;
				rDia[i+curIndex] = 1;
				leDia[i-curIndex+place.length-1] = 1;
				placeOne(curIndex+1, place, col, rDia, leDia, res);
				col[i] = 0;
				rDia[i+curIndex] = 0;
				leDia[i-curIndex+place.length-1] = 0;
			}
		}
	}
    public static List<String> listToString(int[] place) {
    	List<String> list = new LinkedList<>();
    	for (int i = 0; i < place.length; i++) {
			char[] tamp = new char[place.length];
			Arrays.fill(tamp, '.');
			tamp[place[i]] = 'Q';
			list.add(String.copyValueOf(tamp));
		}
    	return list;
	}
}
