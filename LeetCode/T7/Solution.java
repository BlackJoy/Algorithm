package T7;

public class Solution {

	public int reverse(int x) {
        
		
		StringBuilder sb = new StringBuilder();
		try{
			if(x<0)
				return Integer.valueOf("-"+sb.append(Math.abs(x)).reverse().toString()) ;
			else
				return Integer.valueOf(sb.append(Math.abs(x)).reverse().toString()) ;
		}catch(Exception e){
			return 0;
		}

    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int res = s.reverse(1534236469);
		System.out.println(res);
	}

}
