class Solution {
    public int lengthOfLongestSubstring(String s) {
        Boolean[] arr = new Boolean[256];
        Arrays.fill(arr,false);
        int length = 0;
        int max = 0;
        int first = 0;
        int left = 0;
        int right = 0;
        while(left<s.length()&&right<s.length()){
            while(arr[s.charAt(right)]==true){
                arr[s.charAt(left)]=false;;
                length--;
                left++;
            }
            arr[s.charAt(right)]=true;
            length++;
            right++;
            max = Math.max(max,length);
        }
        return max;
    }
}