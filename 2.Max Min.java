
class Solution
{ 
    public static int findSum(int arr[],int N) 
    {
        //code here
        int min = arr[0], max = arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min)    min = arr[i];
            else{
                if(arr[i] > max)    max = arr[i];
            }
        }
        return (min+max);
        
    }
}
