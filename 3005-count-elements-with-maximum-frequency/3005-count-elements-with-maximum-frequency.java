class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] count = new int[101];
        int max = 0;
        int res = 0;
        for(int i : nums){
            count[i]++;
            max =  Math.max(max,count[i]);
        }
        for(int i : count){
            if(i==max)
                res++;
        }
        return res*max;
    }
}