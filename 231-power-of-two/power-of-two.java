class Solution {
    public boolean isPowerOfTwo(int n) {
      if(n==1) return true;
      if(n<=0 || n%2!=0) return false;
    //   while(n%2==0){
    //     n=n/2;
    //     if(n==0 || n==1) return true;
    //   }  
    //   return false;
    return (n&(n-1))==0;
    }
}