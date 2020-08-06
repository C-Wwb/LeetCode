import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        String[] words = {"a",""};
        System.out.println(solution.palindromePairs(words));
    }
}
/*class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        Map<Integer, String> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++)
        {
            map.put(i, words[i]);
        }
        int i = 0;
        while (i < map.size())
        {
            for (int j = 0; j < map.size(); j++)
            {
                if (i != j)
                {
                    String s = "";
                    s += map.get(i) + map.get(j);
                    String reverse = new StringBuffer(s).reverse().toString();
                    if (s.equals(reverse))
                    {
                        result.add(Arrays.asList(i, j));
                    }
                }
            }
            i++;
        }
        return result;
    }
}*/
/*class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        int i = 0;
        List<List<Integer>> result = new ArrayList<>();
        //List<String> current = new ArrayList<>();
        if(null == words || words.length <= 1){
            return result;
        }
        while (i < words.length)
        {
            for (int j = 0; j < words.length; j++)
            {
                String s = "";
                s += words[i] + words[j];
                if (s.length() == 1)
                {
                    result.add(Arrays.asList(i, j));
                }
                else if (s.length() > 1 && i != j && s.charAt(0) == s.charAt(s.length() - 1))
                {
                    String reverse = new StringBuffer(s).reverse().toString();
                    if (s.equals(reverse))
                    {
                        result.add(Arrays.asList(i, j));
                    }
                }
            }
            i++;
        }
        return result;
    }
}*/
class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList();
        if(null == words || words.length <= 1){
            return result;
        }
        for(int i = 0; i < words.length; i++){
            String str1 = words[i];
            for(int j = 0; j < words.length; j++){
                if(i == j){
                    continue;
                }
                String str2 = words[j];

                if(judge(str1, str2)){
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        return result;
    }

    public boolean judge(String str1, String str2){
        // 处理null和空字符串，防止str.charAt(0)报错
        if(str1 == null || str1.equals("")){
            return judge(str2);
        }
        if(str2 == null || str2.equals("")){
            return judge(str1);
        }
        if(str1.charAt(0) != str2.charAt(str2.length()-1)){
            return false;
        }
        return judge(str1 + str2);

    }
    public boolean judge(String str){
        if(str == null || str.trim().equals("")){
            return true;
        }

        int right = str.length() - 1;
        int left = 0;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}