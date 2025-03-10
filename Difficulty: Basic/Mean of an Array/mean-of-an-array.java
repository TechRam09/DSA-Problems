//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Reading the number of test cases

        while (t-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Solution solution = new Solution();
            System.out.println(
                solution.findMean(arr)); // Calling the function and printing the result
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int findMean(int[] arr) {
        // code here
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        int mean = sum / arr.length;
        
        return mean;
    }
};