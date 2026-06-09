class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int cnt=0, LC=0, RC=0;
        for(char ch:moves.toCharArray()){
            switch(ch){
                case 'L':LC++; break;
                case 'R':RC++; break;
                default: cnt++;
            }
        }
        return cnt+Math.abs(LC-RC);
    }
}