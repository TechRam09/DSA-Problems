
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int l =0 ;
        int r =0;
        int n =arr.length;
        int sum =0;
        int maxSum =0;
        while(r < n){
            sum+=arr[r];
            if(sum > target){
               while(sum > target){
                   sum-=arr[l];
                   l++;
               }
            }
            
            if(sum == target){
                list.add(l+1);
                list.add(r+1);
                return list;
            }
            
            r++;
        }
        
        list.add(-1);
        return list;
    }
}
