class Solution {
    public int maxProfit(int[] prices) {
        // int maxP=0;
        // int minBuy=prices[0];

        // for(int sell:prices){
        //     maxP=Math.max(maxP,sell-minBuy);
        //     minBuy=Math.min(minBuy,sell);
        // }
        // return maxP;

        int l=0;
        int maxP=0;
        for(int r=1;r<prices.length;r++){
            if(prices[l]<prices[r]) { maxP=Math.max(maxP,prices[r]-prices[l]);}
            else{
                l=r;
            }
        }
        return maxP;
    }
}
