/*
Problem: https://leetcode.com/problems/contains-duplicate/
Difficulty: Easy
Date Solved: 2025-07-21
*/

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<nums.length; i++){

          if(set.contains(nums[i])){
            return true;
          }

          set.add(nums[i]);

        }

        return false;
       
}
}

/*
 

class Solution {
    public boolean containsDuplicate(int[] nums) {

        boolean isDuplicate = false;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length ; i++){

            if(map.containsKey(nums[i])){
                isDuplicate = true;
            }

            map.put(nums[i], i);
        }

        return isDuplicate;
        
    }
}

*/