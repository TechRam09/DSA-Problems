class Solution {
    public int maxPower(String s) {
        int x=1;
        int max =1;
        for(int i =1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                x++;
            }else{
                max = Math.max(max,x);
                x =1;
            }
        }
        return Math.max(max,x);
    }
}