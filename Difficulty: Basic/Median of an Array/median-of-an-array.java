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
            double res = solution.findMedian(arr);
            if (res == (int)res)
                System.out.println((int)res);
            else
                System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        int n =arr.length;
        double median= 0;
        int a = arr[(n-1)/2];
        int b = arr[n/2];
        if(n%2 ==0){
           median = (a+b)/2.0;
        }else{
            median = b;
        }
        
        return median;
    }
}
