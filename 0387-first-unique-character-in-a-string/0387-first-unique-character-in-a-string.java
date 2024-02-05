class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        int idx = 0;
        
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            
            while (idx <= i && freq[s.charAt(idx) - 'a'] > 1) {
                idx++;
            }
        }
        
        if (idx == s.length()) {
            return -1;
        }
        
        return idx;
    }
}
