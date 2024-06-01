import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static String oddEven(String s) {
        // Create a map to count the frequency of each character
        Map<Character, Integer> freq = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        
        int x = 0;
        int y = 0;
        
        // Iterate over the characters and their frequencies
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            int position = c - 'a' + 1;
            
            // Check for even position and even frequency
            if (position % 2 == 0 && count % 2 == 0) {
                x += 1;
            }
            // Check for odd position and odd frequency
            else if (position % 2 != 0 && count % 2 != 0) {
                y += 1;
            }
        }
        
        // Calculate the sum of x and y
        int sumXY = x + y;
        
        // Determine if the sum is EVEN or ODD
        return (sumXY % 2 == 0) ? "EVEN" : "ODD";
    }

    public static void main(String[] args) {
        // Example usage:
        String s = "abbbcc";
        String result = oddEven(s);
        System.out.println(result);  // Output: "ODD"
    }
}
