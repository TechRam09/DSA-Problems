class Solution {
    public int minOperations(int[] nums) {
         int n = nums.length;
        int count = 0;

        for (int i = 0; i <= n - 3; i++) {
            if (nums[i] == 0) {
                // Flip 3 consecutive elements
                nums[i] ^= 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                count++;
            }
        }

        // Check remaining elements (last 2) — they can't be flipped anymore
        for (int i = n - 2; i < n; i++) {
            if (nums[i] == 0) return -1;
        }

        return count;
    }
}