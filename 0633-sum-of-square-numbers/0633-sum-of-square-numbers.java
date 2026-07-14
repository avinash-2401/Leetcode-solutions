class Solution {
    public boolean judgeSquareSum(int c) {

        int left =0; int right = c; int end=0;
        if(c==1) return true;

        while(left<=right){
        int mid = left + (right-left)/2;
        long sq = 1L*mid*mid;

        if(sq <=c){
            end = mid;
            left = mid+1;
        }
        
        else if(sq > c){
            right = mid-1;
        }
 }
   
   int i=0; int j=end;
   while(i<=j){
      long sum = 1L * i * i + 1L * j * j;

    if(sum == c){
        return true;
    }
    else if(sum < c){
        i++;
    }
    else j--;
   }
   return false;
        
    }
}