class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum = Integer.MAX_VALUE;
        int currSum = 0 ;
        Arrays.sort(nums);
        for(int  i = 0 ; i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                currSum = nums[i]+nums[left]+nums[right];
                sum = Math.abs(target - currSum) < Math.abs(target - sum) ? currSum:sum;
                if(currSum<target)
                    left++;
                else
                    right--;
            }
        }
        return sum;
    }
}