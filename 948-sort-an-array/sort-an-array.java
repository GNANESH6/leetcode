class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length<=1) return nums;
        mergeSort(0,nums.length-1, nums);
        return nums;
    }

    static void mergeSort(int l, int r, int[] nums){
        if(l>=r) return;
        int mid=l+(r-l)/2;
        mergeSort(l,mid,nums);
        mergeSort(mid+1,r,nums);
        merge(l,mid,r,nums);
    }

    static void merge(int l, int mid, int r, int[] nums){
        int k=0, i=l, j=mid+1;
        int[] arr=new int[r-l+1];
        while(i<=mid && j<=r){
            if(nums[i]<=nums[j]) arr[k++]=nums[i++];
            else arr[k++]=nums[j++];
        }
        while(i<=mid) arr[k++]=nums[i++];
        while(j<=r) arr[k++]=nums[j++];
        for(i=l,k=0; i<=r;i++) nums[i]=arr[k++];
    }
}