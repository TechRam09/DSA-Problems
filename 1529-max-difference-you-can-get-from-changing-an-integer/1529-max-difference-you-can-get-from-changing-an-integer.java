class Solution {
    public int maxDiff(int num) {
        String s = Integer.toString(num);

        // Step 1: Make maxNum by replacing one digit with 9
        char[] maxChars = s.toCharArray();
        char maxDigit = ' ';
        for (char c : maxChars) {
            if (c != '9') {
                maxDigit = c;
                break;
            }
        }

        if (maxDigit != ' ') {
            for (int i = 0; i < maxChars.length; i++) {
                if (maxChars[i] == maxDigit) {
                    maxChars[i] = '9';
                }
            }
        }

        // Step 2: Make minNum by replacing one digit with 1 (first digit) or 0 (others)
        char[] minChars = s.toCharArray();
        char minDigit = minChars[0];
        char replaceWith = '1';
        if (minDigit != '1') {
            for (int i = 0; i < minChars.length; i++) {
                if (minChars[i] == minDigit) {
                    minChars[i] = '1';
                }
            }
        } else {
            // if first is 1, then pick any digit not 0 or 1 in other positions
            minDigit = ' ';
            for (int i = 1; i < minChars.length; i++) {
                if (minChars[i] != '0' && minChars[i] != '1') {
                    minDigit = minChars[i];
                    break;
                }
            }
            if (minDigit != ' ') {
                for (int i = 1; i < minChars.length; i++) {
                    if (minChars[i] == minDigit) {
                        minChars[i] = '0';
                    }
                }
            }
        }

        int maxVal = Integer.parseInt(new String(maxChars));
        int minVal = Integer.parseInt(new String(minChars));

        return maxVal - minVal;
    }
}
