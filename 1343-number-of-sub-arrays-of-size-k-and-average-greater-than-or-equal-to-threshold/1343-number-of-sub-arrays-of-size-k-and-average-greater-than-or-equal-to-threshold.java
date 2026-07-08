class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
     double sum=0; double avg=0; int count=0;

        for(int right=0 ;right<nums.length; right++){
            sum += nums[right];

            if(right >= k){
                sum = sum-nums[right-k];
            }
            if(right >= k-1){
                avg = sum/k;

                if(avg >= threshold){
                    count++;
                }
            }
        }
        return count;
    }
}