class Solution {
    public boolean isNumber(String s) {
        if (s == null || s.isEmpty()) return false;

        // Regular expression to validate a number
        String regex = "^[+-]?(\\d+(\\.\\d*)?|\\.\\d+)([eE][+-]?\\d+)?$";

        return s.matches(regex);
    }
}