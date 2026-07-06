class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

     HashMap<Integer , Integer> map = new HashMap<>();
      map.put(0,-1);
      int sum=0; int mod=0;

      for(int i=0; i<nums.length; i++){
         sum = sum+nums[i];
          mod = sum%k;
         
         if(map.containsKey(mod)){
            int index = map.get(mod);
            if(i-index >= 2){
             return true;
            }
         
         }
             else map.put(mod,i);   
         
         

      }
      return false;
    } 
}





//         for(int i=0; i<nums.length; i++){
                  
//            int sum = nums[i];

//             for(int j=i+1; j<nums.length;j++){

//                 sum = sum+nums[j];

//                 if(sum % k ==0){
//                    return true;
//                 }
//             }
//         }
//         return false;
        
//     }
// }