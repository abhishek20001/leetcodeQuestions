package leetcodeQuestions.cyclicSort;

class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if (arr[i] != i+1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                }
                else {
                    return arr[i];
                }
            }
            else {
                i++;
            }
        }
        return -1;
    }
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
