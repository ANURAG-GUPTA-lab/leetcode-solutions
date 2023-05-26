class Solution {
    public List<String> generateParenthesis(int n) {
         List<String> result = new ArrayList<>();
        generate("", n, n, result);
        return result;
    }

    private static void generate(String s, int left, int right, List<String> result) {
        if (left == 0 && right == 0) {
            result.add(s);
            return;
        }
        if (left > 0) {
            generate(s + "(", left - 1, right, result);
        }
        if (right > left) {
            generate(s + ")", left, right - 1, result);
    }
    }
}
