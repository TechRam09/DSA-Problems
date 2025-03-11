class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3]; // for 'a', 'b', 'c'
        int left = 0;
        int result = 0;
        
        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'a']++;
            
            // When all characters are present at least once
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                result += s.length() - right;
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return result;
    }
}
