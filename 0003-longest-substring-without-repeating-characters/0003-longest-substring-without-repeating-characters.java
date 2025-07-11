class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l =0;
        int r =0;
        int maxLength = 0;
        int n = s.length();
        while(r<n){
            char ch = s.charAt(r);
            //Change the  l position if element presen already in map
            if(map.containsKey(ch)){
                l = Math.max(map.get(ch)+1,l);
            }
            //add or update the map
            map.put(ch,r);
            int length = r-l+1;
            maxLength = Math.max(maxLength,length);
            r++;
        }

        return maxLength;
    }
}