class Solution{
    static List<Integer> nextPermutation(int n, int arr[]){
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        int ind1 = -1;
        int data = arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(data > arr[i]){
                ind1 = i;
                break;
            }
            data = arr[i];
        }
        if(ind1 == -1) {
            for(int i=n-1;i>=0;i--)  al.add(arr[i]);
            return al;
        }
        data = arr[ind1];
        for(int i=0;i<ind1;i++) al.add(arr[i]);
        
        for(int i = n-1; i> ind1;i--){
            if(arr[i] > data){
                al.add(arr[i]);
                arr[i] = data;
                break;
            }
        }
        for(int i= n-1;i>ind1;i--){
            al.add(arr[i]);
        }
        
        return al;
        
    }
}
