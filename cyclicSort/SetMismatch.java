package leetcodeQuestions.cyclicSort;

import java.util.Arrays;

class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {4,3,3,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] arr) {
        int i = 0;
        int missing = -1;
        int duplicate = -1;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else
                i++;
        }
        for(int ind = 0;ind < arr.length ; ind++) {
            if (arr[ind] != ind + 1) {
                duplicate = arr[ind];
                missing = ind+1;
            }
        }
        return new int[] {duplicate, missing};
    }
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
