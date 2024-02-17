package leetcodeQuestions.SubsetQuestions;

public class CountPerms {
    public static void main(String[] args) {
        System.out.println(countPerms("", "abhishek"));
    }

    static int countPerms(String p, String up) {
        int ans = 0;
        if (up.isEmpty()) {
            return 1;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i);
            ans += countPerms(first+ch+second, up.substring(1));
        }
        return ans;
    }
}
