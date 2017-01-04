package T13;

public class Solution {

    public int romanToInt(String s) {
    	String [][] c = {
            	{"-1","I","II","III","IV","V","VI","VII","VIII","IX"},
                {"-1","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
                {"-1","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
                {"-1","M","MM","MMM"}
            };
    	int [][] num = {
    			{0,1,2,3,4,5,6,7,8,9},
    			{0,10,20,30,40,50,60,70,80,90},
    			{0,100,200,300,400,500,600,700,800,900},
    			{0,1000,2000,3000}
    	};
    	
    	int res = 0;
    	
    	while(s!=""){
    		for(int i = 3 ; i>=0 ;i--){
    			
    			int end;
    			
    			if(i==3){
    				for(int j = 3;j>=0 ;j--){
    					if(s.contains(c[i][j])){
    						end = s.compareTo(c[i][j]);
    						s = s.substring(end-1,s.length());
    						res+=num[i][j];
    						System.out.println(end);
    					}
    				}
    			}
    			else{
    				for(int j = 9 ; j>=0 ; j--){
    					if(s.contains(c[i][j])){
    						end = s.compareTo(c[i][j]);
    						s = s.substring(end-1,s.length());
    						res+=num[i][j];
    						System.out.println(end);
    					}
    				}
    			}
    		}
    		
    	}
    	return res;
    }	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.romanToInt("DCXXI"));
	}

}
