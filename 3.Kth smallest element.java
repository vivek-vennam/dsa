
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int i;
        for(i=0;i<k;i++)    pq.offer(arr[i]);
        
        while(i<arr.length){
            if(arr[i] < pq.peek()){
                pq.poll();
                pq.offer(arr[i]);
            }
            i++;
        }
        return pq.peek();
    } 
}
