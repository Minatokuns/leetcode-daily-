class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> hm =  new HashMap<>();
        
        for(int i : arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        if(k==0)
            return hm.size();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->hm.get(a)-hm.get(b));
        for(int i : hm.keySet()){
             pq.add(i);
        }
        while(k>0){
            k= k- hm.get(pq.remove());
            if(k<0)
                return pq.size()+1;
        }
         return pq.size();
    }
}