
class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<a.length;i++) set.add(a[i]);
        for(int i=0;i<b.length;i++){
                set.add(b[i]);
            
        }
        return set.size();
    }
    
}
