class Solution {
    public int search(int[] arr, int target) {
      int pivot = findPivot(arr);

      //if pivot is not found we just apply normal binary search
        if(pivot == -1){
            return binarySearch(arr,target,0,arr.length-1);
        }

        //if pivot is found , we have found 2 ascending sorted arrays
        if(arr[pivot] == target){
            return pivot;
        }

        int firstTry = binarySearch(arr,target,0,pivot);
        if(firstTry != -1){
            return firstTry;
        }

        return binarySearch(arr,target,pivot+1,arr.length-1);

    }
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = start +(end - start)/2;

            //case 1
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            } else if (mid > start && arr[mid] < arr[mid-1]) {
                return mid -1;
            } else if(arr[start] >= arr[mid]){
                end = mid-1;
            } else {
                start=mid+1;
            }
        }

        return -1;
    }

    private static int binarySearch(int[] arr, int target,int start,int end) {

        //find mid normal way => mid = (start+end)/2
        //best way
        while (start <= end){
            int mid = start + (end-start)/2;

            if(target == arr[mid]){
                return mid;
            }else if(target > arr[mid]){
                start = mid+1;
            } else if (target < arr[mid]) {
                end = mid-1;
            }
        }

        return -1;
    }
}