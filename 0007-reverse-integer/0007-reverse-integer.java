class Solution {
    public int reverse(int x) {
       boolean negative = false;
       long answer=0;

        if(x<0){
            x=x*(-1);
            negative = true;
        }
    
        while(x>0){

            int rem = x%10;
            x/=10;

            answer=  (answer*10) +rem;
        }
        if(negative){
            answer=answer*(-1);
        }
        if(answer >Integer.MAX_VALUE || answer < Integer.MIN_VALUE){
            return 0;
        }
        return (int)answer;
    }
}