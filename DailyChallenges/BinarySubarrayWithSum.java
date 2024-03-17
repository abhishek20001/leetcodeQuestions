class BinarySubarrayWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int result = 0;
        int currentSum = 0;
        int diff = 0;
        for(int num : nums) {
            currentSum += num;
            diff = currentSum - goal;
            if (map.containsKey(diff)) {
                result += map.get(diff);
            }
            if (map.containsKey(currentSum)) {
                map.put(currentSum, 1 + map.get(currentSum));
            } else {
                map.put(currentSum, 1);
                }
        }
        return result;
    }
}
