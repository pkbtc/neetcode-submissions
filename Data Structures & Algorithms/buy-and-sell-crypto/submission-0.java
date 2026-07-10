class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buyPrice=prices[0];
        for(int price:prices){
            if(price<buyPrice){
                buyPrice=price;
            }
            else{
                int currentProfit=price-buyPrice;
                profit=Math.max(currentProfit,profit);
            }
        }
        return profit;
    }
}
