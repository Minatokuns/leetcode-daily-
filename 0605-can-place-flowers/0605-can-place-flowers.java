class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int prev = 0;
        int next = 0;
        for(int i = 0 ; i<flowerbed.length;i++){
            if(flowerbed[i]!=0)
                continue;
            if(i-1<0)
                prev=0;
            else
                prev=flowerbed[i-1];
            if(i+1>flowerbed.length-1)
                next=0;
            else
                next=flowerbed[i+1];
            if(prev==0 && next==0){
                flowerbed[i]=1;
                n--;
            }
            if(n<1)
                break;
        }
        if(n<1)
                return true;
        return false;
    }
}