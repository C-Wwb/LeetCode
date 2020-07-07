import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String s = input.nextLine();
        System.out.println(solution.reverseWords(s));
    }
}
class Solution {
    public String reverseWords(String s) {
        String[] current = s.split(" ");
        StringBuilder result =new StringBuilder();
        for (String word : current)
        {
            result.append(new StringBuffer(word).reverse().toString()).append(" ");
        }
        return result.toString().trim();
    }
}
/*
text
Let`s take English
 */