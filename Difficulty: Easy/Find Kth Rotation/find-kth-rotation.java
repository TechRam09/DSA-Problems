class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int pivot = findPivot(arr);
        return pivot +1;
    }
    
    private int findPivot(int[] arr){
        int start=0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            //case1
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }else if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }else if(arr[mid] <= arr[start]){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        
        return -1;
    }
}