class Solution {
    public int findPairs(int[] nums, int k) {
        int cnt=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums) map.put(x,map.getOrDefault(x,0)+1);
        if(k==0){
            for(int key:map.keySet()) if(map.get(key)>=2) cnt++;
        }
        else{
            for(int key:map.keySet()) if(map.containsKey(key+k)) cnt++;
        }
        return cnt;
    }
}