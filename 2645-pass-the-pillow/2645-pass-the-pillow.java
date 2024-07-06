class Solution {
    public int passThePillow(int n, int time) {
        int ord = time/(n-1);
        int mod = time%(n-1);
        if(ord%2==0)
            return mod+1;
        else
            return n-mod;
    }
}