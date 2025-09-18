class Solution {
    public int[] findErrorNums(int[] arr) {
       int n = arr.length; 

        //apply normal cycle sort
        int  i = 0;
        while(i<n){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

        // traverse the sorted array and here we have to return the actual value(missing) 
        // at that missing index and also the value which is missing index
        for(int j = 0; j<n;j++){
            if(arr[j] != j+1){
            return new int[]{arr[j],j+1};
            }
        }

        return new int[]{-1,-1};
    }

     private void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}