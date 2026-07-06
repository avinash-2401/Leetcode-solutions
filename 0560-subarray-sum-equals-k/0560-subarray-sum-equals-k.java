class Solution {
    public int subarraySum(int[] nums, int k) {

     int [] prefix = new int[nums.length];
     prefix[0] = nums[0];
     int count=0;

        for(int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1]+nums[i];
        }

        HashMap<Integer, Integer> map = new HashMap();
        map.put(0,1);

        for(int j=0; j<nums.length; j++){
            
            int val = prefix[j] - k;

            if(map.containsKey(val)) {
                count += map.get(val);
            }
             
             map.put(prefix[j], map.getOrDefault(prefix[j], 0) + 1);
        
            }
            return count;
        }
}   





















    
//      int count=0;
//      int sum=0;   

//         for(int i=0; i<nums.length;i++){
//             sum=0;

//             for(int j=i;j<nums.length;j++){
//                 sum = sum+nums[j];

//                 if(sum==k) count++;
//             }
//         }
//         return count;
//     }
// }