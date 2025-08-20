public class ProfitCalculator {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit * 100.0) / costPrice;

        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage+"%");
    }
}
// OUTPUT-The Cost Price is INR 129 and Selling Price is INR 191
// The Profit is INR 62 and the Profit Percentage is 48.062015503875
// The Profit Percentage is approximately 48.06%

