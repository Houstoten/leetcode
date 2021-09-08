class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int start = -1, last = start, res = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > right) {
                start = last = i;
                continue;
            }
            
            if(nums[i] >= left) {
                last = i;
            }
            
            res += (last - start); 
        }
        
        return res;
    }
}