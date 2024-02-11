class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        //int res = 0;
        for(int i= 0,j=height.length-1;i<j;){
            int min = Math.min(height[i],height[j]);
            max = Math.max(max,min*(j-i));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}