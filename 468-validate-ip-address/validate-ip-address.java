class Solution {
    public String validIPAddress(String queryIP) {
        int n=queryIP.length();
        if(n==0 || !(queryIP.contains(".") || queryIP.contains(":")) ) return "Neither";
        if( queryIP.charAt(0)=='.' || queryIP.charAt(n-1)=='.' || queryIP.charAt(0)==':' || queryIP.charAt(n-1)==':' ) return "Neither";

        String[] st=queryIP.split("\\.");
        if(st.length==4){
            for(String s:st){
                int l=s.length();
                if(l==0|| l>3 || (l>1 && s.charAt(0)=='0')) return "Neither";
                for(int i=0;i<l;i++){
                    char ch=s.charAt(i);
                    if(ch>'9'||ch<'0') return "Neither";
                }
                if(Integer.parseInt(s)>255 || Integer.parseInt(s)<0) return "Neither";
            }
            return "IPv4";
        }
        st=queryIP.split(":");
        if(st.length==8){
            for(String s:st){
                int l=s.length();
                if(l>4 || l==0) return "Neither";
                for(int i=0;i<l;i++){
                    char ch=s.charAt(i);
                    if(!(   (ch>='0' && ch<='9') || (ch>='a' && ch<='f') || (ch>='A' && ch<='F') ) ) return "Neither";
                }
            }
            return "IPv6";
        }
        return "Neither";
    }
}