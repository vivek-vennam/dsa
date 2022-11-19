
class Sol
{
    
    public static boolean solve(String s, Set <String> set, String word, int ind){
        if(ind >= s.length())   return set.contains(word);
        
        if(set.contains(word)){
            return (solve(s,set,s.charAt(ind)+"",ind+1) || solve(s,set,word+s.charAt(ind),ind+1));
        }
        else    return solve(s,set,word+s.charAt(ind),ind+1);
        
    }
    public static int wordBreak(String s, ArrayList<String> B )
    {
        //code here
        Set<String> set = new HashSet<>();
        
        for(String str : B) set.add(str);
        // String word = s.charAt(0)+"";
        if(solve(s,set,"",0))   return 1;
        return 0;
        
        
        
    }
}
