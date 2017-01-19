package T048_不用加减乘除做加法;

public class Solution {
    public int Add(int num1,int num2) {
        int n1,n2;
        n1=(num1&num2)<<1;
        n2=num1^num2;
        while( (n1&n2)!=0)
        {
          num1=n1;num2=n2;
          n1=(num1&num2)<<1;
          n2=num1^num2;
        }
        return n1|n2;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
