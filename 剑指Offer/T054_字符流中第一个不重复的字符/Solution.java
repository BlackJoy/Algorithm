package T054_字符流中第一个不重复的字符;

public class Solution {
	int[] hashtable=new int[256];
    StringBuffer s=new StringBuffer();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        s.append(ch);
        hashtable[ch]++;
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
      char[] str=s.toString().toCharArray();
      for(char c:str)
      {
          if(hashtable[c]==1)
              return c;
      }
      return '#';
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		char res;
		
		s.Insert('g');
		res = s.FirstAppearingOnce();
		System.out.println(res);
		s.Insert('o');
		res = s.FirstAppearingOnce();
		System.out.println(res);
		s.Insert('o');
		res = s.FirstAppearingOnce();
		System.out.println(res);
		s.Insert('g');
		res = s.FirstAppearingOnce();
		System.out.println(res);
		s.Insert('l');
		res = s.FirstAppearingOnce();
		System.out.println(res);
		s.Insert('e');
		res = s.FirstAppearingOnce();
		System.out.println(res);
	
	
	}

}
