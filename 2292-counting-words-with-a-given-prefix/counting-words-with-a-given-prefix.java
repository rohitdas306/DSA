class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(String word : words){ //Iterate over the words array
            if(word.startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}