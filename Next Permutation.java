
class Solution {

    public void reverse(int nums[], int start, int end){
        while(start < end){
                int data = nums[start];
                nums[start] = nums[end];
                nums[end] = data;
                start++;
                end--;
            }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pos = -1;
        // find decrement from right to left
        for(int i = nums.length-1; i>0; i--){
            if(nums[i-1] < nums[i]){
                pos = i-1;
                break;
            }
        }
        if(pos == -1){
            // reverse
            reverse(nums,0,n-1);
        }
        else{
            // find the just max number
            int ind = -1;
            for(int i=nums.length-1;i>pos;i--){
                if(nums[i] > nums[pos]){
                    ind = i;
                    break;
                }
            }
            
            // swap
            int data = nums[ind];
            nums[ind] = nums[pos];
            nums[pos] = data;
            // reverse
            reverse(nums,pos+1,n-1);

        }
        
    }
}
