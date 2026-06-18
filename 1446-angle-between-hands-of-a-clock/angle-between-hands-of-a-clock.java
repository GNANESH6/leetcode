class Solution {
    public double angleClock(int hour, int minutes) {
        double minAng=6*minutes;
        double hourAng=30*(hour%12)+0.5*minutes;
        double diff=Math.abs(hourAng-minAng);
        return Math.min(diff, 360-diff);
    }
}