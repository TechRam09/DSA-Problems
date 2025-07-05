class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int lucky = -1;
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num: arr){
            if(num == map.get(num)){
                lucky = Math.max(lucky,num);
            }
        }

        return lucky;
    }
}