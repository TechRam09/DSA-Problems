class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        //optimal approach
        HashSet<Integer> set1 = new HashSet<>();

        int[] largerArr ;

        if(nums1.length< nums2.length){
            largerArr = nums2;
            for(int num:nums1){
                set1.add(num);
            }
        }else{
            largerArr = nums1;
             for(int num:nums2){
                set1.add(num);
            }
        }
        HashSet<Integer> resultSet = new HashSet();

        for(int val :largerArr){
            if(set1.contains(val)){
                resultSet.add(val);
                set1.remove(val);
            }
        }

        int[] intersection  = new int[resultSet.size()];
        int i =0;
        for(int val:resultSet){
            intersection[i++] = val;
        }

        return intersection;

        //Better approach
        // HashSet<Integer> set1 = new HashSet<>();
        //  HashSet<Integer> set2 = new HashSet<>();
         
        // for(int num : nums1){
        //     set1.add(num);
        // }
        //  for(int num : nums2){
        //     set2.add(num);
        // }

        //  HashSet<Integer> set3 = new HashSet<>();
        //  for(int val:set1){
        //     if(set2.contains(val)){
        //        set3.add(val);
        //     }
        // }

        // int[] intersection  = new int[set3.size()];
        // int i =0;
        // for(int val:set3){
        //     intersection[i++] = val;
        // }

        // return intersection;

        

    }
}