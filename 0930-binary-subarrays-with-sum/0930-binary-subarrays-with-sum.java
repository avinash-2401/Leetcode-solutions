class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int left = sum-goal;

            if(map.containsKey(left)){
                count += map.get(left);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
        
    }
}