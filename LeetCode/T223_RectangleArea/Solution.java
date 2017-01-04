package T223_RectangleArea;

public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int areaA = (C-A)*(D-B);
        int areaB = (G-E)*(H-F);
        
        int left = Math.max(A, E);
        int right = Math.min(C, G);
        int top = Math.min(D, H);
        int bottom = Math.max(B, F);
        
        int overlap = 0;
        if(left < right && top > bottom)
        	overlap = (right-left) * (top-bottom);
        
        return areaA+areaB-overlap;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
