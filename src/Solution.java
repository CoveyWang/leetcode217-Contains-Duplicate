import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(nums.length);
        for (int num : nums
                ) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}