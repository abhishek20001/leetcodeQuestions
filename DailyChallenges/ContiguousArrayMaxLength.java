package leetcodeQuestions.DailyChallenges;

import java.util.HashMap;

class ContiguousArrayMaxLength {
    public int findMaxLength(int[] nums) {
        for(int ind = 0;ind<nums.length;ind++){
            nums[ind] = (nums[ind] == 0)?-1:1; 
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        for(int index = 0;index < nums.length;index++) {
            sum+=nums[index];
            if(sum == 0){
                maxLength=index+1;
            }
            if (map.containsKey(sum)) {
                if (maxLength < index-map.get(sum)) {
                    maxLength = index-map.get(sum);
                }
            }
            else {
                map.put(sum, index);
            }
        }
        return maxLength;
    }
}
