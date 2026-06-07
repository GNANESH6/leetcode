class Solution {
    public int totalWaviness(int num1, int num2) {
        if(num2<100) return 0;
        int cnt=0;
        for(int i=num1;i<=num2;i++){
            String x=""+i;
            int n=x.length()-1;
            for(int j=1;j<n;j++){
                if( (x.charAt(j)>x.charAt(j-1)&&x.charAt(j)>x.charAt(j+1)) || (x.charAt(j)<x.charAt(j-1)&&x.charAt(j)<x.charAt(j+1)) ) cnt++;
            }
        }
        return cnt++;
    }
}