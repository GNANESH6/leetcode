class Solution {
    public String removeDuplicates(String s) {
        char[] ar=new char[s.length()];
        int i=-1;
        for(char ch:s.toCharArray()){
            if(i==-1 || ch!=ar[i]) ar[++i]=ch;
            else if(i>-1) i--;
        }
        return new String(ar,0,i+1);
    }
}