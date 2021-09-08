class Solution {
    public String convert(String s, int numRows) {
        char[] chars = s.toCharArray();

        if(s.length() == 1) {
            return s;
        }

        if(numRows == 1) {
            return s;
        }
        
        String result = "";

        int constantNum = numRows*2 - 2;

        for(int i = 0; i < numRows; i++) {

            int current = i;

            int next = constantNum - i;
            while(current < chars.length) {
                result += chars[current];

                if(i == numRows - 1 || i == 0) {
                    current += constantNum;
                } else {
                    int temp = current + constantNum;
                    current = next;
                    next = temp;
                }
            }


        }

    return result;

}
}