class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        int divider = 1;
        
        while( x / divider >= 10){
            divider *= 10;
        }
        
        while (x != 0) {
            int last = x % 10;
            int first = x / divider;
            
            if(last != first) {
                return false;
            }

            x %= divider;
            x /= 10;
            divider /= 100;
        }
        
        return true;
    }
}