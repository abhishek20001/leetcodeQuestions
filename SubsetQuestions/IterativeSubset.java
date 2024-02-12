package leetcodeQuestions.SubsetQuestions;

import java.util.ArrayList;
import java.util.List;

public class IterativeSubset {
    public static void main(String[] args) {

    }
    static List<List<Integer>> iterativeSubset(int[] arr) {
        List<List<Integer>> outerAns = new ArrayList<>();
        for (int num: arr) {
            for (int i = 0; i <outerAns.size();i++) {
                List<Integer> innerAns = new ArrayList<>();
                innerAns.
            }

            outerAns.addAll(innerAns);
        }
        return outerAns;
    }
}
