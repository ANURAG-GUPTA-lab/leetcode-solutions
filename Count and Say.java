class Solution {
    public String countAndSay(int n) {
               if (n <= 1) {

            return n + "";

        }

        String str = "11";

        int ind = 2;

        while (ind < n) {

            StringBuffer sb = new StringBuffer();

            char[] arr = str.toCharArray();

            int count = 1;

            int type = Character.getNumericValue(arr[0]);

            for (int i = 1; i < arr.length; i++) {

                if (arr[i] == arr[i - 1]) {

                    count++;

                } else {

                    sb.append(count + "" + type);

                    type = Character.getNumericValue(arr[i]);

                    count = 1;

                }

            }

            ind++;

            sb.append(count + "" + type);

            str = sb.toString();

        }

        return str;
    }
}
