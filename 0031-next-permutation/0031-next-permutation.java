class Solution {
    public void nextPermutation(int[] nums) {
       
       int pivort=-1; int n = nums.length-1;

        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] <nums[i+1]){
                    pivort = i;
                    break;
            }
        }
           if(pivort != -1){

            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[pivort]){
                    
                    int temp = nums[i];
                     nums[i]=nums[pivort]; 
                       nums[pivort] = temp;
                    break;
                }
            }
           }
            // else{
            //     int left = 0 ;int right=nums.length-1;
            //     while(left<right){
            //         int temp = nums[left];
            //         nums[left] = nums[right];
            //         nums[right] = temp;
            //         left++ ; right--;
            //     }
            //  }




            int left=pivort+1; int right = nums.length-1;
            while(left < right){
                 int temp = nums[left];
                 nums[left] = nums[right];
                 nums[right] = temp;

                 left++; right--;
}
            
           
                  
                     
            
                
        
    }
}