class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hs  =  new HashMap<>();
        List<List<String>> res  =  new ArrayList<>();
        for(String s : strs){
        char[] ch = s.toCharArray();
        //List<String> add  =new ArrayList<>();
        Arrays.sort(ch);
        String keyStr = String.valueOf(ch);
        if(hs.containsKey(keyStr)){
            hs.get(keyStr).add(s);
        }
        else{
            hs.put(keyStr,new ArrayList<>());
            hs.get(keyStr).add(s);
            }
        }
        for(List<String> ls : hs.values())
            res.add(ls);
        return res;
    }
}