package T3;

public class Solution {
	 public int lengthOfLongestSubstring(String s) {
		 int max = 0;
		 if(s==null || s.equals(""))
			 return 0;
		 else{
			 char[] arr = s.toCharArray();
			 String temp = "";
			 int length = 0;
			 if(arr.length<2){
			    temp = arr[0]+"";
			    length++;
			    max = 1;
			 }else{
				 int i = 0;
    			 for(i = 0 ;i<arr.length-1;i++){
    			     if(arr[i]!=arr[i+1] && temp.indexOf(arr[i]) == -1){
    			         temp+=arr[i];
    			         length++;
    			         if(length>max)
    			        	 max = length;
    			     }else{
    			         temp = arr[i]+"";
    			         length = 1;
    			         if(length>max)
    			        	 max = length;
    			     }
    			 }
			 }
		 }
		
		 return max;       
     }
}
