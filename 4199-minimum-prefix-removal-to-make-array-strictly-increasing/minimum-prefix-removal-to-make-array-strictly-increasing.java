class Solution {
    public int minimumPrefixLength(int[] nums) {
        int brek=0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]<=nums[i-1]) return i;
        }
        return 0;
    }
}