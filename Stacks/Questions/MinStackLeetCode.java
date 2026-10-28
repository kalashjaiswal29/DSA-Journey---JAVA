class MinStack {

    Stack<Long> st ;
    long min = Long.MAX_VALUE;

    public MinStack() {

        st = new Stack<>() ;

        
    }
    
    public void push(int value) {
        long x = (long)value ;
        if(st.size() == 0){
            min = x ;
        }
        if( x < min){
            st.push((2*x)-min) ;
            min = x ;
        }
        else{
            st.push(x) ;
        }

        
    }
    
    public void pop() {

        if(st.peek() < min){
            min = 2*min - st.peek() ;
           
            st.pop() ;

        }
        else st.pop() ;
    }
    
    public int top() {

        if(st.peek() < min) return (int)min ;
        else return st.peek().intValue() ;

        
    }
    
    public int getMin() {
        
        return (int)min ;

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */