

class Solution{
    static int minJumps(int[] nums){
        int n = nums.length;
         if(n==1){

            return 0;

        }

        int jump=1;

        int curjump=nums[0];

        int maxjump=nums[0];

        for(int i=0;i<n-1;i++){

            maxjump=Integer.max(maxjump,i+nums[i]);

            if(curjump==i){

                jump++;

                curjump=maxjump;

            }

        }

        if(curjump<n-1){

            return -1;

        }

        return jump;
    }
}
