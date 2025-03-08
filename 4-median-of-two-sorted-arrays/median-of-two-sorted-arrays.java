class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int[] mergedArray = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).sorted().toArray();
          // Find median
        double median;
        int n = mergedArray.length;

        if (n % 2 == 1) {
            median = mergedArray[n / 2];  // Middle element for odd length
        } else {
            median = (mergedArray[n / 2 - 1] + mergedArray[n / 2]) / 2.0; // Average of middle elements for even length
        }
        return median;
    }
}