class Solution {
    public void rotate(int[] nums, int k) {
        int st=0;int end=nums.length;
        k = k%end;

    revers(nums,st,end-1);
    revers(nums,st,k-1);
    revers(nums,k,end-1);  
        
    }
    void revers(int []nums ,int left, int right){

     while(left<right){
        int temp=nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

        left++; right--;
    }
    
}
}