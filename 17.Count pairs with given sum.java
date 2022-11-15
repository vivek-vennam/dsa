
class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(arr[0],1);
        for(int i=1;i<arr.length;i++){
            if(mp.containsKey(arr[i]))  mp.put(arr[i],mp.get(arr[i])+1);
            else    mp.putIfAbsent(arr[i],1);
        }
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            ans += mp.getOrDefault(k-arr[i],0);
            if(arr[i] == k-arr[i])    ans--;
        }
        return ans/2;
    }
}
