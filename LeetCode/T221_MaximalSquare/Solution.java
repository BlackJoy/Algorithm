package T221_MaximalSquare;

public class Solution {
	
   public int maximalSquare(char[][] matrix) {
        
    	if(matrix.length==0||matrix[0].length==0) return 0;
    	
    	int max = 0 ;
    	
    	int length = matrix.length;
    	int width = matrix[0].length;
    	int var = Math.min(length,width);
    	for(int i = 0 ; i < length ; i++){
    		for(int j = 0 ; j < width ; j++){
    			if(matrix[i][j]=='1'){
    			    if(max==0) max =1;
    				for(int k = 0; k<=var ; k++){
    					if(i+k<=length && j+k<=width){
    						int res = jungle(i,j,matrix,k);
    						if(res > max) max =res;
    					}
    				}
    			}
    		}
    	}
    	
    	return max;
    	
    }
	
    public int jungle(int i,int j,char[][]matrix, int var){
    	
    	boolean flag  = true;
    	int res = 0;
    	for(int p = i ; p < i+var ; p ++){
    		for(int q = j ; q < j+var;q++){
    			if(matrix[p][q]=='1' && flag == true)
    				res++;
    			if(matrix[p][q]=='0')
    				return 1;
    		}
    	}
    	return res;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		
		char [][] arr = {
//				{'1','0','1','0','0'},
//				{'1','0','1','1','1'},
//				{'1','1','1','1','1'},
//				{'1','0','0','1','0'},
				{'1','1'},
				{'1','1'}
		};
		
		s.maximalSquare(arr);
		
	}

}
