class Solution {
    public String convertToBase7(int num) {

        StringBuilder rem  = new StringBuilder();

        if(num==0) return "0";

        boolean negative = num<0;
        if(num<0){
        num = num * (-1);
        }

        while(num >0){
          rem.append(num%7);
          num=num/7;


        }
        if(negative){
            rem.append("-");
        }
        return rem.reverse().toString();
        
    }
}