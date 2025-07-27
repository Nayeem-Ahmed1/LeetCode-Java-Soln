/*

Problem: https://leetcode.com/problems/min-stack/
Difficulty: Medium
Date Solved: 2025-07-27

Note : Created 2 Stacks where the main stack always works as a normal stack.But only the minimum that is pushed is stored at minStack.

 */

import java.util.Stack;

public class MinStack {

    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    public MinStack() {
        
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {

        mainStack.push(val);

        if(minStack.empty()){
            minStack.push(val);
        }else {
            int lowest = val < minStack.peek() ? val : minStack.peek();

            minStack.push(lowest);
        }
        
    }
    
    public void pop() {

        mainStack.pop();
        minStack.pop();
        
    }
    
    public int top() {
        
        return mainStack.peek();

    }
    
    public int getMin() {

       return minStack.peek();
        
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
