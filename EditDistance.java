class Solution {
    
    public int solve(String s, String t, int ind1, int ind2){
        if(ind1 == s.length() && ind2 == t.length())    return 0;
        if(ind1 == s.length()){
            return t.length()-ind2;
        }
        if(ind2 == t.length()){
            return s.length()-ind1;
        }
        
        if(s.charAt(ind1) == t.charAt(ind2))    return solve(s,t,ind1+1,ind2+1);
        
        return 1 + Integer.min(solve(s,t,ind1+1,ind2),Integer.min(solve(s,t,ind1,ind2+1),solve(s,t,ind1+1,ind2+1)));
    }
    
    public int solveMem(String s, String t , int ind1, int ind2, int dp[][]){
        if(ind1 == s.length() && ind2 == t.length())    return 0;
        if(ind1 == s.length()){
            return t.length()-ind2;
        }
        if(ind2 == t.length()){
            return s.length()-ind1;
        }
        if(dp[ind1][ind2] != -1)    return dp[ind1][ind2];
        if(s.charAt(ind1) == t.charAt(ind2)){
            dp[ind1][ind2] = solveMem(s,t,ind1+1,ind2+1,dp);
        }
        else{
            dp[ind1][ind2] = 1 + Integer.min(solveMem(s,t,ind1+1,ind2,dp),Integer.min(solveMem(s,t,ind1,ind2+1,dp),solveMem(s,t,ind1+1,ind2+1,dp)));
        }
        return dp[ind1][ind2];
    }
    
    public int editDistance(String s, String t) {
        // Code here
        
        int dp[][] = new int[s.length()][t.length()];
        for(int i =0;i<s.length();i++)  Arrays.fill(dp[i],-1);
        return solveMem(s,t,0,0,dp);
    }
}
