class Solution {
    public int tupleSameProduct(int[] nums) {
         Map<Integer, Integer> productCount = new HashMap<>();
        int count = 0;

        // Iterate over all pairs and count occurrences of each product
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];

                // If product already exists, add 8 times its previous count to result
                count += 8 * productCount.getOrDefault(product, 0);

                // Update product count
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }
        return count;
    }
}