package leetcodeQuestions.Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        int ans = countZeroes(320050790, 0);
        System.out.println(ans);
    }
    static int countZeroes(int n, int count) {
        if (n%10 == 0) {
            count += 1;
        }
        if (n/10 == 0) {
            return count;
        }
        count = countZeroes(n/10, count);
        return count;
    }
}
