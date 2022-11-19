
class Solution {
    
    public void swap(char[] original, int ind1, int ind2){
        
        char c = original[ind1];
        original[ind1] = original[ind2];
        original[ind2] = c;
        
    }
    
    public void combinations(char[] original, String ans, int ind, Set<String> output){
        
        if(ans.length() == original.length){
            output.add(ans);
            return;
        }
        
        for(int i= ind; i< original.length;i++){
            swap(original,ind ,i);
            combinations(original,ans+original[ind],ind+1,output);
            swap(original,i,ind);
        }
        
    }
    
    public List<String> find_permutation(String S) {
        // Code here
        Set<String> set = new HashSet<>();
        List<String> ans = new ArrayList<>();
        
        combinations(S.toCharArray(),"", 0,set);
        for(String str : set)   ans.add(str);
        Collections.sort(ans);
        return ans;
        
    }
}
