import java.io.*;
import java.util.StringTokenizer;

public class Main {

    // 상하좌우용 변수 dr(동적_행), dc(동적_열)
    static int[] dr = {-1, 1, 0 , 0};  // 행
    static int[] dc = {0, 0, -1, 1};  // 열

    static int ww = 0;  // w끼리 연결된 수
    static int bb = 0;  // b끼리 연결된 수

    public static void main(String[] args) throws IOException {
        // 1. 입력값 받기
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken()); // 가로 크기(행)
        int M = Integer.parseInt(token.nextToken()); // 세로 크기(열)

        // 2. 2차원 배열 준비 후 값 (w,b)넣어주기 >> 좌표가 존재할땐 2차원배열이 편함.
        String[][] strArr = new String[M][N];
        for(int i=0; i<M; i++){
            String str = br.readLine(); // 가로 한줄씩 받기
            for(int j=0; j<N; j++){
                strArr[i][j] = String.valueOf(str.charAt(j));
            }
        }

        // 3. 방문기록 배열 생성
        boolean visited[][] = new boolean[M][N]; // Default = false;

        // 4. 배열의 좌표별로 방문 후 dfs로 진입
        int w = 0; // 우리팀
        int b = 0; // 적팀
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(!visited[i][j]){  // 방문안했을 경우
                    if(strArr[i][j].equals("W")){
                        DFS("W",i, j, strArr ,visited);
                        w += ww * ww;
                        ww = 0; // 다음 dfs를 위해 초기화
                    }else{  // 'B'인경우
                        DFS("B",i, j, strArr ,visited);
                        b += bb * bb;
                        bb = 0;
                    }
                }
            }
        }

        // 5.정답출력
        System.out.println(w + " " + b);
    }

    private static void DFS(String start, int r, int c, String[][] strArr , boolean[][] visited) {
        visited[r][c] = true; // 방문값을 true로 변경(재방문 못하게)

        // 'W,B' 일경우 추후 제곱전에 카운트를 늘려놔야함.
        if(start.equals("W")){
            ww++;
        }else{
            bb++;
        }

        // 4가지 방향을 포문으로 체크
        for(int z=0; z<4; z++){
            // 이동시켜보고 w,b있는지 체크
            int nr = r + dr[z];
            int nc = c + dc[z];

            // 배열의 범위를 넘어가지 않게하기위한 장치
            if (nr >= 0 && nr < strArr.length && nc >= 0 && nc < strArr[0].length) {
                if (!visited[nr][nc] && strArr[nr][nc].equals(start)) {
                    DFS(start, nr, nc, strArr, visited);
                }
            }
        }
    }
}