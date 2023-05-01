package mycode.massiveCort;

public class BestBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7, 3, 5, 3, 1, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;


  /*
   int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {

                if (prices[j] - prices[i] > profit) {
                    profit =  prices[j] - prices[i];
                }
            }
        }
        return profit;
        */
    }
}
