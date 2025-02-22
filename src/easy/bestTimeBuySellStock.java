package easy;

public class bestTimeBuySellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] prices = {7,1,5,3,6,4};			//Expected output = 5
		//int[] prices = {7,6,4,3,1};			//Expected output = 0
		int[] prices = {2,4,1};					//Expected output = 2

		int maxProfit = maxProfit(prices);
		System.out.println("Maximum Profit: " +maxProfit);
	}

	public static int maxProfit(int[] prices) {
		// TODO Auto-generated method stub

		int maxProfit = 0;
		int min = prices[0];
		int profit = 0;

		for(int i=0; i<prices.length; i++) {
			profit = prices[i] - min;

			if(maxProfit < profit) {
				maxProfit = profit;
			}

			if(min > prices[i]) {
				min = prices[i];
			}
		}

		return maxProfit;
	}

}
