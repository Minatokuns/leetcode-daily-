class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i = 1 ; i<temperatures.length;i++){
            while(st.size()!=0 && temperatures[st.peek()]<temperatures[i]){
                int j = st.pop();
                temperatures[j]=i-j;
            }
                st.push(i);
        }
        while(st.size()!=0){
        temperatures[st.pop()]=0;
        }
        return temperatures;
    }
}