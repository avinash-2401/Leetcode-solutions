class Solution {
    public int longestOnes(int[] nums, int k) {
        //your code goes here
        HashMap<Integer,Integer> map = new HashMap<>();
        int zeroCount=0; int answer=0; int left=0;

        for(int i=0; i<nums.length;i++){

            if(nums[i]==0){
                zeroCount++;
            }

            while(zeroCount>k){
                if(nums[left]==0){
                zeroCount--;
            } 

                left++;
                
            }
            int maxleng = i-left+1;
            answer = Math.max(answer,maxleng);

        }
        return answer;

    }
}