class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder(s);
        int i = 0, j = s.length() - 1;

        while (i < j) {
            while (i < j && vowels.indexOf(sb.charAt(i)) == -1) i++;
            while (i < j && vowels.indexOf(sb.charAt(j)) == -1) j--;
            if (i < j) {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }
        }
        return sb.toString();
    }
}