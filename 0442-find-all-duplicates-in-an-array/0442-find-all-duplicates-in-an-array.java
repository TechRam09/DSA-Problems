class Solution {
    public List<Integer> findDuplicates(int[] arr) {
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

        //after sorting traverse the sorted array and find the value which mismatch 
        // with the actual value at that index
        List<Integer> list = new ArrayList<>();
        for(int j = 0;j<n;j++){
            if(arr[j] != j+1){
                list.add(arr[j]);
            }
        } 

        return list;
    }

    private void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}