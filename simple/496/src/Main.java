import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int[] num1 = {2, 4};
        int[] num2 = {1, 2, 3, 4};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.nextGreaterElement(num1, num2)));
    }
}
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++)
        {
            if (nums1[i] >= Arrays.stream(nums2).max().getAsInt())
            {
                result[i] = -1;
            }
            else
            {
                int index = search(nums2, nums1[i]);
                for (int j = index; j < nums2.length; j++)
                {
                    if (nums2[j] > nums1[i])
                    {
                        result[i] = nums2[j];
                        break;
                    }
                    if (j == nums2.length - 1)
                    {
                        result[i] = -1;
                    }
                }
            }
        }
        return result;
    }
    public static int search(int[] num, int e)
    {
        for (int i = 0; i < num.length; i++)
        {
            if (num[i] == e)
            {
                return i;
            }
        }
        return 0;
    }
}