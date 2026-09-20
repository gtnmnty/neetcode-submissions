class MinStack {
    Stack<Integer> curr;
    Stack<Integer> min;

    public MinStack(){
        curr = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val){
        curr.push(val);
        if(min.isEmpty() || min.peek() >= val){
            min.push(val);
        }
    }

    public void pop(){
        int val = curr.pop();
        if(val == min.peek()){
            min.pop();
        }
    }

    public int top(){
        return curr.peek();
    }

    public int getMin(){
        return min.peek();
    }
}
