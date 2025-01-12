class Solution {
    //Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
    public int maxProfit(int[] prices) {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0; i<prices.length;i++){
            if(buyPrice < prices[i]){       //profit then condiction apply
                int profit=prices[i]-buyPrice;  //todays Profit
                maxProfit=Math.max(maxProfit,profit);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
}
/* NOTE:
Day 1: buyPrice = 7, maxProfit = 0
    Day 2: buyPrice = 1 (updated because 1 < 7)
    Day 3: profit = 5 - 1 = 4, maxProfit = 4
    */