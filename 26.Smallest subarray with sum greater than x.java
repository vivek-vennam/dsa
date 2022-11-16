
class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        // Your code goes here 
        
        int sum = 0, count =0;
        int mincount = Integer.MAX_VALUE;
        int j =0, i =0;
        while(i<n || j < n){
            if(sum <= x){
                if(i == n)  break;
                sum+=a[i++];
            }
            if(sum > x){
                mincount = Integer.min(mincount,i-j);
                sum-=a[j++];
            }
        }
        if(mincount == Integer.MAX_VALUE)   mincount = 0;
        return mincount;
        
    }
}
