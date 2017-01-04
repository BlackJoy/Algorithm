package T88_MergeSortedArray;

public class Solution {
	
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        
            
            int k = m+n-1;
            int i = m-1;
            int j = n-1;
            while(i>=0 && j>=0){
            	
            	if(nums1[i]>nums2[j])
            		nums1[k--] = nums1[i--];
            	else
            		nums1[k--] = nums2[j--];
            	
            }
        	
            while(j>=0)
            	nums1[k--]=nums2[j--];
        
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		s.merge(new int[]{1,2,3,4}, 1, new int[]{1,2,3}, 3);
	}

}
