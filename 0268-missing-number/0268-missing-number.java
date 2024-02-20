class Solution {
    public int missingNumber(int[] nums) {
        int lastValue = nums.length;
        int sumOfValues = (lastValue*(lastValue+1))/2;
        int j = lastValue -1;
        for(int i = 0 ; j>=i;i++){
            if(i==j){
              sumOfValues = sumOfValues - nums[i];
              break;
            }
            sumOfValues = sumOfValues - (nums[i]+ nums[j]);  
            j--;
        }
            return sumOfValues;
    }
}