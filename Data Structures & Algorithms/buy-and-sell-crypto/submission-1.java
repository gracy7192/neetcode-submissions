class Solution {
    public int maxProfit(int[] prices) {
        int maxi=0;
        int low=9999;
        for(int i=0;i<prices.length;i++){
          low=Math.min(low,prices[i]);
          maxi=Math.max(maxi,prices[i]-low);
        }
        return maxi;
    }
}
