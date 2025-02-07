class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int crSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
             crSum = Math.max(nums[i], crSum + nums[i]);
            maxSum = Math.max(maxSum, crSum);
        }
        return maxSum;
    }
}