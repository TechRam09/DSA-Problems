class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int maxLength =0;
       for(int num:nums){
        if(num == 1){
            map.put(1,map.getOrDefault(1,0)+1);
        }else{   
            map.put(1,0);
        }
        maxLength = Math.max(maxLength,map.get(1));
       }

        return maxLength;
    }
}