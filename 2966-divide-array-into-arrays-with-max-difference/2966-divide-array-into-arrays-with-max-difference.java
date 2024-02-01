class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int len =  nums.length;
        int row = len/3;
        int j =0;
        int[][] res= new int[row][3];
        for(int i = 2 ;i<len;i=i+3){
            int dif1 = nums[i]-nums[i-1];
            int dif2 = nums[i-1]-nums[i-2];
            int dif3 = nums[i]-nums[i-2];
            if(dif1>k||dif2>k||dif3>k)
                return new int[0][0];
            res[j][0]= nums[i-2];
            res[j][1]= nums[i-1];
            res[j][2]= nums[i];
            j++;
        }
    return res;
    }
}