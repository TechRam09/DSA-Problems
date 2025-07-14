class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l = 0, r = 0;
        long maxSum = 0, sum = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (r < n) {
            if (map.containsKey(nums[r])) {
                while (nums[l] != nums[r]) {
                    map.remove(nums[l]);
                    sum -= nums[l];
                    l++;
                }
                map.remove(nums[l]);
                sum -= nums[l];
                l++;
                continue;
            }

            map.put(nums[r], 1);
            sum += nums[r];

            if (r - l + 1 < k) {
                r++;
            } else {
                maxSum = Math.max(maxSum, sum);
                sum -= nums[l];
                map.remove(nums[l]);
                l++;
                r++;
            }
        }

        return maxSum;
    }
}
