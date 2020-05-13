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
        int countCandies = 1;//记录每次给的糖果数
        int countPeople = 0;
        while(countCandies <= candies)
        {
            result[countPeople] = countCandies;
            countCandies++;
            if(countCandies > candies)
            {
                
            }
        }
        return result;
    }
}