class MyQueue {
    
    Stack<Integer> inputSt = new Stack<>() ;
    Stack<Integer> outputSt = new Stack<>() ;

    public MyQueue() {
        
    }
    
    public void push(int x) {
        inputSt.push(x) ;
    }
    
    public int pop() {
        if(inputSt.isEmpty() && outputSt.isEmpty()) return -1 ;
        
        moveElements() ;

        return outputSt.pop() ;
    }
    
    public int peek() {
        if(inputSt.isEmpty() && outputSt.isEmpty()) return -1 ;

        moveElements() ;

        return outputSt.peek() ;
    }
    
    public boolean empty() {
        return inputSt.isEmpty() && outputSt.isEmpty() ;
    }

    public void moveElements() {
        if(outputSt.isEmpty()) {
            while(!inputSt.isEmpty()) outputSt.push(inputSt.pop()) ;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */