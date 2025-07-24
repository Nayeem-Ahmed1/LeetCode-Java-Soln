/*
Problem: https://leetcode.com/problems/valid-palindrome
Difficulty: Easy
Date Solved: 2025-07-24


Note : Solved using 2 pointer approach.
 */

class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();

       boolean isPalin = true;

       int startIndex = 0;
       int endIndex = s.length()-1;

       while(startIndex < endIndex){
        if(s.charAt(startIndex) != s.charAt(endIndex)){
          isPalin = false;       
         }

          startIndex++;
          endIndex--;
       }

       return isPalin;
        
    }
}