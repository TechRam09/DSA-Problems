// User function Template for Java

// a,b : the arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        
        if(a.length == 0 && b.length==0) return new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
       
        for(int num1:a){
            set.add(num1);
        }
        for(int num2: b){
            set.add(num2);
        }
        
         ArrayList<Integer> list = new ArrayList<>(set);
         Collections.sort(list);
        
        return list;
    }
    
}
