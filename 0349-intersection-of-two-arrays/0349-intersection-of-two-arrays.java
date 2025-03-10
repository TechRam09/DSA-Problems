class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();

        for(int num1: nums1){
            set.add(num1);
        }

        for(int num2: nums2){
            if(set.contains(num2)) {resultSet.add(num2);}
        }

        int[] temp = new int[resultSet.size()];
        int index =0;
        for(int num: resultSet){
            temp[index++] = num;
        }

        return temp;

    }
      
}