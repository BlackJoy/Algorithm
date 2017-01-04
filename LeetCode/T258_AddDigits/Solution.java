package T258_AddDigits;

public class Solution {
	int res = 0;
	 public int addDigits(int num) {
	        if(num<10) res = num;
	        else{
	            int sum = 0 ;
	            while(num>0){
	                sum+=num%10;
	                num/=10;
	            }
	            addDigits(sum);
	        }
	        return res;
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		s.addDigits(19);
	}

}
