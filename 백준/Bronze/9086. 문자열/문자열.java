import java.util.*;

public class Main {
    public static void main(String[] args)  {
        // 각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다
        Scanner sc = new Scanner(System.in);
        
        // test 횟수
        int num = sc.nextInt();
        // 문자열 입력
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<num; i++){
            String str = sc.next();
            String start = String.valueOf(str.charAt(0));
            String end = String.valueOf(str.charAt(str.length()-1));

            sb.append(start + end + "\n");
        }

        System.out.print(sb);
    }
}