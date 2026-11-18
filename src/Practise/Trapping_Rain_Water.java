package Practise;

public class Trapping_Rain_Water {
	public static void main(String[] args) {
		int[] height= {0,1,0,2,1,0,1,3,2,1,2,1}; //6
//		int[] height= {4,2,0,3,2,5}; //9
		int left=0,right=height.length-1;
		int leftMax=height[left],rightMax=height[right];
		int res=0; 
		while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                res += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                res += rightMax - height[right];
            }
        }
		System.out.println(res);
	}
}
