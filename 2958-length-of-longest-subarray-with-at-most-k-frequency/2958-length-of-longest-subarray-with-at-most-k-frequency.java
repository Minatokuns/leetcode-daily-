class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int ind = 0;
        int max = 0;
        HashMap<Integer,Integer> hm  = new HashMap();
        for(int i = 0; i<nums.length;i++){
             hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
                while(hm.get(nums[i])>k){
                    hm.put(nums[ind],hm.get(nums[ind])-1);
                    ind++;
                }
        
            max =  Math.max(i-ind+1,max);
        }
        return max;
    }
}