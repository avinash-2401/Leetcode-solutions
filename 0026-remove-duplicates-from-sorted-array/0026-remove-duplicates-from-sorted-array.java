class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0; int right=0;

        for(int i=0; i<nums.length; i++){

            if(nums[i]!=nums[right]){
                left++;
                nums[left]=nums[i];
                right++;
            }

        }
        return ++right;
        
        
    }
}