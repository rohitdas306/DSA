class Solution {
    public boolean divideArray(int[] nums) {
         Arrays.sort(nums); //sort Array
        
        for (int i = 0; i < nums.length; i += 2) {  // Check pairs
            if (nums[i] != nums[i + 1]) { // If any pair is different, return false
                return false;
            }
        }
        
        return true;
    }
}