class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        for(String word: words){
          for (int j = 0; j < word.length(); j++) {
                if(word.charAt(j) == x){
                    list.add(i);
                    break;
                }
            }
            i++;
        }
        return list;
    }
}