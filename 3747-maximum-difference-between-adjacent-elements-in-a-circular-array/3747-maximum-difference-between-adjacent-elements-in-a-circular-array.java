class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int last = nums[nums.length - 1];
        int maxDiff = Math.abs(nums[0] - last);
        for(int i = 0 ;i<nums.length-1;i++){
            int diff = Math.abs(nums[i]-nums[i+1]);
            maxDiff =  Math.max(diff,maxDiff);
        }

        return maxDiff;
    }
}