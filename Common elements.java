
class Solution
{
    ArrayList<Integer> getCommons(int a[] , int b[] ,int n1,int n2){
        ArrayList<Integer> al = new ArrayList<>();
        int i =0,j=0;
        while(i<n1 && j < n2){
            if(a[i] == b[j]){
                if(al.size() == 0 || al.get(al.size()-1) != a[i])  al.add(a[i]);
                
                i++;
            }
            else if(a[i] < b[j])    i++;
            else    j++;
        }
        return al;
    }
    ArrayList<Integer> commonElements(int a[], int b[], int c[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> al = getCommons(a,b,n1,n2);
        int[] ans = new int[al.size()];
        for(int i=0;i<al.size();i++){
            ans[i] = al.get(i); 
        }
        return getCommons(ans,c,ans.length,n3);
    }
}
