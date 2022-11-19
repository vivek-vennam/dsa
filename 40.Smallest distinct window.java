
class Solution {
    
    public boolean valid(int [] count, boolean[] arr){
        for(int i=0;i<58;i++){
            if(!arr[i] || (arr[i] && count[i]>0))    continue;
            return false;
        }
        return true;
    }
    public int findSubString( String str) {
        // Your code goes here
        boolean map[] = new boolean[58];
        for(int i=0;i<str.length();i++) map[str.charAt(i)-'A'] = true;
        
        int ans = str.length();
        
        int min = 0, max =0;
        
        int count [] = new int[58];
        count[str.charAt(min)-'A']++;
        
        while(min < str.length()){
            
            if(valid(count,map)){
                ans = Integer.min(ans,max-min+1);
                count[str.charAt(min)-'A']--;
                min++;
            }
            else{
                if(max == str.length()-1)   break;
                else{
                    max++;
                    count[str.charAt(max)-'A']++;
                }    
            }
        }
        return ans;
        
        
        
    }
}
