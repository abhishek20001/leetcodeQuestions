package leetcodeQuestions.Recursion;

public class RemoveLetterFromString {
    public static void main(String[] args) {
        System.out.println(removeLetterFromString("bccd", 'a', ""));
    }

    static String removeLetterFromString(String mainStr, char letter, String ans) {
        if (mainStr.length() == 0) {return ans;}
        if (mainStr.charAt(0) != letter) {
            ans += mainStr.charAt(0);
        }
        return removeLetterFromString(mainStr.substring(1), letter, ans);
    }
}
