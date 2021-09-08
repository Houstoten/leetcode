class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        
        for(int i = 0; i < nums.length; i++) {
            Integer pair = find(nums[i], Arrays.copyOfRange(nums, i + 1, nums.length), target);
            
            if(pair != null) {
                result[0] = i;
                result[1] = pair + i + 1;
                
                return result;
            }
        }
        
        return result;
    }
    
    public Integer find(int first, int[] array, int target) {
        
        for(int i = 0; i< array.length; i++){
            if(target == first + array[i]){
                return i;
            }
        }
        
        return null;
    }
}