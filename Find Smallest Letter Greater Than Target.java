class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int left = 0;
        int right = n - 1;
        char result = letters[0];  
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target) {
                result = letters[mid];
                right = mid - 1; 
            } else {
                left = mid + 1;  
            }
        }
        return result;
    }
}

/*
else also proceed with following way
 for (char c : letters) {
            if (c > target) {
                return c;
            }
        }
        return letters[0];
*/
