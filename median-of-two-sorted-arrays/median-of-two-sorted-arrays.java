class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int center = (int)Math.round(((double)(nums1.length + nums2.length)) / 2);
        
        boolean even = ((nums1.length + nums2.length) & 1) == 0;
        
        if(even) {
            center++;
        }
        
        int c1 = 0, c2 = 0, last = 0, prev = last;

        for(int i = 0; i < center; i++) {
            prev = last;
            if(nums1.length - 1 < c1 && nums2.length - 1 >= c2) {
                last = nums2[c2];
                c2++;
                continue;
            }
            if(nums2.length - 1 < c2 && nums1.length - 1 >= c1) {
                last = nums1[c1];
                c1++;
                continue;
            }
            if(nums1[c1] <= nums2[c2]) {
                last = nums1[c1];
                c1++;
            } else {
                last = nums2[c2];
                c2++;
            }
        }
        
        if(even) {
            return ((double)(last + prev)) / 2;
        }
        
        return last;
            
    }
}