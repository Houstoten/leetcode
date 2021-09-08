class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        String temp = "";

        for(int j = 0; j < s.length(); j++) {
            
            if(isCharInString(s.charAt(j), temp)) {
                int presentLongest = temp.length();

                int leftLongest = lengthOfLongestSubstring(s.substring(1));

                return Math.max(presentLongest, leftLongest);
            }

            temp += s.charAt(j);
        }
        
        return temp.length();
    }

    static boolean isCharInString(char ch, String str){
        for(int i = 0; i< str.length(); i++) {
            if(str.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }
}