import java.util.*;

class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        Arrays.sort(occupiedIntervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = occupiedIntervals[0];
        merged.add(currentInterval);

        for (int i = 1; i < occupiedIntervals.length; i++) {
            int[] nextInterval = occupiedIntervals[i];
            if (currentInterval[1]+1 >= nextInterval[0]) {
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            } else {
                currentInterval = nextInterval;
                merged.add(currentInterval);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int[] interval : merged) {
            int start = interval[0];
            int end = interval[1];

            if (end < freeStart || start > freeEnd) {
                ans.add(Arrays.asList(start, end));
            } 
            else if (start < freeStart && end > freeEnd) {
                ans.add(Arrays.asList(start, freeStart - 1));
                ans.add(Arrays.asList(freeEnd + 1, end));
            } 
            else if (start < freeStart && end <= freeEnd) {
                ans.add(Arrays.asList(start, freeStart - 1));
            } 
            else if (start >= freeStart && end > freeEnd) {
                ans.add(Arrays.asList(freeEnd + 1, end));
            }
        }

        return ans;
    }
}
