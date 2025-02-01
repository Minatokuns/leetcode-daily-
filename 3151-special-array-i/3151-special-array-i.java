class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1)
            return true;
        
        for(int i=1;i<nums.length;i++){
            int last = nums[i-1];
            int cur=nums[i];
            int l_pari = last%2;
            int c_pari = cur%2;
            if(l_pari==c_pari)
                return false;
        }
        return true;
    }
}