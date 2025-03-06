class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
         int n = grid.length;
        int totalNumbers = n * n;
        
        // Use a hashmap to count occurrences of each number
        Map<Integer, Integer> countMap = new HashMap<>();
        int repeated = -1, missing = -1;
        
        // Populate the count map
        for (int[] row : grid) {
            for (int num : row) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }
        
        // Find the repeated and missing numbers
        for (int i = 1; i <= totalNumbers; i++) {
            int count = countMap.getOrDefault(i, 0);
            if (count == 2) {
                repeated = i;
            } else if (count == 0) {
                missing = i;
            }
        }
        
        return new int[]{repeated, missing};
    }
}