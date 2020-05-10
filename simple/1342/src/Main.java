import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = input.nextInt();
        System.out.println(solution.numberOfSteps(num));
    }
}
class Solution {
    public int numberOfSteps (int num)
    {
        int count = 0;
        while(num != 0)
        {
            if(num % 2 == 1)
            {
                num -= 1;
                count++;
            }
            else if(num % 2 == 0)
            {
                num /= 2;
                count++;
            }
        }
        return count;
    }
}