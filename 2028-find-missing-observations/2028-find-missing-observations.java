class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum =0;
        int[] res = new int[n];
        for(int i :rolls){
            sum=sum+i;
        }
        int len = rolls.length+n;
        int tot = (mean*len)-sum;

    if(tot<n)
        return new int[0];
    float val = (float) tot/n;
    if(val>6 || val<=0)
        return new int[0];
    Arrays.fill(res, (int)val);
    int rem = tot-((int)val*n);
    int j=0;
    while(rem>0){
        res[j]=res[j]+1;
        rem--;
        j++;
        j = j%n;
    }
    return res;
    }
    
    
}

