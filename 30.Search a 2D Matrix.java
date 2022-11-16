class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i,j;
        for(i=0;i<matrix.length;i++){
            if(matrix[i][0] > target)   break;
        }
        i--;
        if(i>=0){    for(j =0;j<matrix[i].length;j++){
                if(matrix[i][j] == target)  return true;
                if(matrix[i][j] > target)   return false;
            }}
        return false;

    }
}
