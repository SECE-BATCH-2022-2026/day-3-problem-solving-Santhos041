import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class UserMainCode {
    public static boolean matchPattern(String input) {
        Pattern pattern = Pattern.compile("^CPT-\\d{6}$");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();  
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean result = UserMainCode.matchPattern(str);
        System.out.println(result);
    }
}
