package T28_Implement_strStr;

public class Solution {
    public int strStr(String haystack, String needle) {
    	
    	if(haystack.length() < needle.length()) return -1;
    	if(needle==null) return 0;
    	
    	char []  arr1 = haystack.toCharArray();
    	char []  arr2 = needle.toCharArray();
    	
    	for(int i = 0 ;i < arr1.length ; i++){
    		
    		if(arr1[i]==arr2[0]){
    			int j = 0;
    			for(j=0 ; j < arr2.length ; j++){
    				if( i+j<arr1.length  && arr1[i+j]==arr2[j])
    					continue;
    				else
    					break;
    			}
    			if(j>=arr2.length)
    				return i;
    		}
    		
    	}
    	
    	return -1;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.strStr("mississippi",
				"issipi"));
	}

}
