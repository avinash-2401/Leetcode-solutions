class Solution {
    public int subarraysDivByK(int[] nums, int k) {
 
     int prefix[]=new int[nums.length];
     prefix[0] = nums[0];

     for(int i=1;i<nums.length;i++){
        prefix[i] = prefix[i-1]+nums[i];
     }
    int val=0;int answer=0;
    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0,1);

     for(int j=0; j<nums.length;j++){
         
         val = ((prefix[j] % k) + k) % k;
        
        if(map.containsKey(val)){
        answer +=map.get(val);
        
        }
        
        map.put(val,map.getOrDefault(val,0)+1);
     } 

return answer;
        
    }
}