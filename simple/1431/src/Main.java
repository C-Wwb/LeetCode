import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println("Please enter the number of children: ");
        int number = input.nextInt();
        System.out.println("Please enter the extraCandies: ");
        int extraCandies = input.nextInt();
        System.out.println("Please enter the candies for each children: ");
        int[] candies = new int[number];
        for(int i = 0; i < candies.length; i++)
        {
            candies[i] = input.nextInt();
        }
        System.out.println(solution.kidsWithCandies(candies, extraCandies));
    }
}
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> list = new ArrayList<Boolean>();
        for(int i = 0; i < candies.length; i++)
        {
            if(candies[i] + extraCandies >= max)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }
        return list;
    }
}
/*
text
2 3 5 1 3
3
 */
