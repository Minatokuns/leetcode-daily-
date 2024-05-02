class Solution {
    public int findMaxK(int[] nums) {
        int res = -1;
        int[] arr = new int[1000+1];
        for(int i = 0 ; i<nums.length;i++){
            int abs = Math.abs(nums[i]);
            if(nums[i]<0){
                if(arr[abs]==1)
                    res =Math.max( abs,res);
            }
            else{
                if(arr[abs]==-1)
                    res =Math.max( abs,res);
            }
             if(nums[i]<0){
            arr[abs]=-1;
             }
             else{
                arr[abs]=1;
             }
        }
        return res;
    }
}