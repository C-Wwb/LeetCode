import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(solution.intersection(nums1, nums2)));
    }
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int e : nums1)
        {
            set.add(e);
        }
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        for (int e : nums2)
        {
            if (set.contains(e))
            {
                result[index++] = e;
                set.remove(e);
            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }
}