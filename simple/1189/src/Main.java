import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String text = input.next();
        System.out.println(solution.maxNumberOfBalloons(text));
    }
}
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] result = new int[26];
        for(int i = 0; i < text.length(); i++)
        {
            result[(int)(text.charAt(i)) - 97]++;
        }
        /*
        int b = result[('b' - 97)];
        int a = result[('a' - 97)];
        int l = result['l' - 97];
        int o = result['o' - 97];
        int n = result[('n' - 97)];
         */
        int count = 0;
        while(count < 10000)
        {
            result[('b' - 97)]--;
            result[('a' - 97)]--;
            result['l' - 97] -= 2;
            result['o' - 97] -= 2;
            result[('n' - 97)]--;
            if(result[('b' - 97)] < 0 || result[('a' - 97)] < 0 || result['l' - 97] < 0
                    || result['o' - 97] < 0 || result[('n' - 97)] < 0)
            {
                return count;
            }
            count++;
        }
        return 0;
    }
}
/*
text
nlaebolko
loonbalxballpoon
leetcode
krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw
 */