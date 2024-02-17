package leetcodeQuestions.SubsetQuestions;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    public static void main(String[] args) {
        System.out.println(helper("", "12"));
    }

    static List<String> helper(String p, String up) {
        List<String> ans = new ArrayList<>();
        if (up.isEmpty()) {
            ans.add(p);
            return ans;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit-1)*3;i<digit*3;i++) {
            char ch = (char) ('a'+i);
            ans.addAll(helper(p+ch, up.substring(1)));
        }
        return ans;
    }
}
