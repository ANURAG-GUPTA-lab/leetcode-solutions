class Solution {
    public int partitionString(String s) {
        int i = 0, count = 1, flag = 0;
        while (i<s.length()){
            int val = s.charAt(i) - 'a';
            /*the character at index i in the string and converts it to an integer*/
            if ((flag & (1<<val)) != 0) {
                flag = 0;
                count++;
            }
            flag = flag | (1<<val); 
            /*This line sets the bit in the bitmask corresponding to the character*/
            i++;
        }
        return count;
    }
}
