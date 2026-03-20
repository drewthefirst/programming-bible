package com.programmingbible.dsa.slidingwindow;

/*
-QUESTION:
    -You are given an array prices where prices[i] is the price of a given stock on the ith day.
    -You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    -Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.


-INTUITION:
    -Dynamic Sliding Window
    -Buy must happen prior to sell
    -Buy at lowest price -> sell at highest price
    -Return maxProfit or 0

-STEPS:
    -
-VARS:
    -currentPrice - the current element in our array / our selling price
    -maxProfit - value to be returned
    -lowestPrice - initialize to first element in our array -> will be reassigned / our buying price
    -currentProfit - initialize to 0
-FORMULAE:
    -currentProfit = currentPrice - lowestPrice
    -maxProfit = max(currentProfit, maxProfit - currently 0)

-TESTS:
    - [10, 3, 15, 12, 12, 17, 10]
    - day 1: currPrice = 10; currentProfit = 0; lowestPrice = 10; maxProfit = 0;
    - day 2: currPrice = 3 lowestPrice = 3 <- (3 < 10);  currentProfit = 0; maxProfit = 0;
    - day 3: currPrice = 15 lowestPrice = 3 <- (3 < 15);  currentProfit = 12 <- (15 - 3); maxProfit = 12;
    - day 4: currPrice = 12 lowestPrice = 3 <- (3 < 12);  currentProfit = 9 <- (12 - 3); maxProfit = 9;
    - day 5: currPrice = 12 lowestPrice = 3 <- (3 < 12);  currentProfit = 9 <- (12 - 3); maxProfit = 9;
    - day 6: currPrice = 17 lowestPrice = 3 <- (3 < 17);  currentProfit = 14 <- (17 - 3); maxProfit = 14;
    - day 7: currPrice = 10 lowestPrice = 3 <- (3 < 10);  currentProfit = 7 <- (10 - 3); maxProfit = 14;
 */

public class BestTimeToBuyAndSellStock {


    public int maxProfit(int[] prices){
        //create and init vars
        int maxProfit = 0; int lowestPrice = prices[0]; int currentProfit;

        for (int currentPrice: prices){
            //set lowestPrice
            if(currentPrice <= lowestPrice){
                lowestPrice = currentPrice;
            } else {
                //calculate currentPofit and set maxProfit
                currentProfit = currentPrice - lowestPrice;
                maxProfit = Math.max(currentProfit, maxProfit);
            }
        }
        return maxProfit;
    }
}
