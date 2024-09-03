class Solution {
    public int getLucky(String s, int k) {
        //int[] arr = new int [s.length()];
        String sum="";
        int res=0;
        for(int i =0;i<s.length();i++){

                sum= sum+((s.charAt(i)-'a')+1);
                //System.out.println(sum);
            }
        while(k>0){
            res=0;
            for(int i =0;i<sum.length();i++){
                res=res+sum.charAt(i) - '0';
                //System.out.println(sum.charAt(i) - '0');
            }
            sum =String.valueOf(res);
            k--;
        }
        return res;
    }
    

}

// public class Solution {
//     public int getLucky(String s, int k) {
//         int sum = 0;
        
//         // First, compute the initial sum of positions
//         for (int i = 0; i < s.length(); i++) {
//             sum += s.charAt(i) - 'a' + 1;
//         }
        
//         // Repeat the transformation k-1 times
//         while (k > 1) {
//             // Convert the sum to a string and recalculate the sum of its digits
//             String sumStr = String.valueOf(sum);
//             sum = 0;
//             for (char ch : sumStr.toCharArray()) {
//                 sum += ch - '0';
//             }
//             k--;
//         }
        
//         return sum;
//     }

// }
