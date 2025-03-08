//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int x = Integer.parseInt(sc.nextLine());
            int ans = ob.findFrequency(arr, x);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int findFrequency(int arr[], int x) {
        // code here
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int num: arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        
        }
        // return (map.get(x) != null)? map.get(x) : 0;
        return map.getOrDefault(x,0);
    }
}