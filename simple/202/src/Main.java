import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = input.nextInt();
        System.out.println(solution.isHappy(n));
    }
}
class Solution {
    public boolean isHappy(int n) {
        if((n == 1 || n == 7))
        {
            return true;
        }
        else if(n < 10)
        {
            return false;
        }
        int current = 0;
        while(n > 0)
        {
            current += (int)Math.pow((n % 10), 2);
            n /= 10;
        }
        return isHappy(current);
    }
}


