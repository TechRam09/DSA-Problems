class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
       ArrayList<String> list = new ArrayList<>();
       list.add(words[0]);
       int group_value = groups[0];
       for(int i =1;i<words.length;i++){
        if(groups[i] != group_value){
            list.add(words[i]);
            group_value = groups[i];
        }
       }
       return list; 
    }
}