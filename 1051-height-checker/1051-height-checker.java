class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int j=0;
       int[] frq = new int[101];
       for(int i: heights){
        frq[i]++;
       }
       for(int i = 1 ; i<=heights.length;i++){
        while(frq[i]>0){
            if(i!=heights[j])
                count++;
            frq[i]--;
            j++;
        }
       }
       return count;
    }
}