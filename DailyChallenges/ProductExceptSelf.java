class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];
        prefixProduct[0] = 1;
        suffixProduct[nums.length - 1] = 1;
        for (int index = 1; index < nums.length ; index++) {
            prefixProduct[index] = prefixProduct[index-1]*nums[index-1];
        }
        for (int index2 = nums.length-2;index2>=0;index2--){
            suffixProduct[index2] = suffixProduct[index2+1]*nums[index2+1];
        }
        int[] ans = new int[nums.length];
        for (int index = 0; index < nums.length ; index++){
            ans[index] = prefixProduct[index]*suffixProduct[index];
        }
        return ans;
    }
}
