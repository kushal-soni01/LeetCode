class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double price = 0;
        int i = prices.length-1, j = discounts.length-1;
        while(i>=0 && j>=0){
            price += prices[i--] * ((100 - discounts[j--])/100.0);
        }
        while(i>=0){
            price += prices[i--];
        }
        return price;
    }
}