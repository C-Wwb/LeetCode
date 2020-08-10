import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(solution.uniqueMorseRepresentations(words));
    }
}
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] MorseCode = {".-","-...","-.-.","-..",".","..-.","--.","....",
                "..",".---","-.-",".-..","--","-.","---",".--.","--.-",
                ".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<Character, String> corresponding = new HashMap<>();
        for (int i = 97; i < 123; i++)
        {
            corresponding.put((char)i, MorseCode[i - 97]);
        }

        Map<String, Integer> result = new HashMap<>();
        for (String e : words)
        {
            int count = result.getOrDefault(translate(e, corresponding), 0) + 1;
            result.put(translate(e, corresponding), count);
        }
        return result.size();
    }
    public static String translate(String words, Map<Character, String> corresponding)
    {
        String result = "";
        for (int i = 0; i < words.length(); i++)
        {
            result += corresponding.get(words.charAt(i));
        }
        return result;
    }
}
