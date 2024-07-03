class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap= new HashMap<>(); 
        int[] ans = new int[2]; 
        int j = 0;
       for(int i=0; i<nums.length; i++){
           if(hmap.containsKey(target-nums[i])){
               ans[j++]=i;
               ans[j]= hmap.get(target-nums[i]);
               break;
           }
           else
               hmap.put(nums[i],i);
           }
          return ans;
       }
       
    }
