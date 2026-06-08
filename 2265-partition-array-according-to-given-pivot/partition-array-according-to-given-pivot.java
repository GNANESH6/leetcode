class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int [] res=new int[nums.length];
        int l=0, r=nums.length-1;
        for(int i=0,j=r; i<nums.length;i++,j--){
            if(nums[i]<pivot) res[l++]=nums[i];
            if(nums[j]>pivot) res[r--]=nums[j];
        }
        while(l<=r) res[l++]=pivot;
        return res;
    }
}