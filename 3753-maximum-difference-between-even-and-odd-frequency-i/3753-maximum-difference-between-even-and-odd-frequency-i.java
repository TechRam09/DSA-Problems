class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(int num : map.values() ){
            if(num % 2 == 0){
                minEven = Math.min(num,minEven);
            }else{
               maxOdd = Math.max(num,maxOdd);
            }
        }

        if (maxOdd == Integer.MIN_VALUE || minEven == Integer.MAX_VALUE) {
        return -1; 
        }

        return maxOdd - minEven;
    }
}