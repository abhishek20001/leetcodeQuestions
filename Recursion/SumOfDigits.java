package leetcodeQuestions.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int ans = sumOfDigits(1342);
        System.out.println(ans);
    }

    public static int sumOfDigits(int n) {
        if (n/10 == 0) {
            return n;
        }
        return n%10 + sumOfDigits(n/10);
    }
}
