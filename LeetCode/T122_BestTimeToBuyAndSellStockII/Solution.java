package T122_BestTimeToBuyAndSellStockII;

public class Solution {

	 public int maxProfit(int[] prices) {
	        
	        int index = 0 ;
	        int low = Integer.MAX_VALUE;
	        int max_profit = 0;
	        int profit = 0;
	        
	        while(index!=prices.length){
	            
	            for(int i = index ; i < prices.length ; i++){
	            
	                if(prices[i]<low){
	                    low = prices[i];
	                    index = i;
	                    
	                }
	                
	                if(prices[i]-low > max_profit){
	                    index = i-1;
	                    max_profit = prices[i]-low;
	                    profit += max_profit;
	                    max_profit=0;
	                    low = Integer.MAX_VALUE;
	                    break;
	                }
	            
	            }
	            index++;
	        
	        }
	        /*
	        for(int i = 0 ; i < prices.length ; i++){
	            
	            if(prices[i]<low){
	                low = prices[i];
	                index = i;
	            }
	            
	            if(prices[i]-low > max_profit){
	                index1 = i;
	                max_profit = prices[i]-low;
	            }
	            
	        }
	        */
	        return profit;
	    }	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		s.maxProfit(new int[]{2,1,2,0,1});
	}

}
