class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null|| nums.length<3) return new ArrayList<>();
    //Sort Elemrnts
        Arrays.sort(nums);
    //using Set for not to duplicates Result
        Set<List<Integer>> result=new HashSet<>();

        for(int i=0; i<nums.length-2;i++){ //i
            int left=i+1;                   //j
            int right=nums.length-1;        //k

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
            //Add set and move to others triples
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }else if(sum<0)
                left++;
                else
                right--;
            }
        }
        return new ArrayList<>(result);
    }
}