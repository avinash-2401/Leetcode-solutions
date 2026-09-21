class Solution {
    public int maxProfit(int[] prices) {
    int profit=0;
    int buyDay=prices[0];
    

    for(int i=0; i<prices.length;i++){
        
        if(buyDay<prices[i]){

          int sellDay=prices[i]-buyDay;
            profit=Math.max(profit,sellDay);
            
        }
        else buyDay=prices[i];


    }
        return profit;
    }
}