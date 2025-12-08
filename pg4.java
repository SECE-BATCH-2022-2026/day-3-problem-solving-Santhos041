import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter string: ");
        String inp = br.readLine();
        
        System.out.print("Enter number of repeats: ");
        int n = Integer.parseInt(br.readLine());
        
        System.out.println(UserMainCode.repeatFront(inp, n));
    }
}

class UserMainCode {
    public static String repeatFront(String inp, int n) {
        int l = inp.length();
        if (l == 0) {
            return inp;
        } else if (l < 3) {
            String res = "";
            for (int i = 0; i < n; i++) {   // repeat n times
                res += inp;
            }
            return res;
        } else {
            String res = "";
            String inp1 = inp.substring(0, 3);  // first 3 chars
            for (int i = 0; i < n; i++) {
                res += inp1;
            }
            return res;
        }
    }
}
