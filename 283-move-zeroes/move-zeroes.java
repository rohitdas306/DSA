class Solution {
    public void moveZeroes(int[] nums) {
         int j = 0; // Position for next non-zero element
        
        // Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++; 
            }
        }
    }
}