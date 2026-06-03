class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,n=s.length(),max=0,mostFre=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(;r<n;r++){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            mostFre=Math.max(mostFre,map.get(ch));
            while(r-l+1-mostFre>k){
                char h=s.charAt(l);
                map.put(h,map.getOrDefault(h,0)-1);
                if(map.get(h)==0) map.remove(h);
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}