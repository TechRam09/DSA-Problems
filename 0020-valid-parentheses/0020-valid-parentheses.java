class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack();
        for(char c:arr){
            if(isOpeningBracket(c)){
                stack.push(c);
            }else{
                if(stack.size() == 0){
                    return false;
                }
                if(matching(stack.peek(),c)){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public boolean isOpeningBracket(char c){
        switch(c){
            case '(':
            case '[':
            case '{':
                return true;
            default:
                return false;
        }
    }

    public boolean matching(char c, char d){
        if(c == '(' && d == ')'){
            return true;
        }else if(c == '[' && d == ']'){
            return true;
        }else if(c == '{' && d == '}'){
            return true;
        }else{
           return false;
        }
    }
}