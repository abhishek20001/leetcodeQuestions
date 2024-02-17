package leetcodeQuestions.SubsetQuestions;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(perms("", "abhis", new ArrayList<>()).toString());
    }

    public static List<String> perms(String processed, String unprocessed, List<String> ans) {
        if (unprocessed.isEmpty()) {
            ans.add(processed);
            return ans;
        }
        char ch = unprocessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i);
            perms(first+ch+second, unprocessed.substring(1), ans);
        }
        return ans;
    }
}
