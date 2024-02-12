class Solution {
    public int majorityElement(int[] nums) {
        int cur = nums[0];
        int count = 0;
        for(int i : nums){
            if(count==0){
                cur=i;
                count++;
            }
            else{
            if(cur==i)
                count++;
            else
                count--;
        }
    }
    return cur;
}
}