package T065_矩阵中的路径;

public class Solution {
	
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
    	if(matrix==null || rows<1 || cols<1 || str==null) return false;
        
        boolean[] visit = new boolean[rows*cols];
        
        int index = 0 ;
        for(int i = 0; i < rows ;i++){
        	
        	//内圈循环是以 列数 为单位 ， 后面定位的时候需要  i*列数+j 在一维的matrix和visit中定位
            for(int j = 0 ; j < cols ; j++){
                
                if( hasPathCore(matrix,rows,cols,str,i,j,0,visit)    )
                	return true;
            }
        }
        
        return false;
    }
    
    public boolean hasPathCore(char [] matrix,int rows,int cols,char[] str,int i,int j,int index,boolean[] visit){
        
        if(  i<0 || j<0 || i>=rows || j>=cols || matrix[i*cols+j]!=str[index] || visit[i*cols+j]   ) return false;
        
        
        visit[i*cols+j] = true;
        //如果有一条路径的字符串跟str相同
        if(index==str.length-1) return true;
        
        index++;
        if(hasPathCore(matrix,rows,cols,str,i-1,j  ,index,visit)||
           hasPathCore(matrix,rows,cols,str,i  ,j+1,index,visit)||
           hasPathCore(matrix,rows,cols,str,i+1,j  ,index,visit)||
           hasPathCore(matrix,rows,cols,str,i  ,j-1,index,visit) )
            return true;
        visit[i*cols+j] = false;
        
        return false;
        
    }

    
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		s.hasPath(new char[]{
			'a','b','c','e','s','f','c','s','a','d','e','e'	
		}, 4, 3, new char[]{
			'b','c','c','c','e','d'	
		});
	}

}
