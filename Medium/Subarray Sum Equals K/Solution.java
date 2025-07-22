/*

Problem: https://leetcode.com/problems/subarray-sum-equals-k/
Difficulty: Medium
Date Solved: 2025-07-22

Note : Solved using Prefix Sum. main idea subArray(i,j) = PS[j] - PS[i-1] .  used HashMap to Store the newArray[] element value, and frequency . if the value of hashmap matches, count will be increased according to the frequency. also if there is a direct match between newArray element and  the target value, count is increased....

 */



import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {

      HashMap<Integer,Integer> map = new HashMap<>();
        
        int sum = 0;
        int count = 0;
        int[] newArr = new int[nums.length];

        for(int i =0;i<nums.length;i++){
            sum += nums[i];
            newArr[i] = sum;
        }

        for(int j=0;j<nums.length;j++){

          int value = newArr[j] - k ;

          if(map.containsKey(value)){
            count = count + map.get(value);
          }

          if(newArr[j] == k){
            count++;
          }

          map.put(newArr[j],map.getOrDefault(newArr[j], 0) + 1);
        }

        return count;
        
    }
}