//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		ArrayList <Integer> res = new Solution().acceptedProposals (arr, n);
    		System.out.println (res.get (0) + " " +res.get (1));
        
System.out.println("~");
}
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList <Integer> acceptedProposals (int arr[], int n)
    {
        // your code here
        ArrayList <Integer> list = new ArrayList<>();
        if(n<2) return list;
        /*
        With using sorting
        Arrays.sort(arr);
        list.add(arr[n-2]);
        list.add(arr[1]);
        return list;
        */

        // without sorting
        int Largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int Smallest = Integer.MIN_VALUE;
        int secondSmallest = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > Largest){
                secondLargest = largest;
                Largest = num;
              } else if(num > secondLargest && num != largest){
                    secondLargest = num;
                }

             if(num < Smallest){
                secondSmallest = Smallest;
                Smallest = num;
              } else if(num < secondSmallest && num != Smallest){
                    secondSmallest = num;
                }
        }
         list.add(secondLargest);
        list.add(secondSmallest);

        return list;
    }
}
