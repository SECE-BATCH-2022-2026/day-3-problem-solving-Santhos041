class UserMainCode {
    public static int countOccurrance(String s1, String s2) {
        int count = 0;

        for (int i = 0; i <= s1.length() - s2.length(); i++) {

            int k = i;
            int j = 0;

            while (j < s2.length() && s1.charAt(k) == s2.charAt(j)) {
                k++;
                j++;
            }

            if (j == s2.length()) {
                count++;
            }
        }

        return count;
    }
}
class UserMainCode {
    public static int countOccurrance(String s1, String s2) {

        int count = 0;

        for (int i = 0; i <= s1.length() - s2.length(); i++) {

            int k = i;
            int j = 0;

            while (j < s2.length() && s1.charAt(k) == s2.charAt(j)) {
                k++;
                j++;
            }

            if (j == s2.length()) {
                count++;
            }
        }

        return count;
    }
}

