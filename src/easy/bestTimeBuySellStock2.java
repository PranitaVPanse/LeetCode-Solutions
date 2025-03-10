package easy;

public class bestTimeBuySellStock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] prices = {7,1,5,3,6,4};			//Expected output = 7 (buy at 1 sell at 5 : 5-1=4 + buy at 3 sell at 6 : 6-3=3. output = 7 
		//int[] prices = {1,2,3,4,5};			//Expected output = 4
		int[] prices = {7,6,4,3,1};				//Expected output = 0 - no positive profit can be earned, hence 0 is the max Profit

		int profit = maxProfit(prices);

		System.out.println("Maximum profit: " +profit);

	}

	//Valley and Peak approach
	private static int maxProfit(int[] prices) {

		int profit = 0;

		for(int i=1; i<prices.length; i++) {

			if(prices[i] > prices[i-1]) {
				profit += prices[i] - prices[i-1];
			}
		}

		return profit;
	}

}
