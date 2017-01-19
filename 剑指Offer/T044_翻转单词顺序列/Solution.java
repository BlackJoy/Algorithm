package T044_翻转单词顺序列;

public class Solution {
	
    public String ReverseSentence(String str) {
        if(str.length() <= 0 || str.trim().equals("")){
		//要trim()，可能输入多个空格组成的字符串
            return str;
        }
    	String [] arr = str.split(" ");
    	String res = "";
    	int i = 0;
    	for(i = arr.length-1 ; i >0 ;i--)
    		res= res + arr[i]+" ";
    	res = res + arr[i];
    	return res;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
