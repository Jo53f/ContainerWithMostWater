public class Solution2 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;

        while (left < right) {
            int minimumH = (height[left] < height[right])? height[left]:height[right];
            area = (area > (minimumH * (right - left)))? area: (minimumH * (right - left));
            if (height[left] > height[right]) {right--;} else {left++;}
        }
        return area;
    }
}
