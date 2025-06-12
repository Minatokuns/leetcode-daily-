class Solution {
    public int maxAdjacentDistance(int[] nums) {
        
        int max = 0;
        for(int i =1;i<=nums.length-1;i++){
            max = Math.max(Math.abs(nums[i]-nums[i-1]),max);
        }
        max = Math.max(max,Math.abs(nums[nums.length-1]-nums[0]));
        return max;
    }
}