import java.util.*;

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
        System.out.println(solution.subsets(nums));
    }
}
/*
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        result.add(new ArrayList<>());
        int i = 0;
        while (i < nums.length)
        {
            List<Integer> current = new ArrayList<>();
            for (int j = i; j < nums.length; j++)
            {
                current.add(nums[j]);
                Integer[] temp = current.toArray(new Integer[0]);
                result.add(Arrays.asList(temp));
            }
            i++;
        }
        return result;
    }
}*/
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int e : nums)
        {
            int length = result.size();
            for(int i = 0; i < length; i++)
            {
                List<Integer> current = new ArrayList<>(result.get(i));
                current.add(e);
                result.add(current);
            }
        }
        return result;
    }
}

