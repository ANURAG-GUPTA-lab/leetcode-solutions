class Solution {
    public boolean isMatch(String s, String p) {
        char[] sArr = s.toCharArray();

        char[] pArr = p.toCharArray();

        int sLen = sArr.length, pLen = pArr.length;

        boolean[][] dp = new boolean[sLen + 1][pLen + 1];

        dp[0][0] = true;

        for(int i = 1; i <= pLen; i++)

            if(pArr[i - 1] == '*')

                dp[0][i] = dp[0][i - 1];

        for(int i = 1; i <= sLen; i++){

            for(int j = 1; j <= pLen; j++){

                if(match(sArr[i - 1], pArr[j - 1])) dp[i][j] |= dp[i - 1][j - 1];

                else if(pArr[j - 1] == '*'){

                    dp[i][j] |= dp[i - 1][j] || dp[i - 1][j - 1] || dp[i][j - 1];

                }

            }

        }

        return dp[sLen][pLen];

    }

    private boolean match(char a, char b){

        return a == b || b == '?';
    }
}
