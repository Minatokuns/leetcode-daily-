class Solution {
    public int findMaxK(int[] nums) {
     Arrays.sort(nums);
        int neg = 0, pos = nums.length -1;
        while(neg<pos){
        if(nums[neg]==-nums[pos])
            return nums[pos];
        else if(nums[neg]<-nums[pos])
            neg++;
        else
            pos--;
        }
        return -1;
    }
}