class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        if(coins<costs[0]) return 0;
        int cnt=0;
        for(int x:costs){
            if(coins>0 && coins>=x){
                coins-=x;
                cnt++;
                if(coins==0) return cnt;
            }
        }
        return cnt;
    }
}