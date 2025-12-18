class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int j = -1;
        int min = Integer.MAX_VALUE;
        for(int i = n-1;i>0;i-- ){
            if(nums[i] > nums[i-1]){
                j = i-1;
                break;
            }
        }

        if(j==-1){
            reverse(nums,0,n-1);
            return;
        }

        int minIndex = 0;
        
        for(int i = n-1;i>j;i--){
            if(nums[i] > nums[j] && nums[i] < min){
               min = nums[i];
               minIndex =i;
            }
        }

      
        swap(nums,minIndex,j);
        reverse(nums,j+1,n-1);
        

    }

    static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] =nums[j];
        nums[j] = temp;

    }

    static void reverse(int[] nums,int first,int last){
        while(first < last){
             int temp = nums[first];
             nums[first] =nums[last];
             nums[last] = temp;

             first++;
             last--;
        }
    }
}