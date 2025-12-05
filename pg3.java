import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        boolean ans = UserMainCode.findTriplets(arr);
        System.out.println(ans);
    }
}

class UserMainCode {
    public static boolean findTriplets(int[] arr){
        for(int i = 0; i < arr.length - 2; i++){
            if(arr[i] == arr[i+1] && arr[i] == arr[i+2]){
                return true;
            }
        }
        return false;
    }
}
