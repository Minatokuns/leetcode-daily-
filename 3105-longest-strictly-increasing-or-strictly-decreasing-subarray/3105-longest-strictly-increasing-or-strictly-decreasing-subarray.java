class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int last = nums[0];
        int max =1;
        int lenInc = 1;
        int lenDec = 1;
        if(nums.length==1)
            return 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]>last){
                lenInc++;
                lenDec = 1;
                max = Math.max(lenInc,max);
                }
            else if(nums[i]<last){
                lenDec++;
                lenInc = 1;
                max = Math.max(lenDec,max);
            }
            else{
                lenDec = 1;
                lenInc = 1;
            }
            last=nums[i];
        }
        return max;
    }
}