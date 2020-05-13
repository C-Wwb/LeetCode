import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of candies: ");
        int candies = input.nextInt();
        System.out.println("Please enter the number of children: ");
        int num_people = input.nextInt();
        System.out.println(Arrays.toString(solution.distributeCandies(candies, num_people)));
    }
}
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int accumulate = 0;
        int i = 1;
        int current = 0;
        while (accumulate < candies){
            //每次分i个糖果，可能最后一次不够，所以取最小值
            current = Math.min(i, candies - accumulate);
            result[(i - 1) % num_people] += current;
            accumulate += current;
            i++;
        }
        return result;
    }
}