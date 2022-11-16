
class Solution
{   
	static int findLongestConseqSubseq(int arr[], int n)
	{
	   // add your code here
	   Set<Integer> set = new HashSet<>();
	   int ans = 1;
	   for(int i=0;i<n;i++) set.add(arr[i]);
	   
	   for(int i=0;i<n;i++){
	       if(!set.contains(arr[i]-1)){
	           int j = arr[i];
	           while(set.contains(j))   j++;
	           ans = Integer.max(ans,j - arr[i]);
	       }
	   }
	   return ans;
	   
	}
}
