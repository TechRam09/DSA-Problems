class Solution {
    public int[] searchRange(int[] nums, int target) {
            int[] ans = {-1,-1};

            if(nums.length == 0) return ans;

            ans[0]= search(nums,target,true);
            ans[1] = search(nums,target,false);
            return ans;
        }

        public int search(int[] nums, int target,boolean isFirst){
            int start =0;
            int end= nums.length-1;
            int ans = -1;

            while(start<=end){
                int mid = start + (end-start)/2;
                if(target < nums[mid]){
                    end = mid-1;
                }else if(target > nums[mid]){
                    start = mid+1;
                }else{
                    ans=mid;
                    if(isFirst){
                        end = mid-1;
                    }else{
                        start =mid+1;
                    }
                }
            }

            return ans;
        }
}

// //Brute force
//         int[] ans = {-1,-1};
//         if(nums.length == 0){
//             return ans;
//         }
//         for(int i = 0;i< nums.length;i++){
//             if(nums[i] == target){
//                 ans[0] = i;
//                 break;
//             }
//         }
//          for(int j = nums.length-1;j>=0;j--){
//             if(nums[j] == target){
//                 ans[1] = j;
//                 break;
//             }
//         }

//         return ans;