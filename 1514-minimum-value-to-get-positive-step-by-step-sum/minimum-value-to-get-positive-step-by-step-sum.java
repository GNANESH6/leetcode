class Solution {
    public int minStartValue(int[] nums) {
        int min=Integer.MAX_VALUE;
        int ps=0;
        for(int x:nums){
            ps+=x;
            min=Math.min(min,ps);
        }
        return (min>0)?1:Math.abs(min)+1;
    }
}