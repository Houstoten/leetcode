class Solution {
      public List<String> generateParenthesis(int n) {
    List<String> result = new ArrayList<>();

    generate(result, "", 0, 0, n);

    return result;
  }

  public static void generate(List<String> parentheses, String str, int start, int end, int max) {
    if(str.length() == max*2) {
      parentheses.add(str);
      return;
    }

    if(start < max) {
      generate(parentheses, str + "(", start + 1, end, max);
    }
    if(end < start) {
      generate(parentheses, str + ")", start, end + 1, max);
    }
  }
}