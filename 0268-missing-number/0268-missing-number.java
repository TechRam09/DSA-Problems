class Solution {
    public static int missingNumber(int[] arr) {
    //cycle sort algo
        int n = arr.length;

        int i =0 ;
        while(i<n){
            //correct index is equal current index not -1, since range start from 0
            int correct = arr[i];

            // the comparison should be value less than N not equal to N, if equal skips
            //because index N does not exist
            if(arr[i] < n && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }

        for (int j = 0; j < n; j++) {
            if(arr[j] != j){
                return j;
            }
        }

        return n;
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}