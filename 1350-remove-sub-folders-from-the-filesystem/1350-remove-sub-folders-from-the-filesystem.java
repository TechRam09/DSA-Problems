class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> res = new ArrayList<>();
        Arrays.sort(folder);
        String prev = folder[0];
        res.add(prev);

        for(int i = 1 ; i< folder.length;i++){
            if(!folder[i].startsWith(prev + "/")){
                prev = folder[i];
                res.add(prev);
            }
        }

        return res;
    }
}