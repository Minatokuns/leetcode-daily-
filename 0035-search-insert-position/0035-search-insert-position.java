class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len-1;
        int mid= 0;
        if(target<nums[0])
            return 0;
        if(target>nums[len-1])
            return len;
        while(left<=right){
         mid = (left + right)/2;
        if(nums[mid]==target)
            return mid;
        else if(nums[mid]>target)
            right =mid-1;
        else
        left = mid+1;
    }
    //mid = (left + right)/2;
    return left;
    }
}
