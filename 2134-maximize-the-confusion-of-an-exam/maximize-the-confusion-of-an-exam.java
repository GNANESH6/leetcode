class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(count(answerKey, 'T',k),count(answerKey, 'F',k));
    }
    static int count(String s, char ch, int k){
        int l=0,r=0,max=0,n=s.length(),cnt=0;
        for(;r<n;r++){
            if(ch!=s.charAt(r)) cnt++;
            while(cnt>k && l<=r){
                if(s.charAt(l)!=ch) cnt--;
                l++;
            }
            max=Math.max(max,r-l+1);
        } 
        return max;
    }
}