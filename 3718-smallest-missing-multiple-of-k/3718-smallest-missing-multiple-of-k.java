import java.util.HashSet;
import java.util.Set;

class Solution {
    public int missingMultiple(int[] nums, int k) {
        // Convert array to a HashSet for O(1) lookups
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        
        int multiple = k;
        // Increment by k until a missing multiple is found
        while (numSet.contains(multiple)) {
            multiple += k;
        }
        
        return multiple;
    }
}
