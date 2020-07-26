import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String s = input.next();
        System.out.println("Please enter the size of array: ");
        int size = input.nextInt();
        System.out.println("Please enter the array: ");
        int[] indices = new int[size];
        for (int i = 0; i < indices.length; i++)
        {
            indices[i] = input.nextInt();
        }
        System.out.println(solution.restoreString(s, indices));
    }
}
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[indices.length];
        for (int i = 0; i < indices.length; i++)
        {
            result[indices[i]] = s.charAt(i);
        }
        return String.valueOf(result);
    }
}
/*
text
codeleet
4 5 6 7 0 2 1 3
 */