class Solution {
    public String mergeAlternately(String word1, String word2) {
        int newLen  = word1.length()+ word2.length();
        int biggerLen = word1.length()> word2.length() ? word1.length():word2.length();
      StringBuilder sb = new StringBuilder(newLen);
      char[] word1Arr = word1.toCharArray();
      char[] word2Arr = word2.toCharArray();
      int i = 0;
      while(biggerLen>i){
          if(word1Arr.length>i){
          sb.append(word1Arr[i]);
          }
          if(word2Arr.length>i){
          sb.append(word2Arr[i]);
          }
          i++;
      }
      return sb.toString();
    }
}