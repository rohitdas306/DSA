class Solution {
    public boolean isPowerOfFour(int n) {
        // Base cases
        if (n == 1) return true;  
        if (n <= 0 || n % 4 != 0) return false; 

        // Recursive call
        return isPowerOfFour(n / 4);
    
    }
}