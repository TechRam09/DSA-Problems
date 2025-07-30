class Solution {
    public int longestSubarray(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        int currLen  = 0;
        int maxLen = 0;
        for(int num : nums){
            maxValue = Math.max(maxValue,num);
        }

        for(int val : nums){
            if(val == maxValue){
                currLen++;
            }else{
                currLen = 0;
            }
            maxLen = Math.max(maxLen,currLen);
        }

        return maxLen;
    }
}