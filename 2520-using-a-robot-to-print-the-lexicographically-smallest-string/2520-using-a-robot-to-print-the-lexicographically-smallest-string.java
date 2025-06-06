import java.util.*;

class Solution {
    public String robotWithString(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Integer> freq = new HashMap<>();

        // Count frequency using HashMap
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        StringBuilder t = new StringBuilder();

        for (char ch : s.toCharArray()) {
            stack.push(ch);
            // Reduce frequency of the current character
            freq.put(ch, freq.get(ch) - 1);
            if (freq.get(ch) == 0) {
                freq.remove(ch);  // clean up to avoid unnecessary lookups
            }

            // Pop from stack while top is <= smallest remaining character
            while (!stack.isEmpty() && stack.peek() <= smallestChar(freq)) {
                t.append(stack.pop());
            }
        }

        // Append remaining characters from the stack
        while (!stack.isEmpty()) {
            t.append(stack.pop());
        }

        return t.toString();
    }

    // Find smallest character still present in the freq map
    private char smallestChar(Map<Character, Integer> freq) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (freq.containsKey(ch)) {
                return ch;
            }
        }
        return 'a'; // safe fallback, though won't be used if freq has elements
    }
}
