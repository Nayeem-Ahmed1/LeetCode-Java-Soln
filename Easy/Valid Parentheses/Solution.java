/*

Problem: https://leetcode.com/problems/valid-parentheses
Difficulty: Easy
Date Solved: 2025-07-26


Note : Used Stack Data Structure and Last in First out methology

 */



import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        for( int i = 0 ; i< s.length() ; i++){

            char ch = s.charAt(i);

            if(ch == '('){
               stack.push(')');
            }
            else if(ch == '{'){
                stack.push('}');
            }
            else if(ch == '['){
                stack.push(']');
            }
            else {

                if(stack.empty() || stack.peek() != ch){
                    return false;
                }
                
                stack.pop();
            }           

        }

       boolean isValid = stack.empty();

       return isValid;

    }
}