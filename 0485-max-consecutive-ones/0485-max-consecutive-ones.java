class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l =0;
        int r =0;
        int maxLength =0;
         int length =0;
        while(r<nums.length){
           
            if(nums[r] != 1){
                r++;
                l=r;
                length =0;
            }else{
                length++;
                r++;
            }
            maxLength = Math.max(length,maxLength);
        }

        return maxLength;
    }
}