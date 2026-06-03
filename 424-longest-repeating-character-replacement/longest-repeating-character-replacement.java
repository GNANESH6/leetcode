import java.util.Collection;

class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,max=0,n=s.length(),mostfreq=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(;r<n;r++){
            char ch=s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            mostfreq = Math.max(mostfreq, map.get(ch));
            while( (r-l+1-mostfreq)>k){
                char h=s.charAt(l);
                map.put(h,map.getOrDefault(h,0)-1);
                if(map.get(h)==0) map.remove(h);
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    } 
    static int mostFreq(Collection<Integer> values){
        int mf=0;
        for(Integer v:values) mf=Math.max(mf,v);
        return (int)mf;
    }
}