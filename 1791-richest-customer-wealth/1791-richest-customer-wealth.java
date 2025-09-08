class Solution {
    public int maximumWealth(int[][] accounts) {
       int max =Integer.MIN_VALUE;
//        for (int i = 0; i < accounts.length; i++) {
//            int wealthSum=0;
//            for (int j = 0; j < accounts[i].length; j++) {
//                wealthSum+=accounts[i][j];
//            }
//
//            if (wealthSum > max){
//                max = maxSum;
//            }
//        }
        for(int[] account:accounts){
           int wealthSum = 0;
           for(int wealth: account){
               wealthSum+=wealth;
           }
           if (wealthSum>max){
               max = wealthSum;
           }
        }

        return max; 
    }
}