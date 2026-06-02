class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length,i=0, j=n-1;
        int max=0,ls=0,rs=0;
        while(i<k) ls+=cardPoints[i++];
        max=ls;
        for(i=k-1;i>=0;i--,j--){
            ls-=cardPoints[i];
            rs+=cardPoints[j];
            max=Math.max(max,ls+rs);
        }
        return max;
    }
}