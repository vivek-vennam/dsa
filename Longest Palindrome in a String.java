class Solution{
    static String longestPalin(String str){
        // code here
        int n = str.length();
        boolean dp[][] = new boolean [n][n];
        
        // one letter is always a pallendrome
        for(int i=0;i<n;i++)    dp[i][i] = true;
        
        // two letter pallendrome
        for(int i=0;i<n-1;i++){
            if(str.charAt(i) == str.charAt(i+1))    dp[i][i+1] = true;
        }
        
        // three and more letter pallendromes
        
        for(int k=2; k< n;k++){
            int i = 0, j = k;
            
            while(j < n){
                
                if(dp[i+1][j-1] == true && str.charAt(i) == str.charAt(j))  dp[i][j] = true;
                i++;
                j++;
            }
        }
        
        int max = -1;
        int start = -1, end = -1;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(dp[i][j] == true){
                    if(j-i > max){
                        max = j-i;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        
        return str.substring(start,end+1);
        
    }
}
