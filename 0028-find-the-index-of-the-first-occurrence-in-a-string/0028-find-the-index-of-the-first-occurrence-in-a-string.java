class Solution {
    public int strStr(String haystack, String needle) {
        int h = 0;
        int n = 0;
        int res = -1;

        if(haystack.length()<needle.length())
            return res;

        for(h = 0 ; h<haystack.length()- needle.length();h++){
            if(haystack.charAt(h)==needle.charAt(0)){
                res=h;
            for(n = 0 ; n<needle.length();n++){
                
                if(haystack.charAt(h + n)!=needle.charAt(n)){
                    n=0;
                    res=-1;
                    break;
                }
            }
            if(res!=-1)
                return res;
            }
        }
        return res;
    }
}



