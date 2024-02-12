package leetcodeQuestions.Recursion;

public class SkipSubstringFromString {
    public static void main(String[] args) {
        System.out.println(removeSubstringFromString("sdfghjtgbdszbunjw", "ghjt", ""));
    }

    static String removeSubstringFromString(String mainStr, String subString, String ans) {
        if (mainStr.length() == 0) {return ans;}
        if (!mainStr.startsWith(subString)) {
            ans += mainStr.charAt(0);
            return removeSubstringFromString(mainStr.substring(1), subString, ans);
        }
        else {
            return removeSubstringFromString(mainStr.substring(subString.length()), subString, ans);
        }
    }
}
