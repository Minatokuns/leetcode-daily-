class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        //int[] con = new int[1001];
        int[] frq = new int[1001];
        int j  = 0;
        for(int i : arr1){
            frq[i]++;
        }
        for(int  i = 0 ; i<arr2.length;i++){
            if(frq[arr2[i]]>0){
                while(frq[arr2[i]]>0){
                    arr1[j++]= arr2[i];
                    frq[arr2[i]]--;
                }
            }
        }
        for(int  i = 0 ; i<1001;i++){
            if(frq[i]>0){
                while(frq[i]>0){
                    arr1[j++]= i;
                    frq[i]--;
                }
            }
        }
        return arr1;
    }
}