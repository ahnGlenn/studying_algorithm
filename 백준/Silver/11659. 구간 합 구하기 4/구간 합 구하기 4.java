import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int suNo = Integer.parseInt(st.nextToken());// 숫자 개수
        int quizNo = Integer.parseInt(st.nextToken());// 잘의 개수

        int[] S = new int[suNo+1]; // 합배열

        st = new StringTokenizer(br.readLine());

        // 1. 합배열 구하기
        for(int i=1; i<=suNo; i++){
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }
        // 2. 구간합 구하기
        for(int q=0; q<quizNo; q++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j] - S[i-1]);
        }
    }
}