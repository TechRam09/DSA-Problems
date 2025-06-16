class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int answer = -1;

        for(int i=1;i<nums.length;i++){
            if(nums[i] > min){
                answer = Math.max(answer,nums[i] - min);
            }else{
                min = nums[i];
            }
        }

        return answer;
        
    }
}