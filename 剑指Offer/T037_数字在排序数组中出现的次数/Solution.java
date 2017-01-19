package T037_数字在排序数组中出现的次数;

public class Solution {
//	 public int GetNumberOfK(int[] array,int k){
//        if(array==null||array.length==0)
//            return 0;
//        int first=getFirstK(array,k,0,array.length-1);
//        int last=getLastK(array,k,0,array.length-1);
//        if(first==-1 ||last==-1){
//            return 0;
//        }
//        else{
//            return last-first+1;
//        }
//         
//    }
//	     
//    public int getFirstK(int[] array,int k,int start,int end){
//        while(start<=end){
//            int mid=(start+end)/2;
//            if(k<array[mid])
//                end=mid-1;
//            else if(k>array[mid])
//                start=mid+1;
//            else{
//                if((mid>0&&array[mid-1]!=k)||mid==0)
//                    return mid;
//                else{
//                    end=mid-1;
//                }
//            }
//        }
//        return -1;
//    }
//     
//    public int getLastK(int[] array,int k ,int start,int end){
//        while(start<=end){
//            int mid=(start+end)/2;
//            if(k<array[mid])
//                end=mid-1;
//            else if(k>array[mid])
//                start=mid+1;
//            else{
//                if((mid<array.length-1&&array[mid+1]!=k)||mid==array.length-1)
//                    return mid;
//                else{
//                    start=mid+1;
//                }
//            }
//        }
//        return -1;
//    }

    public int GetNumberOfK(int [] array , int k) {
    	int i = FindFirstK(array,k,0 , array.length-1);
        int j = FindLastK(array,k,0,array.length-1);
        System.out.println(j-i+1);
        if(i==-1 || j==-1) return 0;
        return j-i+1;
     }
     
     public int FindFirstK(int [] array,int k , int start,int end){
         while(start<=end){
        	 int middle = (start+end)/2;
        	 if(k<array[middle]){
        		 end = middle-1 ;
        	 }else if(k>array[middle]){
        		 start = middle +1;
        	 }else{
        		 if(middle==0 || (array[middle]==k && array[middle-1]!=k)   )
        			 return middle;
        		 else
        			 end = middle-1;
        	 }
         }
         return -1;
     }
            
     public int FindLastK(int [] array,int k , int start,int end){
         while(start<=end){
        	 int middle = (start+end)/2;
        	 if(k<array[middle]){
        		 end = middle-1 ;
        	 }else if(k>array[middle]){
        		 start = middle +1;
        	 }else{
        		 if( middle==array.length-1||(array[middle]==k && array[middle+1]!=k)    )
        			 return middle;
        		 else
        			 start = middle+1;
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
		s.GetNumberOfK(new int[]{
				3,3,3,3,4,5
		}, 3);
	}

}
