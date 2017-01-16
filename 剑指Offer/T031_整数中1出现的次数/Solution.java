package T031_整数中1出现的次数;

public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
    	int count = 0;
        for(int i =1;i<=n ;i++){
            String str = String.valueOf(i);
            for(int j= 0 ;j < str.length();j++){
                if(str.charAt(j)=='1')
                    count++;
            }
        }
        return count;
    }
}
