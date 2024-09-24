import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1="";
        String str2="";
        for(int i=1; i<=2; i++) {
            String str = sc.next();
            for (int j = str.length() - 1; j >= 0; j--) {
                if (i == 1) {
                    str1 += str.charAt(j);
                } else {
                    str2 += str.charAt(j);
                }
            }
        }
        int MAX = Math.max(Integer.parseInt(str1), Integer.parseInt(str2));
        System.out.println(MAX);
    }
}