package leetcodeQuestions.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LSAllOccurencesRecursion {
    public static void main(String[] args) {
        int[] arr = {1,4,2,3,4,4,5};
        int target = 4;
        System.out.println(allOccurrences(arr, target, 0, new ArrayList<Integer>()).toString());
        System.out.println(allOccurrencesWithoutPassing(arr, target, 0).toString());
    }

    static List<Integer> allOccurrences(int[] arr, int target, int index, List<Integer> ansList) {
        if (index == arr.length) {
            return ansList;
        }
        if (arr[index] == target) {
            ansList.add(index);
        }
        return allOccurrences(arr, target, index+1, ansList);
    }

    static List<Integer> allOccurrencesWithoutPassing(int[] arr, int target, int index) {
        List<Integer> ansList = new ArrayList<>();
        if (index == arr.length) {
            return ansList;
        }
        if (arr[index] == target) {
            ansList.add(index);
        }
        ansList.addAll(allOccurrencesWithoutPassing(arr, target, index+1));
        return ansList;
    }
}
