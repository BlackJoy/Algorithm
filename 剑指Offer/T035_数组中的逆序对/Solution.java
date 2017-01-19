package T035_数组中的逆序对;

public class Solution {
    public int InversePairs(int [] array) {
        
        if(array==null || array.length<0) return 0;
        
        int copy[] = new int[array.length];
        for(int i = 0 ; i<array.length;i++)
            copy[i]=array[i];
        
    	int count = InversePairsCore(array,copy,0,array.length-1);
        
        return count;
    }
    
    public int InversePairsCore(int[] data,int [] copy,int start,int end){
        if(start==end){
            copy[start] = data[start];
            return 0;
        }
        
        int length = (end-start)/2;
        int left = InversePairsCore(copy,data,start,start+length)%1000000007;
        int right = InversePairsCore(copy,data,start+length+1,end)%1000000007;
        
        // i 初始化为前半段最后一个数字的下标
        int i = start+length;
        // j 初始化为后半段最后一个数字的下标
        int j = end;
        int indexCopy = end;
        int count = 0;
        while(i >= start && j>= start+length+1 ){
            if(	data[i]>data[j]	){
                copy[indexCopy--] = data[i--];
                count += j - start - length;
                if(count>=1000000007)
                    count%=1000000007;
            }else{
                copy[indexCopy--] = data[j--];
            }
        }
        
        for(;i>=start;--i){
            copy[indexCopy--] = data[i];
        }
        
        for(; j >= start+length+1;--j){
            copy[indexCopy--] = data[j];
        }
        
        return (left + right+count)%1000000007;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		s.InversePairs(new int[]{
			1,2,3,4,5,6	
		});
	}

}
