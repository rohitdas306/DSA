class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // Check if the element exists in the map and the difference between indices is within k
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            // Update the index of the current element in the map
            map.put(nums[i], i);
        }

        return false; 
    }
}