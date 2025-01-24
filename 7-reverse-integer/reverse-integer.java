class Solution {
    public int reverse(int x) {
        int ans=0;
        while(x!=0){
            // Check for overflow/underflow before updating `ans`
            if (ans > Integer.MAX_VALUE / 10 || ans < Integer.MIN_VALUE / 10) return 0;
             ans= ans*10 + x%10;
             x= x/10;
        }
        return ans;
    }
}