package T061_序列化二叉树;

public class Solution {
	  String Serialize(TreeNode root) {
		     StringBuilder sb = new StringBuilder();
		     if(root==null){
		         sb.append("#,");
		         return sb.toString();
		     }
		     sb.append(root.val+",");
		     sb.append(Serialize(root.left));
		     sb.append(Serialize(root.right));
		     return sb.toString();
		  }
		  int index = -1;
		  TreeNode Deserialize(String str) {
		     index++;
		     if(index>=str.length()){
		         return null;
		     }
		      
		     String[] arr = str.split(",");
		      
		     TreeNode root = null;
		     if( !arr[index].equals("#") ){
		         root = new TreeNode( Integer.valueOf(arr[index]) );
		         root.left = Deserialize(str);
		         root.right = Deserialize(str);
		     }
		      
		     return root;
		  }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
