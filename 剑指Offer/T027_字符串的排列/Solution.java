package T027_字符串的排列;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    ArrayList<String> ls = new ArrayList<String>();
    Set<String> set = new HashSet();
    public ArrayList<String> Permutation(String str) {
       
        char[] arr = str.toCharArray();
        if(str==null || str.length()==0) return ls;
        getAllSorted( arr,str.length() ,0);
        
        Iterator it  = set.iterator();
        while(it.hasNext()){
        	String temp = (String)it.next();
        	ls.add(temp);
        }
        
        Collections.sort(ls);
        return ls;
        
    }
    
    public void getAllSorted(char[] arr,int length , int index ){
        
        if(index>=length){
            String str = "";
            for(int i = 0 ; i<arr.length;i++)
                str+=arr[i];
            
            set.add(str);
        }
        
        for(int i = index ; i < length;i++){
            
            swap(arr,i,index);
            getAllSorted(arr,length,index+1);
            swap(arr,i,index);
        }
        
    }
    
    public void swap(char[] arr,int i , int index){
        char temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
