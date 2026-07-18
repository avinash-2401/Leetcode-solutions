class Solution {
    public int reverse(int num) {
        
        long n = num;
        long answer =0; long rem=0;
        boolean negative = n<0;

        if(n <0) n=n*(-1);

        while(n>0){
        
        rem = n%10;
        n=n/10;
       answer = (answer*10) + rem;

        }
        if(negative){
            answer = answer*(-1);
        }
        if (answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE)
            return 0;

       return (int) answer;
        //return answer;

    }

}