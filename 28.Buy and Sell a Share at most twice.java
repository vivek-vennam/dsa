class Solution {
    
    public static int solve(int price[], int ind, int allowed, int bought, int[][][] dp){
        
        if(ind>=price.length || allowed>1)    return 0;
        if(dp[ind][allowed][bought] != -1)  return dp[ind][allowed][bought];
        int max =Integer.MIN_VALUE;
        if(bought == 0){
            // buy
            max = Integer.max(max,solve(price,ind+1,allowed,1,dp) - price[ind]);
            // leave
            max = Integer.max(max,solve(price,ind+1,allowed,0,dp));
        }
        else{
            
            // sell
            max = Integer.max(max,solve(price,ind+1,allowed+1,0,dp) + price[ind]);
            // leave
            max = Integer.max(max,solve(price,ind+1,allowed,1,dp));
        }
        dp[ind][allowed][bought] = max;
        return max;
    }
    
    
    public static int solve2(int price[]){
        int dp[][][] = new int[price.length+1][3][3];
        
        for(int ind=price.length-1;ind>-1;ind--){
            for(int allowed=1;allowed>-1;allowed--){
                for(int bought=1;bought>-1;bought--){
                    int max =Integer.MIN_VALUE;
                    if(bought == 0){
                        // buy
                        max = Integer.max(max,dp[ind+1][allowed][1] - price[ind]);
                        // leave
                        max = Integer.max(max,dp[ind+1][allowed][0]);
                    }
                    else{
                        // sell
                        max = Integer.max(max,dp[ind+1][allowed+1][0] + price[ind]);
                        // leave
                        max = Integer.max(max,dp[ind+1][allowed][1]);
                    }
                    dp[ind][allowed][bought] = max;
                    
                }
            }
        }
        return dp[0][0][0];
    }
    
    
    public static int maxProfit(int n, int[] price) {
        // code here
        // int dp[][][] = new int[price.length][2][2];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<2;j++){
        //         for(int k=0;k<2;k++){
        //             dp[i][j][k] = -1;
        //         }
        //     }
        // }
        // return solve(price,0,0,0,dp);
        
        return solve2(price);
    }
}
