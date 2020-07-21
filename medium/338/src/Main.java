import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = input.nextInt();
        System.out.println(Arrays.toString(solution.countBits(num)));
    }
}
class Solution {
    int i = 0;
    List<Integer> list = new ArrayList<>();
    public int[] countBits(int num) {
        list.add(Integer.bitCount(num));
        num--;
        if (num < 0)
        {
            int[] result = new int[list.size()];
            Collections.reverse(list);
            for (int i = 0; i < list.size(); i++)
            {
                result[i] = list.get(i);
            }
            return result;
        }
        return countBits(num);
    }
}
/*class Solution {
    public int[] countBits(int num) {
        int i = 0;
        int[] result = new int[num + 1];
        while (i <= num)
        {
            result[i] = Integer.bitCount(i);
            i++;
        }
        return result;
    }
}*/