import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of string: ");
        int size = input.nextInt();
        System.out.println("Please enter string: ");
        String[] dictionary = new String[size];
        for(int i = 0; i < dictionary.length; i++)
        {
            dictionary[i] = input.next();
        }
        System.out.println("Please enter sentence: ");
        String sentence = input.next();
        System.out.println(solution.respace(dictionary, sentence));
    }

}
class Solution {
    public int respace(String[] dictionary, String sentence) {
        Set<String> set = new HashSet<>();
        Collections.addAll(set, dictionary);

        int[] count = new int[sentence.length()+1];//表示 第i个字符 所含的最少未识别数 下标从 1 开始
        for(int i = 0; i < sentence.length(); i++){
            count[i + 1] = count[i] + 1;
            for(int j = 0; j < i + 1; j++){
                if(set.contains(sentence.substring(j, i + 1))){
                    count[i + 1] = Math.min(count[i + 1], count[j]);
                }
            }
        }
        return count[sentence.length()];
    }
}
/*
text
looked just like her brother
jesslookedjustliketimherbrother
 */