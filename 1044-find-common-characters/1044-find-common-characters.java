// class Solution {
//     public List<String> commonChars(String[] words) {
//         HashMap<Character,Integer> fin = new HashMap<>();
        
//          for(int i = 0; i<words[0].length();i++ ){
//              fin.put(words[0].charAt(i),fin.getOrDefault(words[0].charAt(i),0)+1);
//          }
//         for(int i = 1; i<words.length;i++){
//            String s= words[i];
//             HashMap<Character,Integer> temp = new HashMap<>();
//             for(int j = 0; j<s.length();j++){
//              temp.put(s.charAt(j),temp.getOrDefault(s.charAt(j),0)+1);
//          }
//          for(Character key:fin.keySet()){
//              if(temp.containsKey(key)){
//                  fin.put(key,Math.min(fin.get(key),temp.get(key)));
//              }
//              else
//                 fin.remove(key);
//          }
//         }
//         List<String> res = new ArrayList<>();
//         for(Character key:fin.keySet()){
//             for(int i = 0 ; i<fin.get(key);i++)
//                 res.add(key+"");
//         }
//         return res;
//     }
// }
class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character,Integer> fin = new HashMap<>();
        
         for(int i = 0; i<words[0].length();i++ ){
             fin.put(words[0].charAt(i),fin.getOrDefault(words[0].charAt(i),0)+1);
         }
        for(int i = 1; i<words.length;i++){
           String s= words[i];
            HashMap<Character,Integer> temp = new HashMap<>();
            for(int j = 0; j<s.length();j++){
             temp.put(s.charAt(j),temp.getOrDefault(s.charAt(j),0)+1);
         }
         for(Character key:fin.keySet()){
             if(temp.containsKey(key)){
                 fin.put(key,Math.min(fin.get(key),temp.get(key)));
             }
             else
                fin.put(key,0);
         }
        }
        List<String> res = new ArrayList<>();
        for(Character key:fin.keySet()){
             if(fin.get(key)>0){
            for(int i = 0 ; i<fin.get(key);i++)
                res.add(key+"");
             }
        }
        return res;
    }
}