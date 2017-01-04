package T322_CoinChange;

import java.util.Arrays;

public class Solution {

    public int coinChange(int[] coins, int amount) {
        
    	
    	
        if( amount ==0) return 0;
    	
        Arrays.sort(coins);
        int min = 0 ;
        
        for(int i = coins.length - 1 ; i>=0 ;i--){
        	int num_coin = amount/coins[i];
        	
        	if(i!=0){
	        	if(num_coin>=1){
	        		min+=num_coin;
	        		amount = amount - num_coin*coins[i];
	        	}
        	}
        	if(i==0){
        		int rest = amount%coins[i];
        		if(rest!=0)
        			return -1;
        		else{
        			
        			min+=num_coin;
    	        		
        		}
        	}
        }
        return min;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution s = new Solution();
		int coins[] =  new int[]{2,5,10,1};
		int res =s.coinChange(coins, 27);
		System.out.println(res);
	}

}
