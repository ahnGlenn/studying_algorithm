import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        sb.append(sc.nextLine());
        int num = sc.nextInt();

        // charAt으로 자른 문자열은 처음이 0이므로,  -1 필수
        System.out.println(sb.charAt(num-1));
    }
}