package T051_构建乘积数组;

public class Solution {
    public int[] multiply(int[] A) {
        int B[] = new int [A.length];
 		int arr1[] = new int[A.length];
        int arr2[] = new int[A.length];
        arr1[0] = 1;
        arr2[A.length-1] = 1;
        for(int i = 1 ; i < A.length ; i++){
            
            arr1[i] = arr1[i-1] * A[i-1];
      
        }
        for(int i = A.length-2 ; i>=0 ; i--)
            arr2[i] = arr2[i+1] * A[i+1];
        
        for(int i = 0 ; i < A.length ; i++){
            B[i] = arr1[i] * arr2[i];
        }
        return B;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
