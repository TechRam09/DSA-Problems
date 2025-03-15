class Solution {
    public int maxProfit(int[] prices) {
        int max= 0;
        int buyingPrice = Integer.MAX_VALUE;
        //Brute Force
        // for(int i=0;i < prices.length ; i++){
        //     for(int j=i;j < prices.length ; j++){
        //      if( prices[j]>prices[i]){
        //         profit = prices[j] - prices[i];
        //         max = Math.max(max, profit);
        //      }
        // }
        // }

        for(int price: prices){
            if(buyingPrice < price){
                int profit = price - buyingPrice;
                max = Math.max(max,profit);
            }else{
                buyingPrice = price;
            }
        }

        return max;
    }
}