class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int i=0,n=cardPoints.length,j=n-1;
      int ls=0,rs=0, max=0;
      for(i=0;i<k;i++) ls+= cardPoints[i];
      max=ls;
      for(i=k-1;i>=0;i--,j--){
        ls-=cardPoints[i];
        rs+=cardPoints[j];
        max=Math.max(max,ls+rs);
      } return max;
    }
}