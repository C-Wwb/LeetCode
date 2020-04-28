import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the ransomNote: ");
        String ransomNote = input.next();
        System.out.println("Please enter the magazine: ");
        String magazine = input.next();
        Solution s = new Solution();
        System.out.println(s.canConstruct(ransomNote, magazine));
    }
}
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] chars1 = ransomNote.toCharArray();
        char[] chars2 = magazine.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        int i = 0;
        int j = 0;
        while (i < chars1.length && j < chars2.length) {
            if (chars1[i] == chars2[j]) {
                i++;
                j++;
            } else {
                if (chars2[j] > chars1[i]) {
                    return false;
                }
                j++;
            }
        }
        return i == chars1.length;
    }
}
