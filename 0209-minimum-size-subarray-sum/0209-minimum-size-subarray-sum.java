class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int answer = Integer.MAX_VALUE; int sum=0; int low=0;

        for(int right=0; right<nums.length; right++){
            sum = sum +nums[right];

            while(sum >= target){
               int length = right-low+1;

               answer = Math.min(answer, length);

               sum -= nums[low];
               low++;   
            
            }
        }
        if(answer == Integer.MAX_VALUE) return 0;
        else return answer;
        
    }
}