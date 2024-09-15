class Solution {
    public boolean check(int[] nums) {
        int indMin = 0;
        int min = 101;
       for(int i = 0 ; i<nums.length;i++) {
           if(nums[i]<min){
               min = nums[i];
               indMin = i;
           }
       }
       int  i  = (indMin+1) % nums.length;
       int comp = indMin;
        while(i!=indMin) {
            if(nums[comp]<=nums[i]){
                comp = i;
                i = (i+1)%nums.length;
            }
            else
                return false;
        }
        return true;
    }
}