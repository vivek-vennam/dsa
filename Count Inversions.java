
class Solution
{
    
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        int n = (int)N-1;
        return merge(arr,0,n);
        
    }
    
    static long merge(long arr[], int st, int end){
        long count = 0;
        if(st >= end )   return 0;
        int mid = st + (end-st)/2;
        count += merge(arr,st,mid);
        count += merge(arr, mid+1, end);
        count += add(arr, st, mid, end);
        
        return count;
    }
    
    static long add(long arr[], int st, int mid , int end){
        
        long count =0;
        long dup [] = new long[end-st+1];
        
        
        int ind1 = st, ind2 = mid+1;
        int ind = 0;
        while(ind1<= mid && ind2<= end){
            if(arr[ind1] <= arr[ind2])   dup[ind++] = arr[ind1++];
            else{
                dup[ind++] = arr[ind2++];
                count += (mid+1 - ind1);
            }
        }
        while(ind1<=mid)    dup[ind++] = arr[ind1++];
        while(ind2<=end)    dup[ind++] = arr[ind2++];
        
        for(int i=0,j = st;i<dup.length;i++){
            arr[j++] = dup[i];
        }
        return count;
    }
    
}
