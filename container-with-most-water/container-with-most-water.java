class Solution {
public int maxArea(int[] height) {
        int maxArea = 0;

        int first = 0;
        int last = height.length - 1;

        while(first < last) {
            maxArea = Math.max(maxArea, Math.min(height[first], height[last]) * (last - first));

            if(height[first] > height[last]) {
                last--;
            } else{
                first++;
            }
        }

        return maxArea;
    }
}