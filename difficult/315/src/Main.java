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
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = input.nextInt();
        }
        System.out.println(solution.countSmaller(nums));
    }
}
/*
class Solution {
    public List<Integer> countSmaller(int[] nums) {
        if(nums == null || nums.length == 0)
        {
            return new LinkedList<>();
        }
        int i = 0;
        List<Integer> result = new ArrayList<>();
        while (i < nums.length - 1)
        {
            int[] current = Arrays.copyOfRange(nums, i + 1, nums.length);
            result.add(totalMin(nums[i], current));
            i++;
        }
        result.add(0);
        return result;
    }
    public static int totalMin(int standard, int[] current)
    {
        int count = 0;
        Arrays.sort(current);
        for (int value : current)
        {
            if (value < standard)
            {
                count++;
            }
            else
            {
                break;
            }
        }
        return count;
    }
}*/
class Solution {
    public List<Integer> countSmaller(int[] nums) {
        if(nums == null || nums.length == 0) return new LinkedList<>();
        //使用链表头插法
        LinkedList<Integer> result = new LinkedList<>();
        //反向插入排序
        for(int i = nums.length - 2; i >= 0; i--){
            int j = i + 1;
            int standard = nums[i];
            while(j < nums.length && nums[j] >= standard){
                nums[j - 1] = nums[j];
                j++;
            }
            nums[j - 1] = standard;
            result.addFirst(nums.length - j);
        }
        //添加最后一个数
        result.add(0);
        return result;
    }
}