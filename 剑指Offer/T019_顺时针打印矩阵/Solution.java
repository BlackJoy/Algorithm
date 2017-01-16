package T019_顺时针打印矩阵;

import java.util.ArrayList;

public class Solution {
  	ArrayList ls = new ArrayList();
    public ArrayList<Integer> printMatrix(int [][] matrix) {
    	if (matrix == null || matrix.length <=0 || matrix[0].length <=0)
    		return ls;
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        int start = 0 ;
        while(columns > start * 2 && rows > start * 2){
        	matrix =  PrintMatrixInCircle(matrix , columns , rows , start);
        	++start;
        }
		return ls;
    }
	private int[][] PrintMatrixInCircle(int[][] matrix, int columns, int rows,
			int start) {
		// TODO Auto-generated method stub
		int endX = columns - 1 - start;
		int endY = rows - 1 - start;
		
		for(int i = start ; i <= endX ; ++i){
			int number = matrix[start][i];
			ls.add(number);
		}
		
		if(start < endY)
		for(int i = start+1 ; i <= endY ; ++i){
			int number = matrix[i][endX];
			ls.add(number);
		}
		
		if(start < endX && start < endY)
		for(int i = endX -1 ; i >= start ; --i){
			int number = matrix[endY][i];
			ls.add(number);
		}
		
		if(start < endX && start < endY-1)
		for(int i = endY-1 ; i >= start+1 ; --i){
			int number = matrix[i][start];
			ls.add(number);
		}
		
		return matrix;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
