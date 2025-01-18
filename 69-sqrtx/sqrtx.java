class Solution {
    public int mySqrt(int x) {
       int start=1;
       int end=x;
       int ans=0;
       while(start<=end){
        int mid=(start+end)/2;
        if(mid == x / mid){
            return mid;
        }
        if(mid < x / mid){
            start=mid+1;
            ans=mid;
        }else{
            end=mid-1;
        }
       }
       return ans;
    }
}