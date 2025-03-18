class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left = 0, maxLen = 0, bitMask = 0;

        for (int right = 0; right < nums.length; right++) {
            while ((bitMask & nums[right]) != 0) {  // Conflict detected
                bitMask ^= nums[left];  // Remove leftmost element from the mask
                left++;  // Shrink window
            }
            bitMask |= nums[right];  // Add current element to the bitMask
            maxLen = Math.max(maxLen, right - left + 1);  // Update max length
        }

        return maxLen;
    }
}