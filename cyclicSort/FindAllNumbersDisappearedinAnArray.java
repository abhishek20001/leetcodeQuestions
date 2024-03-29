package leetcodeQuestions.cyclicSort;

import java.util.ArrayList;
import java.util.List;

class FindAllNumbersDisappearedinAnArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDisappearedNumbers(nums);
        System.out.println(ans);
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> result = new ArrayList<Integer>();
        int i = 0;
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
                result.add(ind+1);
            }
        }
        return result;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
