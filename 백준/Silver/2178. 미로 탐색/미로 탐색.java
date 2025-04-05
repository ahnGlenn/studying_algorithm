import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    // 상하좌우용 변수 dr(동적_행), dc(동적_열)
    static int[] dr = {-1, 1, 0 , 0}; // 행
    static int[] dc = {0, 0, -1, 1};  // 열

    // 배열 생성(방문 배열, 2차원 배열)
    static  int[][] Arr;
    static boolean[][] visited;// 중복방문을 피하기위함

    public static void main(String[] args) throws IOException {

        // 1. 입력값 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken()); // 가로 크기(행)
        int M = Integer.parseInt(token.nextToken()); // 세로 크기(열)
        Arr = new int[N][M];
        visited = new boolean[N][M];

        // 2. 2차원 배열(입력받아 좌표 생성)
        for(int i=0; i<N; i++){
            String str = br.readLine(); // 한줄씩 입력받기위한 용도
            for(int j=0; j<M; j++){
                Arr[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }

        // 3. BFS 알고리즘수행(미로의 '최소 칸 수') 이므로
        BFS(0, 0); // 시작점이 0,0이므로

        // 4. 결과 출력
        System.out.println(Arr[N-1][M-1]);
    }

    private static void BFS(int x, int y) {
        Queue<int[]> q = new LinkedList<>(); // queue 생성 >> int[]배열을 사용해 좌표를 큐에 넣을거임. (ex) {0, 0} {1, 0}
        q.add(new int[]{x, y}); // 시작지점 넣기
        visited[x][y] = true;   // 시작지점 방문처리

        // Queue가 빌 때까지 반복 (BFS의 핵심)
        while(!q.isEmpty()){
            int[] now = q.poll(); // 현재 위치의 좌표 꺼내기
            int r = now[0]; // 행값
            int c = now[1]; // 열값

            // 상하좌우 배열을 통해 값체크
            for(int i=0; i<4; i++){
                int nr = r + dr[i]; // 이동한 행
                int nc = c + dc[i]; // 이동한 열

                // 1) 범위 벗어나면 스킵
                if(nr < 0 || nc < 0 || nr >= Arr.length || nc >= Arr[0].length){
                    continue;
                }

                // 2) 방문기록 = false 이면서, 좌표값이 1인경우 이동가능
                if(!visited[nr][nc] && Arr[nr][nc] == 1){
                    visited[nr][nc] = true; // 방문처리 해주고
                    Arr[nr][nc] = Arr[r][c] + 1; // 이동한지역에 +1씩하므로 값을 저장해주는거
                    q.add(new int[]{nr, nc}); // 다음좌표에 큐 추가하기
                }
            }

        }
    }
}