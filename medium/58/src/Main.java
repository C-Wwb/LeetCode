public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println(solution.reverseLeftWords("abcdefg", 2));
        System.out.println(solution.reverseLeftWords("lrloseumgh", 6));
    }
}
class Solution {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }
}