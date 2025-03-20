class Solution {
    public int removeElement(int[] nums, int val) {
        int lo = 0;
        int hi = nums.length - 1;
        
        while (lo <= hi) {
            if (nums[lo] == val) {
                nums[lo] = nums[hi--];  
            } else {
                lo++; 
            }
        }
        return lo;
    }
}