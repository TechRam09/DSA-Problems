class Solution {
    public int findDuplicate(int[] arr) {
     int n = arr.length;
     int i = 0;

        while(i<n){
        int correct = arr[i] - 1;
        
        if(arr[i] != arr[correct]){
            swap(arr,i,correct);
        }else{
            i++;
        }
        
      }

      for(int j=0;j<n;j++){
        if(arr[j] != j+1){
            return arr[j];
        }
      }

      return -1;

    }

      public void swap(int[] arr,int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}