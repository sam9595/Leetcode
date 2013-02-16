
public class WaterContainer {
    public int maxArea(int[] height) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int l_idx = 0;
        int r_idx = height.length - 1;
        int len = r_idx - l_idx;
        int maxarea = len * Math.min(height[l_idx], height[r_idx]); 
        while(l_idx < r_idx){
        	if(height[l_idx] < height[r_idx]){
        		l_idx ++;
        	}
        	else{
        		r_idx --;
        	}
        	len --;
        	if(Math.min(height[l_idx], height[r_idx])*len > maxarea){
        		maxarea = Math.min(height[l_idx], height[r_idx])*len ;
        	}
        }
        return maxarea;
    }
    public static void main(String args[]){
    	WaterContainer w = new WaterContainer();
    	int[] height = {2,3,10,5,7,8,9};
    	int a = w.maxArea(height);
    	System.out.println(a);
    }
}
