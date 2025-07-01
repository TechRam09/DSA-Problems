class Solution {
    public int possibleStringCount(String word) {
        int pos = 1;
        char prev = word.charAt(0);
        for(int i =1;i<word.length();i++){
            if(word.charAt(i) == prev){
                pos +=1;
            }
            prev = word.charAt(i);
        }

        return pos;
    }
}