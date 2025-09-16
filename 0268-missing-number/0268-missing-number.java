class Solution {
    public static int missingNumber(int[] arr) {
        int n = arr.length;
        int sum1 = (n*(n+1))/2;
        int sum2 =0;
        for(int num:arr){
            sum2+=num;
        }

        return sum1-sum2;
    }
}