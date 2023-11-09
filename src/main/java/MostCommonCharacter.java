import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {

        char[] strArray = str.toCharArray();
        Map<Character, Integer> strMap = new HashMap<>();
        char maxKey = Character.MIN_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (char element : strArray) {
            Character key = Character.valueOf(element);
            
            if (strMap.containsKey(key)) {
                strMap.put(key, strMap.get(key) + 1);
            }
            else {
                strMap.put(key, 1);
            }
            
            if (strMap.get(key) > maxValue) {
                maxKey = key;
                maxValue = strMap.get(key);
            }
        }

        return maxKey;

        // Entry<Character, Integer> maxEntry = strMap.entrySet().stream()
        //                                         .max((entry1, entry2) -> entry1.getValue() - entry2.getValue())
        //                                         .get();        

        // return maxEntry.getKey();
    }
}
