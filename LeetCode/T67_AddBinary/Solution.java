package T67_AddBinary;

public class Solution {
    
	public String addBinary(String a, String b) {
		
		String res  = "";
		
		int length_a = a.length()-1;
		int length_b = b.length()-1;
		
		int sum = 0;
		int carry = 0;
		
		
		while(length_a>=0 || length_b>=0){
			sum = carry ;
			if(length_a>=0)	sum+=a.charAt(length_a--)-'0';
			if(length_b>=0)	sum+=b.charAt(length_b--)-'0';
			res = sum%2 + res;
			carry = sum/2;
		}
		if(carry!=0) res = "1"+res;
		
		return res;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=  new Solution();
		String res = s.addBinary("1","11");
		
		
		System.out.println(res);
	}

}
