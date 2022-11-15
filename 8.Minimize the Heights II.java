
class Solution {
    
    
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        
        if(n <= 1)  return 0;
        Arrays.sort(arr);
        int ans = arr[n-1] - arr[0];
        int min = 0, max = 0;
        for(int i =1 ; i< arr.length;i++){
            if(arr[i] - k < 0)  continue;
            max = Integer.max(arr[n-1]-k, arr[i-1]+k);
            min = Integer.min(arr[0]+k, arr[i]-k);
            ans = Integer.min(ans, max-min);
            
        }
        return ans;
        
        
    }
}
