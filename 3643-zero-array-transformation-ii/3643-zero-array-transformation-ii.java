class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int low = 0;
        int high = queries.length;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (canMakeZero(nums, queries, mid)) {
                ans = mid;
                high = mid - 1; // try to find smaller k
            } else {
                low = mid + 1; // try more queries
            }
        }

        return ans;
    }

    // Helper function to check if first k queries can reduce nums to all zeros
    private boolean canMakeZero(int[] nums, int[][] queries, int k) {
        int n = nums.length;
        int[] diff = new int[n + 2]; // for range updates

        // Apply first k queries using range update trick
        for (int i = 0; i < k; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int val = queries[i][2];

            diff[l] += val;
            diff[r + 1] -= val;
        }

        // Create the actual reduction array from diff array
        int[] reducePower = new int[n];
        int current = 0;

        for (int i = 0; i < n; i++) {
            current += diff[i];
            reducePower[i] = current;
        }

        // Check if each value in nums can be reduced to 0
        for (int i = 0; i < n; i++) {
            if (nums[i] > reducePower[i]) return false;
        }

        return true;
    }
}
