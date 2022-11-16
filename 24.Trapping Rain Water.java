class Solution{
    static long trappingWater(int arr[], int n) { 
        // Your code here
        
        int left [] = new int[arr.length];
        int right [] = new int[arr.length];
        left[0] = arr[0];
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            left[i] = Integer.max(max,arr[i]);
            max = left[i];
        }
        right[n-1] = arr[n-1];
        max = arr[n-1];
        for(int i = n-2; i>-1;i--){
            right[i] = Integer.max(max,arr[i]);
            max = right[i];
        }
        
        long ans =0;
        for(int i=0;i<arr.length;i++){
            ans += (Integer.min(left[i],right[i]) - arr[i]);
        }
        return ans;
        
    } 
}
