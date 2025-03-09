class Solution {
    public void moveZeroes(int[] nums) {
        int i =-1;
        int n =nums.length;
       for(int j=0; j<n;j++){
        if(nums[j] == 0){
            i =j;
            break;
        }
       }

       if (i == -1) return;

       for(int j = i+1; j<n;j++){
        if(nums[j] != 0){
            swap(nums,i,j);
            i++;
        }
       }
    }

     static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /* 
       int i =0;
        int n =nums.length;
        for(int num : nums){
            if(num != 0){
                nums[i] = num;
                i++;
            }
        }
        for(int k = i;k<n;k++){
            nums[k] = 0;
        }
    }
    */
}