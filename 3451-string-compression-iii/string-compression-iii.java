class Solution {
    public String compressedString(String word) {
        StringBuilder sb=new StringBuilder();
        char ch= word.charAt(0);
        int cnt=1, n=word.length();
        for(int i=1;i<n;i++){
            if(word.charAt(i)==ch) cnt++;
            else{
                while(cnt>9){
                    cnt-=9;
                    sb.append(9).append(ch);
                }
                sb.append(cnt).append(ch);
                cnt=1;
                ch=word.charAt(i);
            }
        }
        while(cnt>9){
                    cnt-=9;
                    sb.append(9).append(ch);
            }
        sb.append(cnt).append(ch);
        return sb.toString();
    }
}