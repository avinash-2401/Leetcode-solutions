class Solution {
    public int subarraysDivByK(int[] nums, int k) {

int[] prefix = new int[nums.length];
prefix[0] = nums[0]; 
int count=0; 

        for(int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        HashMap<Integer , Integer> map = new HashMap();
        map.put(0,1);

        for(int j=0; j<nums.length; j++){
          int  mod = prefix[j]%k;
            if(mod<0){
                mod = mod%k+k;
            }

            if(map.containsKey(mod)){
                count = count+ map.get(mod);
            } 

            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }
        return count;

    }
}