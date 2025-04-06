import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr;
    static boolean[][] visited;

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int cnt = 0;  // 현재 DFS에서 찾은 음식물 크기


    public static void main(String[] args) throws IOException {
        // 1. 입력값 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken()); // 가로길이(행)
        int M = Integer.parseInt(token.nextToken()); // 세로길이(열)
        int K = Integer.parseInt(token.nextToken()); // 입력받은 음식물 갯수

        // 2. 2차원 좌표 배열판 생성
        arr = new int[N][M];
        visited = new boolean[N][M];

        // 3.음식물 좌표 K개 입력받아 배열에 표시
        for (int i = 0; i < K; i++) {
            token = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(token.nextToken()) - 1;
            int y = Integer.parseInt(token.nextToken()) - 1;

            arr[x][y] = 1;  // 해당 위치에 음식물 표시
        }

        // 4. 전체 배열을 돌며 탐색dfs 실행
        int maxSize = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j] == 1 && !visited[i][j]){
                    cnt = 1;  // 새 덩어리 시작할 때 cnt 초기화
                    DFS(i, j);
                    maxSize = Math.max(maxSize, cnt);  // 비교해서 큰덩어리 넣기
                }
            }
        }

        // 5. 결과 출력
        System.out.print(maxSize);
    }

    private static void DFS(int r, int c) {
        visited[r][c] = true;  // 방문처리

        for(int i=0; i<4; i++){
            int nr = r + dr[i]; // 이동한 행
            int nc = c + dc[i]; // 이동한 열

            // 2) 배열 안넘어가게 체크
            if(nr < 0 || nc < 0 || nr >= arr.length || nc >= arr[0].length){
                continue;
            }

            // 3) 방문기록이 false && 좌표값 == 1 인 경우 카운트 + 1
            if(!visited[nr][nc] && arr[nr][nc] == 1){
                cnt++;
                DFS(nr, nc);
            }
        }
    }
}