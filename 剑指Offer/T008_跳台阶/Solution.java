package T008_跳台阶;

public class Solution {
    public int JumpFloor(int target) {
		
        if(target == 1) 
            return 1;
        else if(target == 2)
            return 2;
        else return JumpFloor(target-1)+JumpFloor(target-2);
        
    }
}
