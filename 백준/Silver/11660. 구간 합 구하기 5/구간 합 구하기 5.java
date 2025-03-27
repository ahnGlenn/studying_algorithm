import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int A[][] = new int[N+1][N+1];

        // 1. 초기 배열 생성
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=N; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 2. 합배열 생성(구간 합 구하기)
        //    (2차원 구간 합 배열을 미리 생성)
        int S[][] = new int[N+1][N+1];
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                // 구간합 = 현재값 + 위쪽 + 왼쪽 - 중복된구역
                S[i][j] = A[i][j] + S[i-1][j] + S[i][j-1] - S[i-1][j-1];
            }
        }

        // System.out.println(Arrays.deepToString(S));
        // System.out.println(Arrays.deepToString(A));

        // 3. 결과출력
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            // 전체 - 윗쪽 - 왼쪽 + 중복된곳
            int result = S[x2][y2] - S[x1 - 1][y2] - S[x2][y1 - 1] + S[x1 - 1][y1 - 1];
            System.out.println(result);
        }
    }
}