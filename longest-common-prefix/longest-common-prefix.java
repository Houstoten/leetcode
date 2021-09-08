class Solution {
    public String longestCommonPrefix(String[] strs) {
String currentPrefix = "";

        if(strs.length == 1) {
            return strs[0];
        }

        for(int i = 0; i < strs[0].length(); i++) {

            String substringPrefix = strs[0].substring(0, i + 1);

                for(int j = 0; j < strs.length; j++) {
                    if(strs[j].equals("")){
                        return "";
                    }
                    
                    if(!strs[j].startsWith(substringPrefix)) {
                        return currentPrefix;
                    }
                    
                    if(j == strs.length - 1){
                        currentPrefix = substringPrefix;
                    }
                }            
        }
        
        return currentPrefix;
    }
}