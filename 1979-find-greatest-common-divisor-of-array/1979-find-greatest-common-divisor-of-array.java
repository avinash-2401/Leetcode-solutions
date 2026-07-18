class Solution {
    public int findGCD(int[] nums) {

       Arrays.sort(nums);
       int s = nums[0];
       int l = nums[nums.length-1];

       while(s>0 && l> 0){
          
          if(s>l) s= s%l;
          else l = l%s;




       }
        if(s==0) return l;
         else return s; 
        
    }
}