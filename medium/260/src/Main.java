import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size = input.nextInt();
        System.out.println("Please enter the array: ");
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(solution.singleNumber(nums)));
    }
}
class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        for (int e : nums)
        {
            int count = temp.getOrDefault(e, 0) + 1;
            temp.put(e, count);
        }
        int[] result = new int[2];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : temp.entrySet())
        {
            if (entry.getValue() == 1)
            {
                result[i] = entry.getKey();
                i++;
            }
        }
        return result;
    }
}
/*
text
1 2 1 3 2 5
 */