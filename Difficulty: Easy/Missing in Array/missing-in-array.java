//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().missingNumber(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    int missingNumber(int arr[]) {
        // code here
        int n = arr.length + 1;
        long totalSum  = ( (long) n*(n+1))/2;
        long sum = 0;
       for(int num:arr){
           sum += num;
       }
        
        return (int)(totalSum - sum);
    };

    // optimal approach
        /*
        int n = arr.length + 1;
        int xor1 = 0; int xor2= 0;
        
        for(int i =0;i<=n;i++){
            xor1^=i;
        }
        
        for(int num : arr){
            xor2^=num;
        }
        
        return (xor1 - xor2);
        
        */
}
