//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine().trim());

        while (t-- > 0) {
            String line = scanner.nextLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            Solution obj = new Solution();
            obj.sortArr(nums);
            for (int x : nums) {
                System.out.print(x + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    void sortArr(int[] arr) {
        // code here
        //  int n = arr.length;
        // for (int i = 0; i < n - 1; i++) {
        //     int minIndex = i; // Assume the first element is the smallest
        //     for (int j = i + 1; j < n; j++) {
        //         if (arr[j] < arr[minIndex]) { 
        //             minIndex = j; // Update the index of the minimum element
        //         }
        //     }
        //     // Swap only once per pass
        //     int temp = arr[i];
        //     arr[i] = arr[minIndex];
        //     arr[minIndex] = temp;
        // }
        Arrays.sort(arr);
    }
    
}
