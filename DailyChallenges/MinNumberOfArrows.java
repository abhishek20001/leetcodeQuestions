package leetcodeQuestions.DailyChallenges;

import java.util.Arrays;

public class MinNumberOfArrows {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int end = points[0][1];
        int numOfArrows = 1;
        for (int index = 1 ; index < points.length;index++) {
            if (points[index][0] > end) {
                numOfArrows+=1;
                end = points[index][1];
            }
        }
        return numOfArrows;
    }
}
