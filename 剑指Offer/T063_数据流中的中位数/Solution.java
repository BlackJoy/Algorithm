package T063_数据流中的中位数;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	List ls = new ArrayList();
    
    
    public void Insert(Integer num) {
    	ls.add(Double.valueOf(num));
    }

    public Double GetMedian() {
        Collections.sort(ls);
        
        if(ls.size()%2==1){
            
            return (Double)ls.get(ls.size()/2);
            
        }else{
            
            return ( (Double)ls.get(ls.size()/2-1) + (Double) ls.get(ls.size()/2)  )/2.0;
            
        }
    }


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		s.Insert(5);
		s.GetMedian();
		s.Insert(2);
		s.GetMedian();
		s.Insert(3);
		s.GetMedian();
	}

}
