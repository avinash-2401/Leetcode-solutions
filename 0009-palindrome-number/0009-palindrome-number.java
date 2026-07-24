class Solution {
    public boolean isPalindrome(int x) {
        int copy =x;
        int answer = 0;

        while(x > 0){
         int    rem = x%10;
            x/=10;

            answer = (answer*10) + rem;

        }
        if(answer == copy) return true;

        else return false;
        
    }
}