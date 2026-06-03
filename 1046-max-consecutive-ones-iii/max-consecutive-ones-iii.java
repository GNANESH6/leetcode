class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0, l=0,r=0,cnt=0,n=nums.length;
        for(;r<n;r++){
            if(nums[r]==0) cnt++;
            while(cnt>k){
                if(nums[l]==0) cnt--;
                l++;
            }
            max=Math.max(max,r-l+1); 
        }
        return max;
    }
}