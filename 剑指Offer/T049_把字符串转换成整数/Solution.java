package T049_把字符串转换成整数;

import java.util.regex.Pattern;

public class Solution {
    public int StrToInt(String str) {
        if(str==null || str.equals("") )  return 0;
        str = str.trim();
        
        int sum = 0;
        if(str.charAt(0)=='-'){ 
            
            for(int i = 1 ; i < str.length();i++){
                if(str.charAt(i)<'0' || str.charAt(i)>'9')	return 0;
                sum = sum*10 + (int)( str.charAt(i) -'0');
                if(sum>Integer.MAX_VALUE) 
                    return 0;
            }
            sum = -sum;
    	}else if(str.charAt(0)=='+'){
            for(int i = 1 ; i < str.length();i++){
                if(str.charAt(i)<'0' || str.charAt(i)>'9')	return 0;
                sum = sum*10 + (int)( str.charAt(i) -'0');
                if(sum>Integer.MAX_VALUE) 
                    return 0;
            }
        }else{
            for(int i = 0 ; i < str.length();i++){
                if(str.charAt(i)<'0' || str.charAt(i)>'9')	return 0;
                sum = sum*10 + (int)( str.charAt(i) -'0');
                if(sum>Integer.MAX_VALUE) 
                    return 0;
            }
        }
        return sum;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
