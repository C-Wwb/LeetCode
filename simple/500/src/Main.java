import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size = input.nextInt();
        System.out.println("Please enter the array: ");
        String[] words = new String[size];
        for(int i = 0; i < words.length; i++)
        {
            words[i] = input.next();
        }
        System.out.println(Arrays.toString(solution.findWords(words)));
    }
}
class Solution {
    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<String>();
        for (String word : words) {
            if (judge(word)) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
    public static boolean judge(String words)
    {
        int countLine1 = 0;
        int countLine2 = 0;
        int countLine3 = 0;
        String singleWords = words.toLowerCase();
        for(int i = 0; i < singleWords.length(); i++)
        {
            if(singleWords.charAt(i) == 'q' || singleWords.charAt(i) == 'w' || singleWords.charAt(i) == 'e'
                    || singleWords.charAt(i) == 'r' || singleWords.charAt(i) == 't' || singleWords.charAt(i) == 'y'
                    || singleWords.charAt(i) == 'u' || singleWords.charAt(i) == 'i' || singleWords.charAt(i) == 'o'
                    || singleWords.charAt(i) == 'p')
            {
                countLine1++;
            }
            if(singleWords.charAt(i) == 'a' || singleWords.charAt(i) == 's' || singleWords.charAt(i) == 'd'
                    || singleWords.charAt(i) == 'f' || singleWords.charAt(i) == 'g' || singleWords.charAt(i) == 'h'
                    || singleWords.charAt(i) == 'j' || singleWords.charAt(i) == 'k' || singleWords.charAt(i) == 'l')
            {
                countLine2++;
            }
            if(singleWords.charAt(i) == 'z' || singleWords.charAt(i) == 'x' || singleWords.charAt(i) == 'c'
                    || singleWords.charAt(i) == 'v' || singleWords.charAt(i) == 'b' || singleWords.charAt(i) == 'n'
                    || singleWords.charAt(i) == 'm')
            {
                countLine3++;
            }
        }
        return (countLine1 == singleWords.length() || countLine2 == singleWords.length() || countLine3 == singleWords.length());
    }
}