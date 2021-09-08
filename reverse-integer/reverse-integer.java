class Solution {
    public int reverse(int x) {
        int temp = x;
        int result = 0;
        
        while(temp != 0) {
            int newAppend = temp % 10;
            
            if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && newAppend > 7)){
                return 0;
            }
            
            
            if(result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && newAppend < -8)){
                return 0;
            }
            
            result = result * 10 + newAppend;
            
            temp = temp / 10;

        }
        
        return result;
    }
    
}