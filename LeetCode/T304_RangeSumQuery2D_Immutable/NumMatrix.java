package T304_RangeSumQuery2D_Immutable;

public class NumMatrix {

    int[][] matrix ;
    int[][] temp;
    
    public NumMatrix(int[][] matrix) {
    	if (matrix.length == 0 || matrix[0].length ==0) return ;
        this.matrix = matrix;
        int row = matrix.length+1;
        int col = matrix[0].length+1;
        temp = new int[row][col];
        
        for(int i = 0 ; i < matrix.length ; i++){
        	for(int j = 0 ; j < matrix[0].length ; j++){
        		temp[i+1][j+1] =  temp[i+1][j] + temp[i][j+1] + matrix[i][j] - temp[i][j];
        	}
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
       
    	return temp[row2+1][col2+1] - temp[row1][col2+1] - temp[row2+1][col1] + temp[row1][col1];
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = new int[][]{
				
		};
		
		NumMatrix num = new NumMatrix(arr);
		int res = num.sumRegion(2,1,4,3);
		System.out.println(res);
	}

}
