import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = input.nextInt();
        System.out.println(Arrays.toString(solution.getNoZeroIntegers(n)));
    }
}
class Solution {
    public int[] getNoZeroIntegers(int n)
    {
        int count = 0;
        int[] array = new int[2];
        while(count != 1)
        {
            int n1 = (int)(Math.random() * n + 1);
            int n2 = n - n1;
            if(!checkZero(n1) && !checkZero(n2) && n1 != 0)
            {
                array[0] = n1;
                array[1] = n2;
                count++;
            }
        }
        return array;
    }
    public boolean checkZero(int n)
    {
        String s = String.valueOf(n);
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '0')
            {
                return true;
            }
        }
        return false;
    }
}