class Solution {
    public String reverseWords(String s) {
        String str[]=s.split(" ");
        StringBuilder result=new StringBuilder();
        for (String word : str) {
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse().toString()).append(" ");
        }
        return result.toString().trim();
    }
}