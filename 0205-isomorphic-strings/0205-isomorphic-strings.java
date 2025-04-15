class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Step 1: If the lengths are not equal, strings can’t be isomorphic
        if (s.length() != t.length()) return false;

        // Step 2: Create a HashMap to store mapping of characters from s to t
        HashMap<Character, Character> map = new HashMap<>();

        // Step 3: Loop through each character of both strings
        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);     // Character from string s
            char replacement = t.charAt(i);  // Corresponding character from string t

            // Case 1: If original character is NOT yet mapped
            if (!map.containsKey(original)) {

                // Check if replacement character is already mapped to someone else
                if (!map.containsValue(replacement)) {
                    // Safe to map this new pair
                    map.put(original, replacement);
                } else {
                    // Replacement is already used for another original char → not one-to-one mapping
                    return false;
                }

            } else {
                // Case 2: If original character is already mapped
                char mappedCharacter = map.get(original);

                // Check if previously mapped character matches current one
                if (mappedCharacter != replacement) {
                    // Mismatch → mapping is inconsistent → return false
                    return false;
                }
            }
        }

        // Step 4: If we reach here, all mappings are consistent
        return true;
    }
}
