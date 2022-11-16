
class Complete{
    
   
    // Function for finding maximum and value pair
    public static int minSwap (int arr[], int n, int k) {
        //Complete the function
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] <= k) count++;
        }
        
        int windowsize= count;
        count = 0;
        int min =Integer.MAX_VALUE;
        int start = 0, end = windowsize-1;
        while(end<n){
            count =0;
            for(int i= start; i<=end;i++){
                if(arr[i] > k)  count++;
            }
            min = Integer.min(min,count);
            start++;end++;
        }
        return min;
        
    }
    
    
}
