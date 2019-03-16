package TreeNode;

import java.util.List;

public class Test52 {
	public static void main(String[] arg) {
		System.out.println(totalNQueens(4));
	}
    public static int totalNQueens(int n) {
    	int[] tol = new int[1];
    	int[] leDia = new int[2*n-1];
    	int[] rDia = new int[2*n-1];
    	int[] col = new int[n];
    	int[] place = new int[n];
 /*   	for (int i : place) {
			System.out.print(i+",");
		}*/
    	placeOne(0, place, col, rDia, leDia, tol);
    	return tol[0];
    }
    public static void placeOne(int curIndex,int[] place ,int[] col, int[] rDia, int[] leDia ,int[] tol) {
		for (int i = 0; i < place.length; i++) {
			if (curIndex==place.length) {
				tol[0]++;
				return;
			}
			if (col[i]!=1 && rDia[i+curIndex]!=1 && leDia[i-curIndex+place.length-1]!=1) {
				//System.out.println("place one");
				place[curIndex] = i; 
				col[i] = 1;
				rDia[i+curIndex] = 1;
				leDia[i-curIndex+place.length-1] = 1;
				placeOne(curIndex+1, place, col, rDia, leDia, tol);
				col[i] = 0;
				rDia[i+curIndex] = 0;
				leDia[i-curIndex+place.length-1] = 0;
			}
		}
	}
}
