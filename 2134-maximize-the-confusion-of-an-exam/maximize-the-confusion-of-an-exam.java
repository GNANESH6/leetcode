class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(count(answerKey,'T',k),count(answerKey,'F',k));
    }    
    static int count(String st, char ch, int k){
         int c=0,r=0,l=0,n=st.length(), max=0;
         for(;r<n;r++){
            if(ch!=st.charAt(r)) c++;
            while(c>k && l<=r){
                if(st.charAt(l)!=ch) c--;
                l++;
            }
            max=Math.max(max,r-l+1);
         } 
         return max;
    }

}