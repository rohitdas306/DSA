class Solution {
    public String toGoatLatin(String sentence) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder goatWord = new StringBuilder();
            
            if (vowels.contains(word.charAt(0))) {
                goatWord.append(word);
            } else {
                goatWord.append(word.substring(1)).append(word.charAt(0));
            }
            
            goatWord.append("ma");
            for (int j = 0; j <= i; j++) {
                goatWord.append('a');
            }
            
            result.append(goatWord);
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}