class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int tc=count(answerKey,'T',k);
        int fc=count(answerKey,'F',k);
        return Math.max(tc,fc);
    }
    
    static int count(String st, char ch, int k){
         int c=0,r=0,l=0,n=st.length(), max=0;
         for(;r<n;r++){
            char cha=st.charAt(r);
            if(ch!=cha) c++;
            while(c>k && l<=r){
                if(st.charAt(l)!=ch) c--;
                l++;
            }
            max=Math.max(max,r-l+1);
         } 
         return max;
    }

}