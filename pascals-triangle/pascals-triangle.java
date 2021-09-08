class Solution {
    public List<List<Integer>> generate(int numRows) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        
        List<Integer> tempRes;
        for(int i = 1; i < numRows + 1; i++) {
            tempRes = new ArrayList<>(i);
            if(i == 1) {
                tempRes.add(1);
                result.add(tempRes);
                continue;
            }
            
            if(i == 2) {
                tempRes.add(1);
                tempRes.add(1);
                result.add(tempRes);
                continue;
            }
            
            List<Integer> last = result.peekLast();
            
            tempRes.add(0, 1);
            
            for(int j = 0; j < last.size() - 1; j++) {
                tempRes.add(j + 1, last.get(j) + last.get(j + 1));
            }
            
                        tempRes.add(1);

            result.add(tempRes);
            
        }
        
        return result;
    }
}