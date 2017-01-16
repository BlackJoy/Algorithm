package T006_旋转数组的最小数字;

public class Solution {
	
	
	
//    public int minNumberInRotateArray(int [] array) {
//        
//        if(array.length == 0 ) return  0;
//        int min1 = array[0];
//        int min2 = 0 ;
//        for(int i = 1 ; i < array.length ; i ++){
//            if(array[i]>=array[i-1])
//                continue;
//            else{
//                min2 = array[i];
//            }
//                
//        }
//        return Math.min(min1,min2);
//    }
	
	
	//二分法
	public int minNumberInRotateArray(int [] array) {
		 
        if(array==null || array.length <= 0)
        	return -1;
        int index1 = 0;
        int index2 = array.length-1;
        int indexMid = index1;
        while(array[index1] >= array[index2]){
        	if(index2-index1 == 1){
        		indexMid = index2;
        		break;
        	}
        	
        	indexMid = (index1 + index2)/2;
        	
        	//如果下标为index1、index2和indexMid指向的三个数字相等，
        	//则只能按顺序查找
        	if(array[index1]==array[index2] && array[indexMid] == array[index1])
        		return MinInOrder(array,index1,index2);
        	if(array[indexMid] >= array[index1])
        		index1 = indexMid;
        	else if (array[indexMid]<=array[index2])
        		index2 = indexMid;
        }
        return array[indexMid];
    }
	
	int MinInOrder(int[] array ,int index1,int index2){
		int res = array[index1];
		for(int i = index1+1 ;i <= index2 ;++i){
			if(res > array[i])
				res = array[i];
		}
		return res;
	}
}
