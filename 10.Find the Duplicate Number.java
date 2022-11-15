
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        set.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(set.contains(nums[i]))   return nums[i];
            else    set.add(nums[i]);
        }
        return 0;
    }
}
