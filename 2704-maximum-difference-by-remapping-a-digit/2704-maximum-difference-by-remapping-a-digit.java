class Solution {
    public int minMaxDifference(int num) {
        String str = Integer.toString(num);
        char[] maxChar = str.toCharArray();
        char[] minChar = str.toCharArray();

        char maxReplace = ' ';
        for(char c : maxChar){
            if(c != '9'){
                maxReplace = c;
                break;
            }
        }

        for(int i =0;i<maxChar.length;i++){
            if(maxChar[i] == maxReplace){
                maxChar[i] = '9';
            }
        }

        char minReplace = minChar[0];
        for(int i =0;i<minChar.length;i++){
            if(minChar[i] == minReplace){
                minChar[i] = '0';
            }
        }

        int maxValue = Integer.parseInt(new String(maxChar));
        int minValue = Integer.parseInt(new String(minChar));


        return maxValue - minValue;
    
    }
}