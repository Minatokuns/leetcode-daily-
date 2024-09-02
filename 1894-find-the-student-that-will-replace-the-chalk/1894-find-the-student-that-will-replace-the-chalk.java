class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int j=0;
        int sum=0;
        for(int i = 0; i<chalk.length;i++)
            sum=sum+chalk[i];
        int remain = k%sum;
        while(remain>=chalk[j]){
            remain = remain-chalk[j];

           // System.out.println(k);
            j= ++j%(chalk.length);
            //System.out.println(j);
        }
        return j;
    }
}