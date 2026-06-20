class Solution {
    public String longestPalindrome(String s) {
        String st="";
        int n=s.length();
        for(int i=0;i<n;i++){
            int l=i, r=i;
            while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
                if(st.length()<r-l+1) st=s.substring(l, r+1);
                l--;
                r++;
            }
            l=i;
            r=i+1;
            while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
                if(st.length()<r-l+1) st=s.substring(l, r+1);
                l--;
                r++;
            }
        }
        return st;
    }
}