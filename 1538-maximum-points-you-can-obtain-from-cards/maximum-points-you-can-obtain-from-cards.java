class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int i=0,j=k-1,n=cardPoints.length;
      int ls=0,rs=0, max=0;
      for(;i<k;i++) ls+=  cardPoints[i];
      max=ls;
      i=0;
      while(j>=0){
        ls-=cardPoints[j--];
        if(i==0) i=n-1;
        rs+=cardPoints[i--];
        max=Math.max(max,ls+rs);
      } return max;
    }
}