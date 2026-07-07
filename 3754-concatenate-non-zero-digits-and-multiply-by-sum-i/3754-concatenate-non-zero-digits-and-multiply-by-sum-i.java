class Solution {
    public long sumAndMultiply(int n) {
int nonZeroSum=0;
int digit=0; 
int sum=0;
int temp=0;

        while(n>0){
             
           int mod = n%10;

            if(mod != 0){
                nonZeroSum = (nonZeroSum*10) + mod;
            }
            n=n/10;

        }
        while(nonZeroSum>0){
            temp = nonZeroSum%10;
            nonZeroSum = nonZeroSum/10;

            sum = (sum*10)+temp;

        }

        int x = sum;   

        while(x>0){

         digit += x % 10;
            x = x/10;

     }
        return (long) digit* sum;



         


        }
        
    }
