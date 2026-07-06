class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
         map.put(0,-1);
         int sum=0;
         int length = 0;
         int maxlength = 0;

        for(int i=0; i<nums.length; i++){

            sum =sum + ((nums[i]==0)?-1:1);

            if(map.containsKey(sum)){
                length = i-map.get(sum);
                maxlength = Math.max(maxlength,length);
            }
            else{
                map.put(sum,i);
            }
        }

        return maxlength;
    }
}        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //int zero=0; int one=0; int answer=Integer.MIN_VALUE;

//         for(int i=0; i<nums.length; i++){
//             one=0;
//             zero=0;

//             for(int j=i; j<nums.length; j++){

//                 if(nums[j]==1) one++;
//                 else zero++;

//                 if(zero==one){
//                   int  length = j-i+1;

//                     answer = Math.max(answer,length);
//                 }
//             }
            
//         }
//         return answer;

        
//     }
// }