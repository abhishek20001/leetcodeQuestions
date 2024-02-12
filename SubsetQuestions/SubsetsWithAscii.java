package leetcodeQuestions.SubsetQuestions;

import java.util.ArrayList;
import java.util.List;

public class SubsetsWithAscii {
    public static void main(String[] args) {
        System.out.println(subsetsOfAStringAscii(new ArrayList<>(), "", "abcd").toString());
    }

    static List<String> subsetsOfAStringAscii(List<String> ans, String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            if (!processed.isEmpty())
                ans.add(processed);
            return ans;
        }
        subsetsOfAStringAscii(ans, processed + unprocessed.charAt(0), unprocessed.substring(1));
        subsetsOfAStringAscii(ans, processed, unprocessed.substring(1));
        subsetsOfAStringAscii(ans, processed + (unprocessed.charAt(0) + 0), unprocessed.substring(1));
        return ans;
    }
}
