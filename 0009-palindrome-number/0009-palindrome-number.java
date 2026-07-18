class Solution {
    public boolean isPalindrome(int n) {
        if(n<0) return false;

        int answer =0;  int copy = n;
        

        while(n >0){
           int rem = n%10;
            n/=10;

            answer = (answer*10) +rem;
        }
        if(answer==copy) return true;

        else return false;
        
    }
}