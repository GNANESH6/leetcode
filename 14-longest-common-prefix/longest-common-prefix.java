class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=200;
        String min="";
        StringBuilder res=new StringBuilder();
        for(String s:strs){
            if(s.length()<n){
                n=s.length();
                min=s;
            }
        }

        for(int i=0;i<n;i++){
            char ch=min.charAt(i);
            for(String s:strs){
                if(s.charAt(i)!=ch) return res.toString();
            }
            res.append(ch);
        }
        return res.toString();
    }
}