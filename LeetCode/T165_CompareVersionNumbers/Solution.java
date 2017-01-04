package T165_CompareVersionNumbers;

public class Solution {
	
    public int compareVersion(String version1, String version2) {
        String [] ver1 = version1.split("\\.");
        String [] ver2 = version2.split("\\.");
        
        int length = Math.min(ver1.length, ver2.length);
        
        for(int i = 0 ; i < length ; i++){
        	int temp1 = Integer.valueOf(ver1[i]);
        	int temp2 = Integer.valueOf(ver2[i]);
        	if(temp1==temp2) continue;
        	else if(temp1<temp2) return -1;
        	else return 1;
        }
        
        if(ver1.length > length) return 1;
        if(ver2.length > length) return -1;
        
        return  0 ;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int res =s.compareVersion("1", "0");
		System.out.println(res);
	}

}
