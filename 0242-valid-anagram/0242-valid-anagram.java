class Solution {
    public boolean isAnagram(String s, String t) {
if(s.length() != t.length()) return false;
        // HashMap<Character,Integer> smap = new HashMap<>();
        // HashMap<Character,Integer> tmap = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        //     char schar = s.charAt(i);
        //     char tchar = t.charAt(i);
        //     smap.put(schar,smap.getOrDefault(schar,0)+1);
        //     tmap.put(tchar,tmap.getOrDefault(tchar,0)+1);
        // }

        // for(char c : smap.keySet()){
        //     if (!smap.get(c).equals(tmap.get(c))){
        //         return false;
        //     }

        // }
        // return true;

         if(s.length() != t.length()) return false;

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for (int num:arr){
            if(num !=0) return false;
        }
        return true;
    }
}