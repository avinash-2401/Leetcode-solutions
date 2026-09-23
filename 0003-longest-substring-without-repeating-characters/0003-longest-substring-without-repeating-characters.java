class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int answer=0; int left=0; int length=0;
 
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            length = i-left+1;

            while(map.size()<length){
                char leftmost = s.charAt(left);

                map.put(leftmost,map.get(leftmost)-1);

                if(map.get(leftmost)==0){
                    map.remove(leftmost);
                }
                left++;  
                length = i-left+1;  

            }
            int maxlen = i-left+1;
            answer = Math.max(answer,maxlen);
        

             
        }
 
 return answer;
 
 
 
    }
}
//         int answer=0; int left=0; 

//         for(int right=0; right<s.length();right++){
//             map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)+1);
//             int k = right-left+1;
              
//               while(map.size() < k){
//                  map.put(s.charAt(left), map.get(s.charAt(left))-1);
//                  if(map.get(s.charAt(left))==0){
//                     map.remove(s.charAt(left));
//                  }
//                  left++;
//                  k = right-left+1;
//               }
//               int length = right-left+1;
//               answer = Math.max(length,answer);
//         }
//         return answer;
        
//     }
// }