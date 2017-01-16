package T010_矩形覆盖;

public class Solution {
    public int RectCover(int target) {
		
        if(target ==0 )
            return 0;
        else if(target == 1)
            return 1;
        else if(target == 2)
            return 2;
        else return RectCover(target-1) + RectCover(target-2);
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
