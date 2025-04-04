class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String prev = countAndSay(n - 1);  // Recursive call
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < prev.length()) {
            char currentChar = prev.charAt(i);
            int count = 0;

            // Count consecutive characters
            while (i < prev.length() && prev.charAt(i) == currentChar) {
                count++;
                i++;
            }

            // Append count and character
            result.append(count).append(currentChar);
        }

        return result.toString();
    }
}