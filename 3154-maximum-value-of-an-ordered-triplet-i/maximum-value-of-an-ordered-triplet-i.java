class Solution {
    public long maximumTripletValue(int[] nums) {
          int n = nums.length;
        long maxVal = 0;
        
        // Iterate through j as the middle index
        for (int j = 1; j < n - 1; j++) {
            int maxLeft = 0;
            int maxRight = 0;
            
            // Find maxLeft: maximum nums[i] for i < j
            for (int i = 0; i < j; i++) {
                maxLeft = Math.max(maxLeft, nums[i]);
            }
            
            // Find maxRight: maximum nums[k] for k > j
            for (int k = j + 1; k < n; k++) {
                maxRight = Math.max(maxRight, nums[k]);
            }
            
            // Compute the value if (maxLeft - nums[j]) * maxRight is positive
            maxVal = Math.max(maxVal, (long)(maxLeft - nums[j]) * maxRight);
        }
        
        return maxVal;
    }
}