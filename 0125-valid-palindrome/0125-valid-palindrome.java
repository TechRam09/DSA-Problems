class Solution {
    public boolean isPalindrome(String s) {
        String converted = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        System.out.println(converted);
        int n = converted.length();
        if(n==1) return true;
        for(int i=0;i<n;i++){
            if(converted.charAt(i) != converted.charAt(n-1-i)){
                return false;
            }
        }

        return true;
    }
}