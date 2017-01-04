package T14;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
	       if(strs.length == 0) return "";
	    	
	    	if(strs.length == 1) return strs[0];
	    	
	    	String max_prefix = "";
	    	String prefix = "";
			
			int min_length = Integer.MAX_VALUE;
			int min_strs = 0;
			
			for(int i = 0 ; i < strs.length ; i++){
				if( strs[i].length() < min_length ){
					min_length = strs[i].length();
					min_strs = i;
				}
				
			}
			
			char[] arr = strs[min_strs].toCharArray();
			
			boolean flag = true;
			for(int i = 0 ;i<min_length ; i++){
				max_prefix = prefix;
				
				if(flag == true){
					prefix += arr[i];
					for(int j = 0 ; j<strs.length ; j ++){
						if(strs[j].startsWith(prefix)){
							
							continue;
						}else{
							flag = false;
							prefix = max_prefix;
							break;
						}
					}
		
				}else{
					break;
				}
				
			}
			
			return  prefix ;
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
