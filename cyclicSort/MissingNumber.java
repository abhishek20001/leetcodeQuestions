class MissingNumber {
    public static void main(String[] args) {
        int result = missingNumber(nums);
        return result;
    }
    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }
            else
                i++;
        }
        i = 0;
        while(i < nums.length) {
            if (i == nums[i]) {
                i++;
            }
            else
                return i;
        }
        return nums.length;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}