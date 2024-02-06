class FindDuplicateNumber {
    public static void main(String[] args) {
        return findDuplicate(nums);
    }
    public int findDuplicate(int[] arr) {
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