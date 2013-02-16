
public class BuySellStock {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(prices.length == 0)
            return 0;
        int max = 0;
        int min = prices[0];
        for(int i = 1 ; i < prices.length ; i++){
            if(prices[i] < min){
                min = prices[i];
                continue;
            }
            if(prices[i] - min > max){
                max = prices[i] - min;
            }
        }
        return max;
    }
}
