class Solution {
     private static String generateKey(String str){

        int[] freq = new int[26];

        for(char c: str.toCharArray()){
            freq[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < freq.length; i++) {
            sb.append((char)(i+'a')).append(freq[i]);
        }

        return sb.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        /* better way
             HashMap<String,List<String>> map = new HashMap<>();

        if(str == null || str.length == 0){
            return  new ArrayList<>();
        }

        //sort the word and add it map
        for(String word:str){
            char[] chars = word.toCharArray();// convert string to char array for sorting
            Arrays.sort(chars);// sort he char array
            String key = new String(chars);//convert back to string

            map.computeIfAbsent(key,k-> new ArrayList<>()).add(word);
       //
           if(!map.contains(key)){
            map.put(key,new Arraylist<>());
            }
            map.get(key).add(word)
        //
            return new ArrayList<>(map.values());
        
             */

             
        HashMap<String,List<String>> map = new HashMap<>();

        for(String word : strs){
            String key = generateKey(word);
            map.computeIfAbsent(key,k->new ArrayList<>()).add(word);
        }

        return  new ArrayList<>(map.values());
        
        
    }
}