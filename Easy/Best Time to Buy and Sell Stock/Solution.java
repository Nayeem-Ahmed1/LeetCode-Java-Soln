/*

Problem: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
Difficulty: Easy
Date Solved: 2025-07-20


Note : Storing the lowest Price as buyPrice.if buyPrice is initialized then profit calculations is ignored.if buyPrice is not being initialized then calculating profit.

 */

class Solution {
    public int maxProfit(int[] prices) {
      
    int buyPrice = Integer.MAX_VALUE;
    
    int profit =0;
    
    int maxProfit = 0;

     
     for(int i =0;i<prices.length;i++){
         
         if(buyPrice > prices[i]){
             
            buyPrice = prices[i];
            
         } else{
            
            profit = prices[i] - buyPrice;
            
            if(profit > maxProfit){
                maxProfit = profit;
            }
         }
         
     }
     
     return maxProfit;
       
    }
}