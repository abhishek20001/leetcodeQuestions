class FindMissingPositive {
    public int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else
                i++;
        }
        for (int ind = 0 ; ind < arr.length ; ind++){
            if (arr[ind] != ind+1) {
                return ind+1;
            }
        }
        return arr.length+1;
    }
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}