class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> stMin;
    private int min;

    public MinStack() {
        st = new Stack<>();
        stMin = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        st.push(val);
        if (val <= min) {
            min = val;
            stMin.push(min);
        }
    }

    public void pop() {
        int val = st.pop();
        if (val == min) {
            stMin.pop();
            if (!stMin.isEmpty()) {
                min = stMin.peek();
            } else {
                min = Integer.MAX_VALUE;
            }
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        
            return stMin.peek();
        
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */