package T023_二叉搜索树的后序遍历序列;

public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence==null || sequence.length==0) return false;
        
        if(sequence.length<=1) return true;
		int root = sequence[sequence.length-1];
        
		int num1= 0;
		int num2= 0;
		
        boolean flag = false;
        for(int i = 0 ; i < sequence.length-1 ; i++){
        	if(sequence[i]<root && flag == false){
        		num1++;
        	}
        	
        	if(sequence[i]>root ){
        		flag = true;
        		num2++;
        	}
        }
        
        if(num1+num2 == sequence.length-1){
    		int seq1[] = new int[num1];
    		int seq2[] = new int[num2];
    		for(int k = 0 ; k < num1;k++)
    			seq1[k] = sequence[k];
    		for(int k = num1 ; k < sequence.length-1; k++)
    			seq2[k-num1] = sequence[k];
    		VerifySquenceOfBST(seq1);
    		VerifySquenceOfBST(seq2);
    	}else
    		return false;
        
        return true;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
