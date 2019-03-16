
public class Test64 {
	public static void main(String[] args) {
		int[][] a = {{1,3,1},{1,5,1},{4,2,1}};
		System.out.println(minPathSum(a));
	}
    public static int minPathSum(int[][] grid) {
    	if (grid==null) return 0;
		int row = grid.length;
		if (row==0) return 0;
		int col = grid[0].length;
    	int[][] pathNum = new int[row+1][col+1];
    	pathNum[row][col-1] = 0;
    	for (int i = row-1; i >= 0; i--) {
			for (int j = col-1; j >= 0; j--) {
				
				if (j==col-1) {
					pathNum[i][j] = grid[i][j] + pathNum[i+1][j];
				}
				else if (i==row-1) {
					pathNum[i][j] = grid[i][j] + pathNum[i][j+1];
				}
				else {
					pathNum[i][j] = grid[i][j] + (pathNum[i+1][j]>pathNum[i][j+1]? pathNum[i][j+1]:pathNum[i+1][j]);
				}
			}
		}
    	return pathNum[0][0];
    }
}
