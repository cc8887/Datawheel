package TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Test36 {
	public static void main(String[] arg) {
		char[][] a = {
				  {'5','3','.','.','7','.','.','.','.'},
				  {'6','.','.','1','9','5','.','.','.'},
				  {'.','9','8','.','.','.','.','6','.'},
				  {'8','.','.','.','6','.','.','.','3'},
				  {'4','.','.','8','.','3','.','.','1'},
				  {'7','.','.','.','2','.','.','.','6'},
				  {'.','6','.','.','.','.','2','8','.'},
				  {'.','.','.','4','1','9','.','.','5'},
				  {'.','.','.','.','8','.','.','7','9'}
				};
		char[][] a1 = {
				  {'8','3','.','.','7','.','.','.','.'},
				  {'6','.','.','1','9','5','.','.','.'},
				  {'.','9','8','.','.','.','.','6','.'},
				  {'8','.','.','.','6','.','.','.','3'},
				  {'4','.','.','8','.','3','.','.','1'},
				  {'7','.','.','.','2','.','.','.','6'},
				  {'.','6','.','.','.','.','2','8','.'},
				  {'.','.','.','4','1','9','.','.','5'},
				  {'.','.','.','.','8','.','.','7','9'}
				};
		char[][] a2 = {
				{'.','4','.','.','6','.','.','7','.'},
				{'.','.','3','.','.','.','4','.','.'},
				{'.','.','.','.','.','2','9','.','.'},
				{'.','.','.','4','1','.','.','.','.'},
				{'4','.','.','.','.','.','.','1','.'},
				{'1','.','.','6','.','5','2','3','.'},
				{'8','.','.','.','.','.','8','.','.'},
				{'2','.','9','.','.','.','6','4','3'},
				{'3','8','6','2','.','.','.','.','.'}};
		char[][] a3 = {
				{'.','.','4','.','.','.','6','3','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'5','.','.','.','.','.','.','9','.'},
				{'.','.','.','5','6','.','.','.','.'},
				{'4','.','3','.','.','.','.','.','1'},
				{'.','.','.','7','.','.','.','.','.'},
				{'.','.','.','5','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'}};
		
		//System.out.println(isValidSudoku(a));

		//System.out.println(isValidSudoku(a1));
	//	System.out.println(8/3*3);
		System.out.println(isValidSudoku(a3));
		
	}
    public static boolean isValidSudoku(char[][] board) {
/*    	Map<Integer, Map<Character, Integer>> col = new HashMap<>();
    	Map<Integer, Map<Character, Integer>> row = new HashMap<>();
    	Map<Integer, Map<Character, Integer>> gird = new HashMap<>();*/
    	Map[] col = new Map[9];
    	Map[] row = new Map[9];
    	Map[] gird = new Map[9];
    	for (int i = 0; i < gird.length; i++) {
    		gird[i] = new HashMap<Character,Integer>();
		} 
		for (int i = 0; i < row.length; i++) {
			row[i] = new HashMap<Character,Integer>();
		} 
		for (int i = 0; i < col.length; i++) {
			col[i] = new HashMap<Character,Integer>();
		}
			
    	for (int i = 0; i < 9; i++) {
        	for (int j = 0; j < 9; j++) {
        	//	System.out.println(3*i/3+j/3);
        		if (board[i][j]=='.') continue;
        		
        		if (row[i].containsKey(board[i][j])||
        			col[j].containsKey(board[i][j])||
        			gird[i/3*3+j/3].containsKey(board[i][j])) {
        			
        			return false;
        		}
        		else {
					row[i].put(board[i][j], 1);
					col[j].put(board[i][j], 1);
					gird[i/3*3+j/3].put(board[i][j], 1);
				}
        		
        	}	
		}
    	return true;
        
    }	
}
