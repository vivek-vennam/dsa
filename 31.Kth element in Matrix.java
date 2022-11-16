class Solution
{
	public static int kthSmallest(int[][]mat,int n,int k)
	{
        //code here.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int c =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(c<k){
                    pq.offer(mat[i][j]);
                    c++;
                }
                else if(pq.peek() <= mat[i][j])  break;
                else{
                    pq.poll();
                    pq.offer(mat[i][j]);
                }
            }
        }
        
        return pq.peek();
    }
}
