class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
       int l =0;
       int r = 0;
       int sum = 0;
       int maxSum = Integer.MIN_VALUE;
       int n = nums.length;
       while(r<n){
        if(!set.contains(nums[r])){
            set.add(nums[r]);
            sum+=nums[r];
            r++;
        }else{
            set.remove(nums[l]);
            sum-=nums[l];
            l++;
        }
        maxSum = Math.max(maxSum,sum);
       }

       return maxSum;
    }
}