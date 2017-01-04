package T8;

public class Solution {

    public int myAtoi(String str) {
        
    	if(str.equals("")||str==null || str.length()==0) return 0;
    	
    	str = str.replace(" ", "");
    	
    	char [] arr = str.toCharArray();
    	str = "";
    	int flag = 0;
    	int flag_0 = 0;
    	for(int i = 0 ; i< arr.length ;i++){
    		if( (arr[i] == '0' && flag == 0) ){
    			arr[i]=' ';
    			
    		}else if(arr[i] == '+' && flag_0 ==0 ){
    		    flag_0 = 1; arr[i]=' ';
    		}else if(arr[i] == '-' && flag_0 ==0){
    		    flag_0 = 2;
    		}else if(flag_0 == 1 && arr[i] == '-'){
    		    return 0;
    		}else if(flag_0 == 2 && arr[i] == '+'){
    		    return 0;
    		}
    		
    		else if(arr[i] <= '9' && arr[i] >'0'){
    		    flag = 1;
    		}else if(arr[i] >='a' && arr[i]<='z'){
    		    break;
    		}else if(flag == 0 && arr[i]==' '){
    		    break;
    		}
    		
    		str+=arr[i];
    	}

    	str = str.replace(" ", "");
    	
    	char zer0 =  (char) str.indexOf(0);
    	try{
    		return Integer.valueOf(str);
    	}catch(Exception e){
    		if(zer0=='-'&& str.length()>1){
	    		return -2147483648;
	    	}
	    	else if(zer0=='+' && str.length()>1)
	    	{
	    		return 2147483647;
	    	}else{
	    	    return 0;
	    	}
    	}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int res = s.myAtoi("    010");
		System.out.println(res);
	}

}
