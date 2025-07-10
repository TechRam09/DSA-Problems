class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
         HashSet<Integer> set2 = new HashSet<>();
         
        for(int num : nums1){
            set1.add(num);
        }
         for(int num : nums2){
            set2.add(num);
        }

         HashSet<Integer> set3 = new HashSet<>();
         for(int val:set1){
            if(set2.contains(val)){
               set3.add(val);
            }
        }

        int[] intersection  = new int[set3.size()];
        int i =0;
        for(int val:set3){
            intersection[i++] = val;
        }

        return intersection;

        

    }
}