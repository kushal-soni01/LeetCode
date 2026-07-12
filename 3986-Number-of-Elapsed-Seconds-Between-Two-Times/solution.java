class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int startHour = Integer.valueOf(startTime.substring(0,2));
        int startMin = Integer.valueOf(startTime.substring(3,5));
        int startSec = Integer.valueOf(startTime.substring(6));

        int endHour = Integer.valueOf(endTime.substring(0,2));
        int endMin = Integer.valueOf(endTime.substring(3,5));
        int endSec = Integer.valueOf(endTime.substring(6));

        return (endHour*3600 + endMin*60 + endSec) - (startHour*3600 + startMin*60 + startSec);
    }
}