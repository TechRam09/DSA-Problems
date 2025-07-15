class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3 ) return false;
        int vowel =0 ;
        int consonant = 0;
       if(word.matches("[a-zA-Z0-9]+")){
       for(char c : word.toLowerCase().toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c =='o' || c == 'u' ){
                vowel++;
            }else if (Character.isLetter(c)){
                consonant++;
            }
        }
       }else{
        return false;
       }

       if(vowel < 1 || consonant < 1){
        return false;
       }

       return true;
    }
}