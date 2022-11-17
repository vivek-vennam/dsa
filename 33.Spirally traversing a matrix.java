
class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        int count =0;
        int elements = r*c;
        
        int startRow = 0;
        int startCol = 0;
        int endRow = r-1;
        int endCol = c-1;
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(count < elements){
            
            for(int i= startCol ; i<= endCol; i++){
                ans.add(matrix[startRow][i]);
                count++;
            }
            startRow++;
            if(count == elements)   break;
            for(int i= startRow;i<=endRow;i++){
                ans.add(matrix[i][endCol]);
                count++;
            }
            endCol--;
            if(count == elements)   break;
            for(int i=endCol;i>=startCol;i--){
                ans.add(matrix[endRow][i]);
                count++;
            }
            endRow--;
            if(count == elements)   break;
            for(int i=endRow;i>=startRow;i--){
                ans.add(matrix[i][startCol]);
                count++;
            }
            startCol++;
            
        }
        
        return ans;
    }
}

