/*

Problem: https://leetcode.com/problems/maximum-average-subarray-i/
Difficulty: Easy
Date Solved: 2025-07-23


Note : Used Sliding Window algorithm to find max of each windows sized k

*/


class Solution {
    public double findMaxAverage(int[] nums, int k) {

      int initSum = 0;
        
        for(int i =0; i < k ; i++){

          initSum += nums[i];

        }

        int maxSum = initSum;

        int startIndex = 0;  // Sliding Window Start
        int endIndex = k;

        while (endIndex < nums.length) {
          
          initSum -= nums[startIndex];
          
          initSum += nums[endIndex];

          endIndex++;
          startIndex++;

          if(initSum > maxSum){
            maxSum = initSum;
          }

        }

        return (double)maxSum/k;

    }
}