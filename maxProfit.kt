class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = Integer.MAX_VALUE
        var maxProfit = 0

        for(price in prices){
            if(price < minPrice) minPrice = price
            else{
                val diff = price-minPrice
                if(diff > maxProfit) maxProfit = diff
            }
        }

        return maxProfit
        
    }
}
