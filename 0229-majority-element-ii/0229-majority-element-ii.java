class Solution {
    public List<Integer> majorityElement(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        int floor= n/3;
        
        for(int val : arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }
       
        
        for(int num : map.keySet()){
           if(map.get(num) > floor){
               list.add(num);
           }
        }
        
        return list;
    }
}