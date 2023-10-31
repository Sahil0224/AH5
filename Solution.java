import java.util.HashMap;
import java.util.Map;

class Solution {
    public static char mostFrequentChar(String s) 
    {
      HashMap<Character, Integer> freq = new HashMap<>();

      for (char c : s.toCharArray())
      {
        if(freq.containsKey(c))
        {
          freq.put(c, freq.get(c) + 1);
        }
        else
        {
          freq.put(c, 1);
        }
      }

      char maxChar = '\0';
      int maxFreq = 0;

      for (Map.Entry<Character, Integer> entry : freq.entrySet())
      {
          char c = entry.getKey();
          int f = entry.getValue();

          if (f > maxFreq)
          {
            maxChar = c;
            maxFreq = f;
          }
          else if (f == maxFreq && c < maxChar)
          {
            maxChar = c;
            maxFreq = f;
          }
      }
      return maxChar;
    }
  
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e'

      System.out.println(Solution.mostFrequentChar("david")); // -> 'd'

      System.out.println(Solution.mostFrequentChar("mississippi")); // -> 'i'

      System.out.println(Solution.mostFrequentChar("eleventennine")); // -> 'e'
    }

  }
