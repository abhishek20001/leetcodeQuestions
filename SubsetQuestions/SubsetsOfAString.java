package leetcodeQuestions.SubsetQuestions;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfAString {
    public static void main(String[] args) {
        System.out.println(subsetsOfAString(new ArrayList<>(), "", "abhishek").toString());
    }

    static List<String> subsetsOfAString(List<String> ans, String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            if (!processed.isEmpty())
                ans.add(processed);
            return ans;
        }
        subsetsOfAString(ans, processed + unprocessed.charAt(0), unprocessed.substring(1));
        subsetsOfAString(ans, processed, unprocessed.substring(1));
        return ans;
    }
}
