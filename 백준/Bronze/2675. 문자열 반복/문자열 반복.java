import java.util.*;

public class Main {
    public static void main(String[] args)  {
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 수행 횟수

        for(int i=0; i<T; i++){

            int R = sc.nextInt(); // 반복횟수
            String S = sc.next();

            for(int k=0; k<S.length(); k++){
                Character chr = S.charAt(k);

                for(int j=0; j<R; j++){ // R번 반복해야함.
                    sb.append(chr);
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}