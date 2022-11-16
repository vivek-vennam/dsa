class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // transpose
        int data =0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                // swap
                data = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = data;
            }
        }

        for(int i=0;i<n;i++){
            int start =0, end = n-1;
            while(start<end){
                // swap
                data = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = data;
                start++;end--;
            }
        }
    }
}
