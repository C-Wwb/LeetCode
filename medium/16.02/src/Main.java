import java.util.HashMap;
import java.util.Map;

class WordsFrequency {
    public Map<String, Integer> map = new HashMap<String, Integer>();
    public WordsFrequency(String[] book)
    {
        for (String e : book)
        {
            int count = map.getOrDefault(e, 0) + 1;
            map.put(e, count);
        }
    }
    public int get(String word)
    {
        if(map.get(word) != null)
        {
            return map.get(word);
        }
        return 0;
    }
}