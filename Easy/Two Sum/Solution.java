/*  

Problem: https://leetcode.com/problems/two-sum/
Difficulty: Easy
Date Solved: 2025-07-19


Note : Using HashMap to store (Value,Index) from the given array and checking for each element, [Target - current Value] is already there in the HashMap as a Key,If there is a Match We got our Answer; Else puts the (Value,Index) as a new Entry in HashMap;

*/



import java.util.HashMap;

class Solution{
  public int[] twoSum(int[] nums, int target) {

    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i =0;i<nums.length ; i++){

      int temp = target - nums[i];

      if(map.containsKey(temp)){
        return new int[] {map.get(temp),i};
      }

      map.put(nums[i], i);

    }

    return new int[]{0}; 

  }
}



/* 

First Method (Brute-Force) 

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] tempArr = new int[2];
        
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                tempArr[0] = i;
                tempArr[1] = j;
                
                return tempArr;
                }
            }
        }
        
        return tempArr;

    }
}

*/