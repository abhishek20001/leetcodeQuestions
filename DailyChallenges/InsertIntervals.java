package leetcodeQuestions.DailyChallenges;

class InsertIntervals {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        if (intervals.length == 0){
            ans.add(newInterval);
            return ans.toArray(new int[ans.size()][]);
        }
        int i = 0;
        int n = intervals.length;
        while(i<n && intervals[i][1] < newInterval[0]) {
            ans.add(intervals[i]);
            i++;
        }        
        //overlapping scenario
        int[] mid = newInterval;
        while(i<n && intervals[i][0] <= newInterval[1]) {
            mid[0] = Math.min(intervals[i][0], mid[0]);
            mid[1] = Math.max(intervals[i][1], mid[1]);
            i++;
        }
        ans.add(mid);
        while(i<n && intervals[i][0] > newInterval[1]) {
            ans.add(intervals[i]);
            i++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
