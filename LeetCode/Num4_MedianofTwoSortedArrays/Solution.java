package Num4_MedianofTwoSortedArrays;

public class Solution {
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 
		 int index_A = 0;
		 int index_B = 0;
		 
		 double num_medium = 0;
		 double num_medium_1 = 0;
		 
		 int medium ;
		 int medium_1;
		 int flag = (nums1.length+nums2.length)%2;
		 if(flag==1){
		     medium  =  (nums1.length+nums2.length)/2+1;
		     
		     while(index_A!= nums1.length && index_B!=nums2.length ){
				 if(nums1[index_A]<=nums2[index_B]){
					 
					 medium--;
					 if(medium==0){ //find the medium;
						 num_medium=nums1[index_A];
					 }index_A++;
				 }else{
					 
					 medium--;
					 if(medium==0){ //find the medium;
						 num_medium=nums2[index_B];
					 }index_B++;
				 }
		     }
		     
		     while(index_A!=nums1.length){
		    	 
		    	 medium--;
		    	 if(medium==0){ //find the medium;
					 num_medium=nums1[index_A];
				 }index_A++;
		     }
		     
		     while(index_B!=nums2.length){
		    	 
		    	 medium--;
		    	 if(medium==0){ //find the medium;
					 num_medium=nums2[index_B];
				 }index_B++;
		     }
		     
		     return num_medium;
		     
		 }else{
			 medium  =  (nums1.length+nums2.length)/2;
			 medium_1  =  (nums1.length+nums2.length)/2+1;
			 
			 while(index_A!= nums1.length && index_B!=nums2.length ){
				 if(nums1[index_A]<=nums2[index_B]){
					 
					 medium--;
					 medium_1--;
					 if(medium==0){ //find the medium;
						 num_medium=nums1[index_A];
					 }
					 if(medium_1==0){ //find the medium;
						 num_medium_1=nums1[index_A];
					 }
					 index_A++;
				 }else{
					 
					 medium--;
					 medium_1--;
					 if(medium==0){ //find the medium;
						 num_medium=nums2[index_B];
					 }
					 if(medium_1==0){ //find the medium;
						 num_medium_1=nums2[index_B];
					 }index_B++;
				 }
		     }
		     
		     while(index_A!=nums1.length){
		    	 
		    	 medium--;
		    	 medium_1--;
		    	 if(medium==0){ //find the medium;
					 num_medium=nums1[index_A];
				 }
		    	 if(medium_1==0){ //find the medium;
					 num_medium_1=nums1[index_A];
				 }index_A++;
		     }
		     
		     while(index_B!=nums2.length){
		    	 
		    	 medium--;
		    	 medium_1--;
		    	 if(medium==0){ //find the medium;
					 num_medium=nums2[index_B];
				 }
		    	 if(medium_1==0){ //find the medium;
					 num_medium_1=nums2[index_B];
				 }index_B++;
		     }
		     
		     
		     
		     return (num_medium+num_medium_1)/2.0;
		 }
		 
	 }
	 
	 public static void main(String[] args){
		 Solution s = new Solution();
		 int num1[]={1,3};
		 int num2[]={2};
		 double res = s.findMedianSortedArrays(num1, num2);
		 System.out.println(res);
	 }
}
