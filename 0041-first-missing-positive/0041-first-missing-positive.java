class Solution {
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        //apply cyclic sort but catch is we have to skip value less than 1
        // though we will be having a zero this question positive integer so it problem
        // of range [1,N] so index = value - 1
        int i = 0;
        while(i<n){
            int correct =arr[i] -1;
            if(arr[i] > 0 && arr[i] <= n && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

        for(int j = 0;j<n;j++){
                if(arr[j] != j+1){
                    return j+1;
                }
        }

        return n+1;

    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}