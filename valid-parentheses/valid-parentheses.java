class Solution {
        static boolean match(char ch, char matchCh){
        if(ch == '[') {
            if (matchCh == ']') {
                return true;
            }
        }

        if(ch == '(') {
            if (matchCh == ')') {
                return true;
            }
        }

        if(ch == '{') {
            if (matchCh == '}') {
                return true;
            }
        }

        return false;
    }

    static boolean isOpening(char ch) {
        if(ch == '[' || ch == '(' || ch == '{') {
            return true;
        }
        return false;
    }

    static boolean isClosing(char ch) {
        if(ch == ']' || ch == ')' || ch == '}') {
            return true;
        }
        return false;
    }

    public boolean isValid(String s) {
        // if(s.length() % 2 != 0) {
        //     return false;
        // }
        
        Stack<Character> parentheses = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if(isOpening(current)) {
                parentheses.push(current);
            }

            if(isClosing(current)) {
                if(parentheses.size() == 0 || !match(parentheses.pop(), current)) {
                    return false;
                }
            }
        }

        if(parentheses.size() > 0) {
            return false;
        }
        return true;
    }

}