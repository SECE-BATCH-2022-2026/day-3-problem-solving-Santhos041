import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int count = UserMainCode.countOccurrance(s1, s2);
        System.out.println(count);
    }
}

class UserMainCode {
    public static int countOccurrance(String s1, String s2) {
        int count = 0;

        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            int j = 0;
            while (j < s2.length() && s1.charAt(i + j) == s2.charAt(j)) {
                j++;
            }
            if (j == s2.length()) {
                count++;
            }
        }
        return count;
    }
}
