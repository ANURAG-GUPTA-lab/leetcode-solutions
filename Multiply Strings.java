class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))

            return "0";

        int l1 = num1.length(), l2 = num2.length();

        int[] n1 = new int[l1];

        int[] n2 = new int[l2];

        // convert num1 to number array reversely

        for (int i = 0; i < l1; i++) {

            n1[l1 - i - 1] = num1.charAt(i) - '0';

        }

        // convert num2 to number array reversely

        for (int i = 0; i < l2; i++) {

            n2[l2 - i - 1] = num2.charAt(i) - '0';

        }

        int sum = 0;

        StringBuilder ss = new StringBuilder();

        for (int i = 0; i < l1 + l2 - 1; i++) {

            for (int j = 0; j <= i; j++) {

                if(j < l1 && i - j < l2) {

                    sum += n1[j] * n2[i - j];

                }

            }

            ss.append((char) (sum % 10 + '0'));

            sum /= 10;

        }

        if (sum > 0) 

            ss.append((char) (sum + '0'));

        String s = ss.reverse().toString();

        return s.isEmpty() ? "0" : s;
    }
}
