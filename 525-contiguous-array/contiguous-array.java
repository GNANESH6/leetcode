class Solution {
    public int findMaxLength(int[] nums) {
    int max=0,ps=0,c=0,n=nums.length;
    HashMap<Integer,Integer> map=new HashMap<>();
    map.put(0,-1);
    for(int r=0;r<n;r++){
        int v=nums[r];
        if(v==0) v=-1;
        ps+=v;
        if(map.containsKey(ps)) c=Math.max(c,r-map.get(ps));
        else map.put(ps,r);               
       max=Math.max(max,c); 
    }      
       return max;
    }
}