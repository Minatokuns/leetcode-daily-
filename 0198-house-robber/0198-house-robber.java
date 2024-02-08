class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        int[] dp= new int[len];
        dp[0] = nums[0];
        if(len>1)
            dp[1] = nums[1];
        if(len>2)
            dp[2] = nums[2]+nums[0];
        for(int  i = 3 ; i<len;i++){
            dp[i] =nums[i]+Math.max(dp[i-3],dp[i-2]);
        }
        if(len>1)
            return Math.max(dp[len-1],dp[len-2]);
        return dp[len-1];
    }
}
