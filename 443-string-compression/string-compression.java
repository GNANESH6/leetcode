class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        if(n<=1) return 1;
        
        int cnt=1, i=0,j=1;
        StringBuilder sb=new StringBuilder();
        while(j<n){
            if(chars[i]==chars[j]){
                cnt++;
                j++;
            }
            else{
                sb.append(chars[i]);
                if(cnt>1) sb.append(cnt);
                i=j;
                j++;
                cnt=1;
            }
        }
        sb.append(chars[i]);
        if(cnt>1) sb.append(cnt);

        n=sb.length();
        char temp[]=sb.toString().toCharArray();
        for(int k=0;k<n;k++) chars[k]=temp[k];
        return n;
    }
}