public class Solution1 {
    public int maxArea(int[] height) {
        int product = 0;
        int minimumH;

        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                minimumH = (height[i] < height[j])? height[i]:height[j];
                int area = minimumH * (j - i);
                if (area > product) {
                    product = area;
                }
            }
        }
        return product;
    }
}
