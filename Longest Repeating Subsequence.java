class Solution
{
    public static int find(String str1,String str2, int ind, int start){
        char ch = str1.charAt(ind);
        for(int i=start; i<str2.length();i++){
            if(str1.charAt(i) == ch && i!= ind) return i;
        }
        return -1;
    }
    
    public static int solve(String str1, String str2, int ind1, int ind2){
        if(ind1 >= str1.length() || ind2 >= str2.length())    return 0;
        
        int n = find(str1,str2,ind1,ind2);
        
        if(n ==-1)  return solve(str1,str2,ind1+1,ind2);
        else{
            // consider
            int val = solve(str1,str2,ind1+1,n+1) + 1;
            
            // donot consider it
            val = Integer.max(val, solve(str1,str2,ind1+1,ind2));
            return val;
        }
    }
    
    public static int solveMem(String str1, String str2, int ind1, int ind2, int dp[][]){
        if(ind1 >= str1.length() || ind2 >= str2.length())    return 0;
        if(dp[ind1][ind2] != -1)    return dp[ind1][ind2];
        int n = find(str1,str2,ind1,ind2);
        
        if(n ==-1)  dp[ind1][ind2] = solveMem(str1,str2,ind1+1,ind2,dp);
        else{
            // consider
            int val = solveMem(str1,str2,ind1+1,n+1,dp) + 1;
            
            // donot consider it
            val = Integer.max(val, solveMem(str1,str2,ind1+1,ind2,dp));
            dp[ind1][ind2] = val;
        }
        return dp[ind1][ind2];
    }
    
    public int LongestRepeatingSubsequence(String str)
    {
        // code here
        // return solve(str,str,0,0);
        
        int dp[][] = new int[str.length()][str.length()];
        for(int i=0;i<str.length();i++)     Arrays.fill(dp[i],-1);
        return solveMem(str,str,0,0,dp);
    }
}
