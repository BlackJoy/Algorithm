package T204_CountPrimes;

public class Solution {
    public int countPrimes(int n) {
        if(n <= 2) return 0;
        int count = 0 ;

        for(int i = 2 ;i < n ; i++){
            if(isPrimes(i))
                count++;
        }
        return count;
    }
    
    public boolean isPrimes(int n) {
        int i;
        for(i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n%i == 0) break;
        }
        if(i>Math.sqrt(n)) return true;
        else return false;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		s.countPrimes(5);
	}

}
