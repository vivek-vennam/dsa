
class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long max = arr[0], min = arr[0], ans = arr[0];
        
        for(int i=1;i<n;i++){
            long temp = Long.max(Long.max(arr[i],arr[i]*max),arr[i]*min);
            min =  Long.min(Long.min(arr[i],arr[i]*max),arr[i]*min);
            max = temp;
            ans = Long.max(ans,max);
        }
        return ans;
    }
}
