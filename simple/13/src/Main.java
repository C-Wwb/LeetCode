import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a roman numerals: ");
        String s = input.next();
        System.out.println(solution.romanToInt(s));
    }
}
class Solution {
    public int romanToInt(String s) {
        int digits = 0;
        s += " ";
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V')
            {
                digits += 4;
                i += 1;
            }
            else if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X')
            {
                digits += 9;
                i += 1;
            }
            else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L')
            {
                digits += 40;
                i += 1;
            }
            else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C')
            {
                digits += 90;
                i += 1;
            }
            else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D')
            {
                digits += 400;
                i += 1;
            }
            else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M')
            {
                digits += 900;
                i += 1;
            }
            else if (s.charAt(i) == 'I')
            {
                digits += 1;
            }
            else if (s.charAt(i) == 'V')
            {
                digits += 5;
            }
            else if (s.charAt(i) == 'X')
            {
                digits += 10;
            }
            else if (s.charAt(i) == 'L')
            {
                digits += 50;
            }
            else if (s.charAt(i) == 'C')
            {
                digits += 100;
            }
            else if (s.charAt(i) == 'D')
            {
                digits += 500;
            }
            else if (s.charAt(i) == 'M')
            {
                digits += 1000;
            }
            else
            {
                digits += 0;
            }
        }
        return digits;
    }
}