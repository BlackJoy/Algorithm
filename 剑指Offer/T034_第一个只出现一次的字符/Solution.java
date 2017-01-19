package T034_第一个只出现一次的字符;

public class Solution {
	//题目中的字符也包含小写字母，小写字母ASCII码比大写字母高
	//将数组的长度多加一些
    public int FirstNotRepeatingChar(String str) {
	    char[] c = str.toCharArray();
        int[] a = new int['z'+1];
        for (char d : c)
            a[(int)d ]++;
        for (int i = 0; i < c.length; i++)
            if (a[(int) c[i] ] == 1)
                return i;
        return -1; 	   
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
