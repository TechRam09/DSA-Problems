import java.util.*;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        List<List<Integer>> temp = new ArrayList<>();
        Arrays.sort(nums);  // Step 1: Sort the array

        for (int i = 0; i < nums.length; i += 3) {
            // Check if difference in this group is valid
            if (nums[i + 2] - nums[i] > k) {
                return new int[0][0]; // return empty 2D array
            }

            // Add group of 3 to temp list
            temp.add(Arrays.asList(nums[i], nums[i + 1], nums[i + 2]));
        }

        // Convert List<List<Integer>> to int[][]
        int[][] result = new int[temp.size()][3];
        for (int i = 0; i < temp.size(); i++) {
            List<Integer> group = temp.get(i);
            for (int j = 0; j < 3; j++) {
                result[i][j] = group.get(j);
            }
        }

        return result;
    }
}
