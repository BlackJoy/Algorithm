package T412;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	/**
	 * Write a program that outputs the string representation of numbers from 1 to n.
       But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
	 */
	
	//["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBizz"]
	//["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
    public List<String> fizzBuzz(int n) {
    	List<String> ls = new ArrayList();
    	for(int i = 1;i<=n ; i++){
    		if(i%3==0 && i%5==0){
    			ls.add("FizzBizz");
    		}else if(i%5==0){
    			ls.add("Buzz");
    		}else if(i%3==0){
    			ls.add("Fizz");
    		}else
    			ls.add(i+"");
    	}
    	
    	return ls;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		List res = s.fizzBuzz(15);
		System.out.println(res);
	}

}
