class Solution {
    public int numTimesAllBlue(int[] flips) {
       int cnt=0, n=flips.length, valSum=0, idxSum=0;
       for(int i=0;i<n;i++){
        valSum+=flips[i];
        idxSum+=i+1;
        if(valSum==idxSum) cnt++;
       } return cnt;
    }
}