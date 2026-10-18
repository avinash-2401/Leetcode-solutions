class Solution {
    public int longestWPI(int[] hours) {
        int length =0; int val=0; int sum=0; int answer=0;
        HashMap<Integer,Integer> map =new HashMap<>();
        map.put(0,-1);

     for(int i=0; i<hours.length; i++){
        
        if(hours[i] > 8){
            sum++;
        }else{
            sum--;
        }
        
        if(sum>0){
            answer = i+1;
        }

        else{
        if(map.containsKey(sum-1)){
            answer = Math.max(answer, i - map.get(sum - 1));

        }
         if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        
       
       
    }
     }
    return answer;
}

}