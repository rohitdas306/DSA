class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int len=nums.length;
       for(int i=0; i<len; i++){
        if(nums[i]>nums[(i+1)%len]){
            count++;
        }
       }
       if(count>1){
         return false;
       }
       return true;
    }
   
}