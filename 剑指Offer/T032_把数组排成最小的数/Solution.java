package T032_把数组排成最小的数;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        int n ;
        String s = "";
        //Arrays.sort(numbers);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < numbers.length ;i++){
            list.add(numbers[i]);
        }
         
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer str1,Integer str2) {
                // TODO Auto-generated method stub
                String s1 = str1+""+str2;
                String s2 = str2+""+str1;
                int result = s1.compareTo(s2);
                return result;
            }          
        });
         
        for(int j:list){
               s+=j;
        }
         return s;
    }
    
    
    //Solution2
    
    ArrayList<String> ls = new ArrayList<String>();
    public String PrintMinNumber1(int [] numbers) {
         
        getAllSort(numbers,numbers.length,0);
        Collections.sort(ls);
        return (String)ls.get(0);
         
    }
     
    public void getAllSort(int[] numbers,int length , int index){
         
        if (index>=length){
            String str = "";
            for(int i = 0 ; i<length;i++)
                str+=numbers[i];
            ls.add(str);
             
        }
         
        for(int i = index ; i < length ;i++){
            swap(numbers,i,index);
            getAllSort(numbers,length,index+1);
            swap(numbers,i,index);
        }
         
    }
     
    public void swap(int [] numbers, int i , int index){
        int temp = numbers[i];
        numbers[i] = numbers[index];
        numbers[index] = temp;
    }
    
    
    
    
    
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
