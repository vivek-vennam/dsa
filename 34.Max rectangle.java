class Solution {
    
    
    public int[] leftmin(int[] arr){
        int ans [] = new int[arr.length];
        ans[0] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[st.peek()]){
                ans[i] = st.peek();
            }
            else{
                
                while(!st.empty() && arr[i] <= arr[st.peek()]){
                    st.pop();
                }
                if(st.empty())  ans[i] = -1;
                else    ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    
    
    public int[] rightmin(int [] arr){
        int ans [] = new int[arr.length];
        ans[ans.length-1] = ans.length;
        Stack<Integer> st = new Stack<>();
        st.push(ans.length-1);
        for(int i=ans.length-2;i>=0;i--){
            if(arr[i] > arr[st.peek()]){
                ans[i] = st.peek();
            }
            else{
                
                while(!st.empty() && arr[i] <= arr[st.peek()]){
                    st.pop();
                }
                if(st.empty())  ans[i] = ans.length;
                else    ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    
    public int solve(int arr[]){
        int left[] = leftmin(arr);
        int right[] = rightmin(arr);
        
        int max =0;
        for(int i=0;i<arr.length;i++){
            max = Integer.max(max,(right[i] - left[i] -1 )*arr[i]);
        }
        return max;
    }
    
    
    public int maxArea(int mat[][], int n, int m) {
        // add code here.
        
        int arr[] = new int[m];
        int max =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[j] > 0 && mat[i][j] == 0)    arr[j] = 0;
                else    arr[j]+=mat[i][j];
                // System.out.print(arr[j] + " ");
            }
            max = Integer.max(max,solve(arr));
            // System.out.println();
        }
        
        return max;
    }
}
