import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String str = input.nextLine();
        System.out.println(solution.toLowerCase(str));
    }
}
class Solution {
    public String toLowerCase(String str) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) < 65 || str.charAt(i) > 90)
            {
                result.append(str.charAt(i));
            }
            else
            {
                result.append((char) ((int) (str.charAt(i)) + 32));
            }
        }
        return result.toString();
    }
}