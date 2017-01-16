package T007_斐波那契数列;

public class Solution {
    public int Fibonacci(int n) {
		
        int arr [] = new int [41];
        
        arr[1] = 1;
        arr[2] = 1;
        if(n<=2)
        	return arr[n];
        for(int i = 3 ; i <= n  ;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
