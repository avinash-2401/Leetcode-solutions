class Solution {
    public int totalFruit(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int answer=-1; int left=0; int sum=0;

        for(int right=0; right<nums.length;right++){
            sum = nums[right];
            map.put(sum, map.getOrDefault(sum,0)+1);
                    
                    while(map.size() >2){
                        int leftValue =  nums[left];
                        map.put(leftValue, map.get(leftValue)-1);

                        if(map.get(leftValue) == 0){
                            map.remove(leftValue);
                        }
                        left++;
                    }
            int length = right-left+1;
            answer = Math.max(answer,length);
    
        }
        return answer;
        
    }
}