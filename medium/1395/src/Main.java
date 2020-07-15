import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size = input.nextInt();
        int[] rating = new int[size];
        System.out.println("Please enter the array: ");
        for (int i = 0; i < rating.length; i++)
        {
            rating[i] = input.nextInt();
        }
        System.out.println(solution.numTeams(rating));
    }
}
class Solution {
    public int numTeams(int[] rating) {
        int i = 0;
        int count = 0;
        while (i < rating.length - 2)
        {
            for (int j = i + 1; j < rating.length - 1; j++)
            {
                if(rating[j] > rating[i])
                {
                    for (int k = j + 1; k < rating.length; k++)
                    {
                        if(rating[k] > rating[j])
                        {
                            count++;
                        }
                    }
                }
                if(rating[j] < rating[i])
                {
                    for (int k = j + 1; k < rating.length; k++)
                    {
                        if(rating[k] < rating[j])
                        {
                            count++;
                        }
                    }
                }
            }
            i++;
        }
        return count;
    }
}