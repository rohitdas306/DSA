class Solution {
    public int maximumCount(int[] nums) {
        int negCount = findNegativeCount(nums);
        int posCount = nums.length - findPositiveStart(nums);
        return Math.max(negCount, posCount);
    }

    private static int findNegativeCount(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left; // Left is the count of negative numbers
    }

    private static int findPositiveStart(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left; // Left is the index of the first positive number
    }
}