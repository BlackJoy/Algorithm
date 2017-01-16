package T001_二维数组中的查找;

public class Solution {
	
    public boolean Find(int target, int [][] array) {
        //压缩查找范围
    	
        if(array[0].length ==0 || array.length == 0 ) {
            return false;
        }
        
        int index_x = 0;
        int index_y = 0;
		for(int i  = 0 ; i<array[0].length ; i ++){
            if(array[array.length-1][i] < target)
                index_y++;
        }
        for(int i = 0 ; i < array.length ;i ++){
            if(array[i][array[0].length-1] < target)
                index_x++;
        }
        
        for(int i = index_x ; i < array.length ; i++){
            for(int j = index_y ; j < array[0].length ; j++){
                if(array[i][j] == target)
                    return true;
            }
        }
        return false;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
