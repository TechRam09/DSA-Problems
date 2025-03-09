class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
         int n = colors.length;
        int[] diff = new int[n];

        // Step 1: Precompute differences
        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[(i + 1) % n]) {
                diff[i] = 1;
            } else {
                diff[i] = 0;
            }
        }

        // Step 2: Sliding window of size k-1
        int count = 0;
        int windowSum = 0;

        // Initialize the first window
        for (int i = 0; i < k - 1; i++) {
            windowSum += diff[i];
        }

        // Slide the window circularly
        for (int i = 0; i < n; i++) {
            // Check if window is valid
            if (windowSum == k - 1) {
                count++;
            }

            // Move window
            windowSum -= diff[i];
            windowSum += diff[(i + k - 1) % n];  // Circular
        }

        return count;
    }
}