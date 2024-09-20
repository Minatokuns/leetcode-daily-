class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i= 0;i<nums.length;i++){
            if(nums[i]<0)
                nums[i]=0;
        }
        int len = nums.length;
        for(int i : nums){
            int ind = Math.abs(i);
            if(ind<=len && ind!=0){
            
                if(nums[ind-1]==0)
                    nums[ind-1] = -ind;
                else
                    nums[ind-1] = -Math.abs(nums[ind-1]);
            }
        }
        for(int i = 0 ; i<len;i++){
            if(!(nums[i]<0))
                return i+1;
        }
        return len+1;
    }
}

// len =  max missing possible 
// 3 4 0 1
// 3 4 -1 1
// 3 4 -3 -1
// -3 4 -3 -1
