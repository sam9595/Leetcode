
public class BuySellStockIII {
    public static int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(prices.length == 0)
    		return 0;
        int[] maxdiff = new int[prices.length];
        int max = prices[prices.length-1];
        maxdiff[prices.length - 1 ] = 0;
        for(int i = prices.length - 1 ; i > 0 ; i--){
            max = Math.max(max,prices[i]);
            maxdiff[i-1] = Math.max(maxdiff[i],max - prices[i]);
        }
        int min = prices[0];
        int summax = 0;
        for(int i = 0 ; i < prices.length ;i++){
            if(prices[i] < min)
                min = prices[i];
            summax = Math.max(prices[i] - min + maxdiff[i],summax);
        }
        return summax;
    }
    public static void main(String args[]){
    	int num[] = {1,2,3,4,3,5};
    	int a = maxProfit(num);
    	System.out.println(a);
    }
}
