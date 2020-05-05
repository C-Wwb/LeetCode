import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution s = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of digits: ");
        int size = input.nextInt();
        System.out.println("Please enter the digits: ");
        int[] digits = new int[size];
        for(int i =0; i < digits.length; i++)
        {
            digits[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(s.plusOne(digits)));
    }
}
class Solution {
    public int[] plusOne(int[] digits)
    {
        for(int i = digits.length - 1; i >= 0; i--)
        {
            if(digits[i] == 9)
            {
                digits[i] = 0;
            }
            else
            {
                digits[i]++;
                return digits;
            }
        }
        int[] totalNine = new int[digits.length + 1];
        totalNine[0] = 1;
        return totalNine;
    }
}